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
            Interfaz.EstadoAdmin.setText("Creando Telefonos");
            Interfaz.EstadoIA.setText("Espera");
            adm.createTelef();
            funcionesMassimo.resetTextPanes();
            Thread.sleep(1000);
            adm.backToQueue();
            Interfaz.EstadoAdmin.setText("Regresando a colas los refuerzos");
            Interfaz.EstadoIA.setText("Espera");
            Thread.sleep(1000);
            System.out.println("holaaaa");
            
            
            main.IA.decide();
            Interfaz.EstadoAdmin.setText("Espera");
            Interfaz.EstadoIA.setText("Decidiendo Ganador");
            Thread.sleep(11000/Time);
            funcionesMassimo.ActualizarContador();
        
            funcionesMassimo.resetTextPanes();
            
       
            funcionesMassimo.EmptyDetallesBatalla();
            
            
            
            
            
        } catch (InterruptedException ex) {
            Logger.getLogger(administrador.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
}
