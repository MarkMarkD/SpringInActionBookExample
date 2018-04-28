/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.transasia.myspring1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author banashko.dv
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-idol.xml");
    
        Performer performer = (Performer) ctx.getBean("poeticDuke");
        performer.perform();
        
        performer = (Performer) ctx.getBean("instrumentalist");
        performer.perform();
    }
}
