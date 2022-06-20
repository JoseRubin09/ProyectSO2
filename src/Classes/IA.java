/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import static Classes.main.write;
import java.util.Random;
import java.util.concurrent.TimeUnit;
//import static Classes.main.tiempodia;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Jose Rubin
 */

public class IA {
    
    
    public void decide(){
        Node n1;
        Node n2;
        int numRandom;
        Random random = new Random();
        numRandom = random.nextInt(100) + 1;

        n1 = main.adm.checkFight1();
        n2 = main.adm.checkFight2();
        System.out.println("IA DECIDIENDO");

        if(numRandom <= 40){
            //FIGHTO
            main.funcionesMassimo.ResetDetallesBatalla(n1, n2);
            System.out.println("pelearon");
         
            fight(n1,n2);
            
        }else if(numRandom > 40 && numRandom <= 67){
            //DRAW -> byebye
            System.out.println("empate");
            main.adm.backToEnd(n1);
            main.adm.backToEnd(n2);
            
        }else{
            //Refuerzo
            System.out.println("refuerzo");
            main.adm.setQueueRefuerzo(n1, n2);
        }
        
    }
    
    public void fight(Node n1, Node n2){
        
        int points1 = getPoints(n1);
        int points2 = getPoints(n2);
        if (points1 > points2){
            //FALTA AGREGAR AL GANADOR EN EL TXT
            main.funcionesMassimo.Ganador1();
            main.adm.deadNode(n1);
            main.adm.deadNode(n2);
            write.writeData(n1.getTipo());
            
        }else{
            main.adm.deadNode(n1);
            main.adm.deadNode(n2);
            main.funcionesMassimo.Ganador2();
            write.writeData(n2.getTipo());
        }
    }
    
    public int getPoints(Node n){
        
        int points = 0;
        points += getCardPoints(n.getCarta1());
        points += getCardPoints(n.getCarta2());
        points += getCardPoints(n.getCarta3());
        points += getCardPoints(n.getCarta4());
        return points;
    }
    
    public int getCardPoints(String card){
        int num = 0;
        switch(card){
            case "Comun":
                num = 1;
                break;
            case "Rara":
                num = 2;
                break;
            case "Epica":
                num = 3;
                break;
            case "Legendaria":
                num = 4;
                break;
        }
        return num;
    }
}
