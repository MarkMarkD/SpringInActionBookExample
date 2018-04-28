/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.transasia.myspring1;

import java.util.Collection;

/**
 *
 * @author banashko.dv
 */
public class OneManBand implements Performer {
private Collection<Instrument> instruments;
    
    @Override
    public void perform() {
        for(Instrument instrument : instruments) {
            instrument.play();
        }
    }
    
    public void setInstruments(Collection<Instrument> instruments) {
        this.instruments = instruments;
    }
}
