/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.networking;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tss
 */
public class App {

    public static void main(String[] args) {
        Thread th1 = new Thread(new Work());
        th1.start();
        Thread th2 = new Thread(new Work1());
        th2.start();
        for (int i = 0; i < 150; i++) {
            try {
                Thread.sleep(5);
            } catch (InterruptedException ex) {
                Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("********* App ************  " + i);
        }
    }
}

class Work implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 80; i++) {
            try {
                Thread.sleep(10);
                System.out.println("***************** Work ************************  " + i);
            } catch (InterruptedException ex) {
                Logger.getLogger(Work.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}

class Work1 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 80; i++) {
            try {
                Thread.sleep(10);
                System.out.println("---------------- Work1  ---------------- " + i);
            } catch (InterruptedException ex) {
                Logger.getLogger(Work.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
