/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomizer;

import java.util.Random;

/**
 * The RNG class allows for random number generation and has been setup to 
 * put the numbers out in an interesting fashion...
 * 
 * @author Kevin
 */
public class RandomNumberGenerator implements Runnable {    
    //A constructor may be handy...
    
    @Override
    public void run() {
        Random ran = new Random();
        int maximum = 1000;
        int minimum = 0;
        int n = maximum - minimum + 1;
        
        for (int it = 1; it <= 1024; it++) {
            int x = ran.nextInt((maximum - minimum) + 1) + minimum;
            it *= 2;
            //Add something here to allow for passing numbers through threads
            try {
                Thread.sleep(it);
            } catch (Exception e) {
                System.err.println("Error pausing the thread...");
                e.printStackTrace();
            }
        } 
    }
}
