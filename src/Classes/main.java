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

    public static Telefono telefono1 = new Telefono();
    public static Node newNode;
    public static Queue<Node> cola1P1 = new LinkedList<>();
    public static Queue<Node> cola2P1 = new LinkedList<>();
    public static Queue<Node> cola3P1 = new LinkedList<>();
    public static Queue<Node> cola1P2 = new LinkedList<>();
    public static Queue<Node> cola2P2 = new LinkedList<>();
    public static Queue<Node> cola3P2 = new LinkedList<>();
    public static Queue<Node> colaRefuerzoP1 = new LinkedList<>();
    public static Queue<Node> colaRefuerzoP2 = new LinkedList<>();
    /**
     * @param args the command line arguments
     */
    
    public static Interfaz Interfaz = new Interfaz();
    
    public static funcionesMassimo funcionesMssimo = new funcionesMassimo();
 
    
    public static void main(String[] args) {
        // TODO code application logic here
        Interfaz.setVisible(true);
        
        

       
        

        
        //funcionesMssimo.resetTextPanes();
        

        
        
        
        
        
        
        




  
                
        
                //InterfazPlantas.countdownJOSE.setText(Integer.toString(Main.contadorMassimo));  
        
        
        
        for(int i=0; i<3;i++){
            newNode = telefono1.settingNode(i);
            System.out.println(newNode.getCopas());
        }
    }
    
}
