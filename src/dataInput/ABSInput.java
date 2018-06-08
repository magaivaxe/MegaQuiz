/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataInput;

import java.util.Random;

/**
 *
 * @author mpgsa
 */
public abstract class ABSInput {
    // Fields
    final int NUM_MULT_QUESTIONS = 4;
    // Objects
    public Random rd;
    // Constructor
    public ABSInput() {
        rd = new Random();
    }
    
    /**
     * Method to check if {@code x} and {@code y} are equals. If true <br>
     * return a new {@code y} choose.
     * @param x integer choose before
     * @param y maybe an integer to choice
     * @param size sample to choice
     * @return a integer among size
     */
    public int noEqualsIntegers(int x, int y, int size){
        //
        while (x == y) {                    
            y = rd.nextInt(size);
        }
        return y;
    }
}
