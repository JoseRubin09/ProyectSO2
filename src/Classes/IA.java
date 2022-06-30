/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import static Classes.main.write;
import interfaces.Interfaz;
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
        Interfaz.EstadoIA.setText("Decidiendo");
        
        Interfaz.DesicionIA.setText("");
        //CONTADOR A 0
        n1.setCountdown(0);
        n2.setCountdown(0);
        //CONTADOR A 0

        if(numRandom <= 40){
            //FIGHTO
            Interfaz.EstadoIA.setText("Decidiendo Ganador");
            main.funcionesMassimo.ResetDetallesBatalla(n1, n2);
            System.out.println("pelearon");
            Interfaz.DesicionIA.setText("Pelea");
            //Cartas ON
            main.funcionesMassimo.showcard1(n1);
            main.funcionesMassimo.showcard2(n2);
            main.funcionesMassimo.showarena(n1, n2);
            
            fight(n1,n2);
            
        }else if(numRandom > 40 && numRandom <= 67){
            //DRAW -> byebye
            System.out.println("empate");
            Interfaz.DesicionIA.setText("Empate");
            main.adm.backToEnd(n1);
            main.adm.backToEnd(n2);
            
        }else{
            //Refuerzo
            System.out.println("refuerzo");
            Interfaz.DesicionIA.setText("Refuerzo");
            main.adm.setQueueRefuerzo(n1, n2);
        }
        
    }
    
    public void fight(Node n1, Node n2){
        
        int points1 = getPoints(n1);
        int points2 = getPoints(n2);
        if (points1 > points2){
            
            
            //FALTA AGREGAR AL GANADOR EN EL TXT
            //meterentxt(n1)
            
            main.funcionesMassimo.Ganador1();
            main.adm.deadNode(n1);
            main.adm.deadNode(n2);
            write.writeData(n1.getTipo());
            
        }else if(points1 < points2){
            //meterentxt(n2)
            main.adm.deadNode(n1);
            main.adm.deadNode(n2);
            main.funcionesMassimo.Ganador2();
            write.writeData(n2.getTipo());
        }else{
            
            main.adm.backToEnd(n1);
            main.adm.backToEnd(n2);
            main.funcionesMassimo.Empate1();
            main.funcionesMassimo.Empate2();
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
