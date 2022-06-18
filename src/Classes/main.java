package Classes;

import interfaces.Interfaz;
import java.util.Random;

import java.util.LinkedList;
import java.util.Queue;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jose Rubin
 */
public class main {

    /**
     * @param args the command line arguments
     */
    
    public static Interfaz Interfaz = new Interfaz();
    public static Queue<nodito> queue = new LinkedList<>();
    public static funcionesMassimo funcionesMssimo = new funcionesMassimo();
 
    
    public static void main(String[] args) {
        // TODO code application logic here
        Interfaz.setVisible(true);
        
        Interfaz.Tiempo.setText("puta");
        crearNodo nod = new crearNodo();
        
        
     
  
        System.out.println("Added Queue in memory: " +queue); 
        
        
        for (int i = 0; i < 3; i++) {
            queue.add(nod.setnodo(i));
            
        }
        /*
        for (int i = 0; i < 3; i++) {
            System.out.println(queue.peek().getId());
            System.out.println(queue.peek().getPlanta());
            System.out.println(queue.peek().getCountdown());
            System.out.println(queue.peek().getCopas());
            System.out.println(queue.peek().getCarta1());
            System.out.println(queue.peek().getCarta2());
            System.out.println(queue.peek().getCarta3());
            System.out.println(queue.peek().getCarta4());
            queue.remove();
            
            
        }
*/
       
        
        Queue<Integer> queue2 = new LinkedList<Integer>();
        queue2.add(1);
        queue2.add(2);
        queue2.add(3);
 
        for (Integer item: queue2) {
            System.out.println(item);
        }
        
        funcionesMssimo.resetTextPanes();
        

        
        
        
        
        
        
        




  
                
        
                //InterfazPlantas.countdownJOSE.setText(Integer.toString(Main.contadorMassimo));  
    }
    
}
