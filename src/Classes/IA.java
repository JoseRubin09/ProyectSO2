/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.Random;

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
        if(numRandom <= 40){
            //FIGHTO
            fight(n1,n2);
            
        }else if(numRandom > 40 && numRandom <= 67){
            //DRAW -> byebye
            main.adm.backToEnd(n1);
            main.adm.backToEnd(n2);
            
        }else{
            //Refuerzo
            main.adm.setQueueRefuerzo(n1, n2);
        }
        
    }
    
    public void fight(Node n1, Node n2){
        
        int points1 = getPoints(n1);
        int points2 = getPoints(n2);
        if (points1 > points2){
            //FALTA AGREGAR AL GANADOR EN EL TXT
            main.adm.deadNode(n1);
            main.adm.deadNode(n2);
            
        }else{
            main.adm.deadNode(n1);
            main.adm.deadNode(n2);
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
