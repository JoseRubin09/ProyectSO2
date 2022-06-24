package Classes;
import interfaces.Interfaz;
import java.util.Random;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    public static Telefono telefono2 = new Telefono();
    public static admin adm = new admin();
    public static IA IA = new IA();
    public static Node newNode;
    public static Queue<Node> cola1P1 = new LinkedList<>();
    public static Queue<Node> cola2P1 = new LinkedList<>();
    public static Queue<Node> cola3P1 = new LinkedList<>();
    public static Queue<Node> cola1P2 = new LinkedList<>();
    public static Queue<Node> cola2P2 = new LinkedList<>();
    public static Queue<Node> cola3P2 = new LinkedList<>();
    public static Queue<Node> colaRefuerzoP1 = new LinkedList<>();
    public static Queue<Node> colaRefuerzoP2 = new LinkedList<>();
    public static int tiempodia;
    public static ReadFile txtAction = new ReadFile();
    public static WriteFile write = new WriteFile();

    //public static administrador administrador = new administrador();
     public static administrador Threadadm;
    /**
     * @param args the command line arguments
     */
    
    public static Interfaz Interfaz = new Interfaz();
    
    public static funcionesMassimo funcionesMassimo = new funcionesMassimo();
 
   
    public static void main(String[] args) {
        // TODO code application logic here
        //funcionesMssimo.resetTextPanes();
        
                //InterfazPlantas.countdownJOSE.setText(Integer.toString(Main.contadorMassimo));  
       
        
        
        Interfaz.setVisible(true);
        funcionesMassimo.arenasOff();
        funcionesMassimo.cartasOff(); 



        
         /*
        adm.createTelef();
        for(int i=0; i<3;i++){
            newNode = telefono1.settingNode(i);
            System.out.println(newNode.getCopas());
        }

        //CODIGO PRUEBA PARA SETTEXTFIELDS
        for (int i = 0; i < 5; i++) {
            
            cola1P1.add(telefono1.settingNode(i));
        }
        
        
        for (int i = 6; i < 10; i++) {
            
            cola2P1.add(telefono1.settingNode(i));
        }
        for (int i = 12; i < 15; i++) {
            
            cola3P1.add(telefono1.settingNode(i));
        }

        
                
        //CODIGO PRUEBA PARA SETTEXTFIELDS
        for (int i = 0; i < 5; i++) {
            
            cola1P2.add(telefono1.settingNode(i));
        }
        
        
        for (int i = 6; i < 10; i++) {
            
            cola2P2.add(telefono1.settingNode(i));
            
        }
        for (int i = 12; i < 15; i++) {
            
            cola3P2.add(telefono1.settingNode(i));
        }
        
        

 */
         
         
        
    }
    
}
