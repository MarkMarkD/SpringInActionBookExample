/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.transasia.myspring1;

import org.springframework.stereotype.Component;

/**
 *
 * @author banashko.dv
 */
@Component
public class Saxophone implements Instrument {

    @Override
    public void play() {
        System.out.println("TOOT TOOT TOOT");
    }
    
    
    
}
