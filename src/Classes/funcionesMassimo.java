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



/**
 *
 * @author massimo
 */
public class funcionesMassimo {
    
    public void resetTextPanes(){
        //SET COLA1P1
        String text1 = "    ";
        
        for (Node item: cola1P1) {
            
            text1+=Integer.toString(item.getPlanta())+"    \n-----\n    ";
            //Interfaz.Planta1Cola3Text1.setText(Integer.toString(item.getPlanta()));
        }

        Interfaz.Planta1Cola1.setText(text1);
        
        //SET COLA2P1
        String text2 = "    ";
        
        for (Node item: cola2P1) {
            
            text2+=Integer.toString(item.getPlanta())+"    \n-----\n    ";
            //Interfaz.Planta1Cola3Text1.setText(Integer.toString(item.getPlanta()));
        }

        Interfaz.Planta1Cola2.setText(text2);
        
        //SET COLA3P1
        String text3 = "   ";
        
        for (Node item: cola3P1) {
            
            text3+=Integer.toString(item.getPlanta())+" \n-----\n    ";
            //Interfaz.Planta1Cola3Text1.setText(Integer.toString(item.getPlanta()));
        }

        Interfaz.Planta1Cola3.setText(text3);
        
        //SET COLA1P2
        String text4 = "    ";
        
        for (Node item: cola1P2) {
            
            text4+=Integer.toString(item.getPlanta())+"   \n-----\n    ";
            //Interfaz.Planta1Cola3Text1.setText(Integer.toString(item.getPlanta()));
        }

        Interfaz.Planta2Cola1.setText(text4);
        
        //SET COLA2P2
        String text5 = "    ";
        
        for (Node item: cola2P2) {
            
            text5+=Integer.toString(item.getPlanta())+"    \n-----\n    ";
            //Interfaz.Planta1Cola3Text1.setText(Integer.toString(item.getPlanta()));
        }

        Interfaz.Planta2Cola2.setText(text5);
        
        //SET COLA3P2
        String text6 = "   ";
        
        for (Node item: cola3P2) {
            
            text6+=Integer.toString(item.getPlanta())+" \n-----\n    ";
            //Interfaz.Planta1Cola3Text1.setText(Integer.toString(item.getPlanta()));
        }

        Interfaz.Planta2Cola3.setText(text6);
        
    }
    
}
