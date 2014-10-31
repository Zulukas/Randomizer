/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomizer;

import java.util.Random;

/**
 *
 * @author Kevin
 */
public class RandomNumberGenerator implements Runnable {
    private String number;
    private Integer i;
    private final Updater updater;
    public boolean update;
    
    public RandomNumberGenerator(Updater updater) {
        this.updater = updater;
    }
    
    @Override
    public void run() {
        Random ran = new Random();
        int maximum = 1000;
        int minimum = 0;
        int n = maximum - minimum + 1;
        
        for (int it = 1; it <= 1024; it++) {
            i = ran.nextInt((maximum - minimum) + 1) + minimum;
            it *= 2;
            updater.update(i);
            try {
                Thread.sleep(it);
            } catch (Exception e) {
                System.err.println("Error pausing the thread...");
            }
        } 
    }
}
