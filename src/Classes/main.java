package Classes;
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
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for(int i=0; i<3;i++){
            newNode = telefono1.settingNode(i);
            System.out.println(newNode.getCopas());
        }
    }
    
}
