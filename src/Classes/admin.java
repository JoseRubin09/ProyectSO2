/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.Random;

/**
 *
 * @author Jose Rubin and MASSIMO EN DISCORD
 */
public class admin {
    Node Telef1;
    Node Telef2;
    
    
    public Node checkFight1(){
        
        
        if(!main.cola1P1.isEmpty()){
            Telef1 = main.cola1P1.peek();
            Telef1.setCola(11);
            
        }else if (!main.cola2P1.isEmpty()){
            Telef1 = main.cola2P1.peek();
            Telef1.setCola(21);

        }else if (!main.cola3P1.isEmpty()){
            Telef1 = main.cola3P1.peek();
            Telef1.setCola(31);

        }
        return Telef1;
    }
    
    public Node checkFight2(){
        
        if(!main.cola1P2.isEmpty()){
            Telef2 = main.cola1P2.peek();
            Telef2.setCola(12);

        }else if (!main.cola2P2.isEmpty()){
            Telef2 = main.cola2P2.peek();
            Telef2.setCola(22);

        }else if (!main.cola3P2.isEmpty()){
            Telef2 = main.cola3P2.peek();
            Telef2.setCola(32);

        }
        
        return Telef2;
    }
    
    public void asignarQueue(Node n){
        if (n.getPlanta() == 1){
            if(n.getCopas() >= 3000){
                main.cola1P1.add(n);
            } else if(n.getCopas() >= 2000){
                main.cola2P1.add(n);
            } else if(n.getCopas() < 2000){
                main.cola3P1.add(n);
            }
        }else{
            if(n.getCopas() >= 3000){
                main.cola1P2.add(n);
            } else if(n.getCopas() >= 2000){
                main.cola2P2.add(n);
            } else if(n.getCopas() < 2000){
                main.cola3P2.add(n);
            }
        }
    }
    
    public void createTelef(){
        
        asignarQueue(main.telefono1.settingNode(1));
        asignarQueue(main.telefono1.settingNode(2));
        
    }
    
    public void createTelefRandom(){
        int numRandom;
        Random random = new Random();
        numRandom = random.nextInt(100) + 1;
        if (numRandom <= 70){
           asignarQueue(main.telefono1.settingNode(1));
           asignarQueue(main.telefono1.settingNode(2)); 
        }
    }
    
    public void setQueueRefuerzo(Node n1, Node n2){
        
        switch (n1.getCola()) {
            case 11:
                main.cola1P1.remove();
                main.colaRefuerzoP1.add(n1);
                break;
            case 21:
                main.cola2P1.remove();
                main.colaRefuerzoP1.add(n1);
                break;
            case 31:
                main.cola3P1.remove();
                main.colaRefuerzoP1.add(n1);
                break;
            default:
                break;
        }
        
        switch (n2.getCola()) {
            case 12:
                main.cola1P2.remove();
                main.colaRefuerzoP2.add(n2);
                break;
            case 22:
                main.cola2P2.remove();
                main.colaRefuerzoP2.add(n2);
                break;
            case 32:
                main.cola3P2.remove();
                main.colaRefuerzoP2.add(n2);
                break;
            default:
                break;
        }
    }
    
    public void backToQueue(){
        Node n;
        Node n2;
        int numRandom;
        Random random = new Random();
        numRandom = random.nextInt(100) + 1;
        if(numRandom <= 40){
            n = main.colaRefuerzoP1.poll();
            asignarQueue(n);
            
            n2 = main.colaRefuerzoP2.poll();
            asignarQueue(n2);
        }
    }
    
    public void backToEnd(Node n){
        
            switch (n.getCola()) {
            case 11:
                main.cola1P1.add(main.cola1P1.poll());
                break;
            case 21:
                main.cola2P1.add(main.cola1P1.poll());
                break;
            case 31:
                main.cola3P1.add(main.cola1P1.poll());
               break;
            case 12:
                main.cola1P2.add(main.cola1P1.poll());
                break;
            case 22:
                main.cola2P2.add(main.cola1P1.poll());
                break;
            case 32:
                main.cola3P2.add(main.cola1P1.poll());
                break;
            default:
                break;
        }
    }      
    
    public void deadNode(Node n){
            switch (n.getCola()) {
            case 11:
                main.cola1P1.remove();
                break;
            case 21:
                main.cola2P1.remove();
                break;
            case 31:
                main.cola3P1.remove();
                break;
            case 12:
                main.cola1P2.remove();
                break;
            case 22:
                main.cola2P2.remove();
                break;
            case 32:
                main.cola3P2.remove();
                break;
            default:
                break;
        }
    }
}
