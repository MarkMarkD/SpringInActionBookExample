/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.transasia.myspring1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 *
 * @author banashko.dv
 */
@Component
public class Instrumentalist implements Performer {
    
    private String song;
    
    @Autowired
    @Qualifier("piano")
    private Instrument instrument;
    
    public void perform() {
        System.out.println("Playing " + song + ": ");
        instrument.play();
    }
        
    public void setSong(String song) {
        this.song = song;
    }
    
    public String getSong() {
        return song;
    }
    
    public String screamSong() {
        return song;
    }
    
        public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }
    
}
