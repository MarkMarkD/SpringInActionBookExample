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
public class Sonnet29 implements Poem {
    private static String[] LINES = {"some poem, ", "poem continuing, ", "la-la-la."};
    
    public Sonnet29() {
        
    }
    
    public void recite() {
        for (int i = 0; i < LINES.length; i++) {
            System.out.println(LINES[i]);
        }
    }
}
