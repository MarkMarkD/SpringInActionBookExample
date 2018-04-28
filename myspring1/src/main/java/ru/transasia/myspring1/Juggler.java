/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.transasia.myspring1;

/**
 *
 * @author banashko.dv
 */
public class Juggler implements Performer {
    private int beanBags = 3;
    
    public Juggler() {
        
    }
    
    public Juggler(int beanBags) {
        this.beanBags = beanBags;
    }
    
    public void perform() {
        System.out.println("JUGGLING " + beanBags + " BEANBAGS");
    }
    
}
