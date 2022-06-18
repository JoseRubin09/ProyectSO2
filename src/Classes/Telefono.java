/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import static java.lang.Math.random;
import java.util.Random;

/**
 *
 * @author Jose Rubin
 */
public class Telefono {
    
    String id; 
    int copas;
    int planta;
    int countdown;
    String tipo;
    String carta1;
    String carta2;
    String carta3;
    String carta4;

    public String getNewId(){
        
        for (int i = 0; i<4; i++){
            id += (int)(Math.random()*10);
        }
        return id;
    }
    
    private int getPriority(int planta){
        int numRandom;
        Random random = new Random();
        copas = 0;
        if (planta == 1){
            //Camara 80%
            numRandom = random.nextInt(100) + 1;
            if (numRandom <= 80) copas+=1000;
            //Pantalla 75%
            numRandom = random.nextInt(100) + 1;
            if (numRandom <= 75) copas+=500;
            //Pin Carga 84%
            numRandom = random.nextInt(100) + 1;
            if (numRandom <= 84) copas+=500;
            //Botones 85%
            numRandom = random.nextInt(100) + 1;
            if (numRandom <= 85) copas+=1000;
            
        }else{
            //Camara 80%
            numRandom = random.nextInt(100) + 1;
            if (numRandom <= 80) copas+=1600;
            //Pantalla 75%
            numRandom = random.nextInt(100) + 1;
            if (numRandom <= 75) copas+=400;
            //Pin Carga 84%
            numRandom = random.nextInt(100) + 1;
            if (numRandom <= 84) copas+=400;
            //Botones 85%
            numRandom = random.nextInt(100) + 1;
            if (numRandom <= 85) copas+=1200;
        }
        return copas;
    }
    
    public void shuffleDeck(){
        
        for (int i = 1; i<5; i++){
            String [] arr = {"Legendaria", "Epica", "Rara", "Comun"};
            Random random = new Random();

            // randomly selects an index from the arr
            int select = random.nextInt(arr.length); 
            switch (String.valueOf(i)){
                case "1":
                    carta1 = arr[select];
                    break;
                case "2":
                    carta2 = arr[select];
                    break;
                case "3":
                    carta3 = arr[select];
                    break;
                case "4":
                    carta4 = arr[select];
                    break;
            }
        }
    }
    
    public void showCards(){
        System.out.println(carta1);
        System.out.println(carta2);
        System.out.println(carta3);
        System.out.println(carta4);
    }
    
    public Node settingNode(int planta){
        this.shuffleDeck();
        id = this.getNewId();
        copas = this.getPriority(planta);
        Node newNode = new Node(id, copas, planta, countdown, tipo, carta1, carta2, carta3, carta4);
        return newNode;
    }
}
