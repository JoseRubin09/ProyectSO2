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
        //SET COLA1P1
        
        /*        
        if (item.getCountdown()<8) {
                item.setCountdown(item.getCountdown()+1);
            }else{
                item.setCountdown(0);
                int copas =item.getCopas();
                if(copas >= 3000){
                
                } else if(copas >= 2000){
                    item.setCopas(3100);
                    main.cola1P1.add(item);
                    main.cola2P1.remove(item);

                } else if(copas < 2000){
                    item.setCopas(2100);
                    main.cola2P1.add(item);
                    main.cola3P1.remove(item);
                }
            }
        */


        
        
        //SET COLA2P1
        
        
        for (Node item: cola2P1) {
            
            if (item.getCountdown()<8) {
                System.out.println("menor 8 cola 2 p1");
                item.setCountdown(item.getCountdown()+1);
                
            }else{
    
                    item.setCopas(3100);
                    item.setCountdown(0);
                    
                    //main.cola2P1.remove(item);
                    System.out.println("remueve cola2p1");
                    main.cola1P1.add(item);
                    System.out.println("add cola2p1");
                    
                    

    
            }
        }

        
        
        //SET COLA3P1
        
        
        for (Node item: cola3P1) {
            
            if (item.getCountdown()<8) {
               System.out.println("menor 8 cola 3 p1");

                item.setCountdown(item.getCountdown()+1);
            }else{
    
                    item.setCopas(2100);
                    item.setCountdown(0);
                    
                    //main.cola3P1.remove(item);
                    System.out.println("remueve cola3p1");
                    main.cola2P1.add(item);
                    System.out.println("add cola3p1");
                    
                  

    
            }
           
            
        }

        

        
        //SET COLA2P2
        
        for (Node item: cola2P2) {
            if (item.getCountdown()<8) {
                System.out.println("menor 8 cola 2 p2");
                item.setCountdown(item.getCountdown()+1);
            }else{
    
                    item.setCopas(3100);
                    item.setCountdown(0);
                    //main.cola2P2.remove(item);
                    System.out.println("remueve cola2p2");
                    main.cola1P2.add(item);
                    System.out.println("add cola2p2");
                    
                    

    
            }
        }

        
        //SET COLA3P2
       
        
        for (Node item: cola3P2) {
            if (item.getCountdown()<8) {
                System.out.println("menor 8 cola 3 p2");
                item.setCountdown(item.getCountdown()+1);
            }else{
    
                    item.setCopas(2100);
                    item.setCountdown(0);
                    //main.cola3P2.remove(item);
                    System.out.println("remueve cola3p2");
                    main.cola2P2.add(item);
                    System.out.println("add cola3p2");
                    
                    

    
            }
        }
        

    }
    
    public boolean ColasVacias(){
            
        if ((cola1P2.isEmpty()&&cola2P2.isEmpty()&&cola3P2.isEmpty() )    ||   (cola1P1.isEmpty()&&cola2P1.isEmpty()&&cola3P1.isEmpty())) {
            
            return true;
        }
        return false;
        
                  
            
    }
    
    public static boolean isNumeric(String str) { 
        try {  
        Double.parseDouble(str);  
        return true;
        } catch(NumberFormatException e){  
            return false;  
            }  
}
}
