/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author massimo
 */
public class crearNodo {
    public String ID = "4";
    public int copas = 1000;
    
    public int countdown = 1000;
    public String carta1 = "epic";
    public String carta2 = "nula";
    public String carta3 = "mejor";
    public String carta4 = "peor";

    
    
            
    
    public nodito setnodo(int planta){
        
        
       
        nodito nodo1 = new nodito(ID,copas,planta,countdown,carta1,carta2,carta3,carta4);
        return nodo1;
    }
} 
