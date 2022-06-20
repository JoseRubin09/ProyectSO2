/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;
import static Classes.main.Interfaz;
import static Classes.main.adm;
import static Classes.main.funcionesMassimo;
import interfaces.Interfaz;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author massimo
 */
public class administrador extends Thread{
    public boolean stop;
    
    public administrador (){
        this.stop = true;
        
    }
    public void stopToggle(){
        this.stop = !this.stop;
    }
    public void run(){
    while (this.stop){
        try {
            int Time= Integer.parseInt(Interfaz.tiempodia.getText());
            adm.createTelef();
            funcionesMassimo.resetTextPanes();
            System.out.println("holaaaa");
            
            
            main.IA.decide();
            Thread.sleep(11000/Time);
        
            funcionesMassimo.resetTextPanes();
            
       
            funcionesMassimo.EmptyDetallesBatalla();
            
            
            
            
            
        } catch (InterruptedException ex) {
            Logger.getLogger(administrador.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
}
