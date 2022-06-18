/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author Jose Rubin
 */
public class Node {
    
    private String id; 
    private int copas;
    private int planta;
    private int countdown;
    private String carta1;
    private String carta2;
    private String carta3;
    private String carta4;
    private Node next;
    
    public Node(String id,int copas,int planta,int countdown,String carta1,String carta2,String carta3,String carta4) {
    this.id = id;
    this.copas = copas;
    this.planta = planta;
    this.countdown = countdown;
    this.carta1 = carta1;
    this.carta2 = carta2;
    this.carta3 = carta3;
    this.carta4 = carta4;
    }
    
    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the copas
     */
    public int getCopas() {
        return copas;
    }

    /**
     * @param copas the copas to set
     */
    public void setCopas(int copas) {
        this.copas = copas;
    }

    /**
     * @return the planta
     */
    public int getPlanta() {
        return planta;
    }

    /**
     * @param planta the planta to set
     */
    public void setPlanta(int planta) {
        this.planta = planta;
    }

    /**
     * @return the countdown
     */
    public int getCountdown() {
        return countdown;
    }

    /**
     * @param countdown the countdown to set
     */
    public void setCountdown(int countdown) {
        this.countdown = countdown;
    }

    /**
     * @return the carta1
     */
    public String getCarta1() {
        return carta1;
    }

    /**
     * @param carta1 the carta1 to set
     */
    public void setCarta1(String carta1) {
        this.carta1 = carta1;
    }

    /**
     * @return the carta2
     */
    public String getCarta2() {
        return carta2;
    }

    /**
     * @param carta2 the carta2 to set
     */
    public void setCarta2(String carta2) {
        this.carta2 = carta2;
    }

    /**
     * @return the carta3
     */
    public String getCarta3() {
        return carta3;
    }

    /**
     * @param carta3 the carta3 to set
     */
    public void setCarta3(String carta3) {
        this.carta3 = carta3;
    }

    /**
     * @return the carta4
     */
    public String getCarta4() {
        return carta4;
    }

    /**
     * @param carta4 the carta4 to set
     */
    public void setCarta4(String carta4) {
        this.carta4 = carta4;
    }

    /**
     * @return the next
     */
    public Node getNext() {
        return next;
    }

    /**
     * @param next the next to set
     */
    public void setNext(Node next) {
        this.next = next;
    }
    
}

