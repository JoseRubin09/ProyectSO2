/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import static Classes.main.Interfaz;
import static Classes.main.cola1P1;
import static Classes.main.cola1P2;
import static Classes.main.cola2P1;
import static Classes.main.cola2P2;
import static Classes.main.cola3P1;
import static Classes.main.cola3P2;
import static Classes.main.colaRefuerzoP1;
import static Classes.main.colaRefuerzoP2;
import java.util.ArrayList;
import java.util.Arrays;



/**
 *
 * @author massimo
 */
public class funcionesMassimo {
    
    public void resetTextPanes(){
        //SET COLA1P1
        String text1 = "    ";
        
        for (Node item: cola1P1) {
            
            text1+=item.getId()+"    \n-----\n    ";
            //Interfaz.Planta1Cola3Text1.setText(Integer.toString(item.getPlanta()));
        }

        Interfaz.Planta1Cola1.setText(text1);
        
        //SET COLA2P1
        String text2 = "    ";
        
        for (Node item: cola2P1) {
            
            text2+=item.getId()+"    \n-----\n    ";
            //Interfaz.Planta1Cola3Text1.setText(Integer.toString(item.getPlanta()));
        }

        Interfaz.Planta1Cola2.setText(text2);
        
        //SET COLA3P1
        String text3 = "   ";
        
        for (Node item: cola3P1) {
            
            text3+=item.getId()+" \n-----\n    ";
            //Interfaz.Planta1Cola3Text1.setText(Integer.toString(item.getPlanta()));
        }

        Interfaz.Planta1Cola3.setText(text3);
        
        //SET COLA1P2
        String text4 = "    ";
        
        for (Node item: cola1P2) {
            
            text4+=item.getId()+"   \n-----\n    ";
            //Interfaz.Planta1Cola3Text1.setText(Integer.toString(item.getPlanta()));
        }

        Interfaz.Planta2Cola1.setText(text4);
        
        //SET COLA2P2
        String text5 = "    ";
        
        for (Node item: cola2P2) {
            
            text5+=item.getId()+"    \n-----\n    ";
            //Interfaz.Planta1Cola3Text1.setText(Integer.toString(item.getPlanta()));
        }

        Interfaz.Planta2Cola2.setText(text5);
        
        //SET COLA3P2
        String text6 = "   ";
        
        for (Node item: cola3P2) {
            
            text6+=item.getId()+" \n-----\n    ";
            //Interfaz.Planta1Cola3Text1.setText(Integer.toString(item.getPlanta()));
        }

        Interfaz.Planta2Cola3.setText(text6);
        //Integer.toString(item.getPlanta())
        
        String text7 = "   ";
        for (Node item: colaRefuerzoP1) {
            
            text7+=item.getId()+" \n-----\n    ";
            //Interfaz.Planta1Cola3Text1.setText(Integer.toString(item.getPlanta()));
        }

        Interfaz.Refuerzo1.setText(text7);
        
        String text8 = "   ";
        for (Node item: colaRefuerzoP2) {
            
            text8+=item.getId()+" \n-----\n    ";
            //Interfaz.Planta1Cola3Text1.setText(Integer.toString(item.getPlanta()));
        }

        Interfaz.Refuerzo2.setText(text8);
        
        
        
    }
    
    public void ResetDetallesBatalla(Node n1, Node n2){
        
        Interfaz.Telefono1.setText(n1.getId());
        Interfaz.T1Carta1.setText(n1.getCarta1());
        Interfaz.T1Carta2.setText(n1.getCarta2());
        Interfaz.T1Carta3.setText(n1.getCarta3());
        Interfaz.T1Carta4.setText(n1.getCarta4());
        
        
        Interfaz.Telefono2.setText(n2.getId());
        Interfaz.T2Carta1.setText(n2.getCarta1());
        Interfaz.T2Carta2.setText(n2.getCarta2());
        Interfaz.T2Carta3.setText(n2.getCarta3());
        Interfaz.T2Carta4.setText(n2.getCarta4());
    }
    
    public void EmptyDetallesBatalla(){
        
        Interfaz.Telefono1.setText("");
        Interfaz.T1Carta1.setText("");
        Interfaz.T1Carta2.setText("");
        Interfaz.T1Carta3.setText("");
        Interfaz.T1Carta4.setText("");
        Interfaz.Ganador1.setText("");
        
        Interfaz.Telefono2.setText("");
        Interfaz.T2Carta1.setText("");
        Interfaz.T2Carta2.setText("");
        Interfaz.T2Carta3.setText("");
        Interfaz.T2Carta4.setText("");
        Interfaz.Ganador2.setText("");
    }
        
        public void Ganador1(){
        
      
        Interfaz.Ganador1.setText("Ganador");
        
  
    } 
        public void Ganador2(){
        
      
        Interfaz.Ganador2.setText("Ganador");
        
  
    }    
        
        
        
    public void ActualizarContador(){
        

        //cola2 pa cola1 P1
        ArrayList arrayCola2P1 = new ArrayList();
        Node n;
        Object[] objects =  main.cola2P1.toArray();
        arrayCola2P1.addAll(Arrays.asList(objects));
        for(int i = 0; i<arrayCola2P1.size();i++){
            n = (Node) arrayCola2P1.get(i);
            if (n.getCountdown()<8){
                n.setCountdown(n.getCountdown()+1);
            }else{
                n.setCountdown(0);
                cola2P1.remove(n);
                cola1P1.add(n);
                System.out.println("LO AGREGUE A LA OTRA COLA?? " + n.getId());
            }
        }
        
        //cola3 pa cola2 P1
       ArrayList arrayCola3P1 = new ArrayList();
        Node n2;
        Object[] objects2 =  main.cola3P1.toArray();
        arrayCola3P1.addAll(Arrays.asList(objects2));
        for(int i = 0; i<arrayCola3P1.size();i++){
            n2 = (Node) arrayCola3P1.get(i);
            if (n2.getCountdown()<8){
                n2.setCountdown(n2.getCountdown()+1);
            }else{
                n2.setCountdown(0);
                cola3P1.remove(n2);
                cola2P1.add(n2);
                System.out.println("LO AGREGUE A LA OTRA COLA?? " + n2.getId());
            }
        }

        //cola2 pa cola1 P2
        ArrayList arrayCola2P2 = new ArrayList();
        Node n3;
        Object[] objects3 =  main.cola2P2.toArray();
        arrayCola2P2.addAll(Arrays.asList(objects3));
        for(int i = 0; i<arrayCola2P2.size();i++){
            n3 = (Node) arrayCola2P2.get(i);
            if (n3.getCountdown()<8){
                n3.setCountdown(n3.getCountdown()+1);
            }else{
                n3.setCountdown(0);
                cola2P2.remove(n3);
                cola1P2.add(n3);
                System.out.println("LO AGREGUE A LA OTRA COLA?? " + n3.getId());
            }
        }



        //cola3 pa cola2 p2
        ArrayList arrayCola3P2 = new ArrayList();
        Node n4;
        Object[] objects4 =  main.cola3P2.toArray();
        arrayCola3P2.addAll(Arrays.asList(objects4));
        for(int i = 0; i<arrayCola3P2.size();i++){
            n4 = (Node) arrayCola3P2.get(i);
            if (n4.getCountdown()<8){
                n4.setCountdown(n4.getCountdown()+1);
            }else{
                n4.setCountdown(0);
                cola3P2.remove(n4);
                cola2P2.add(n4);
                System.out.println("LO AGREGUE A LA OTRA COLA?? " + n4.getId());
            }
        }
    }
}
