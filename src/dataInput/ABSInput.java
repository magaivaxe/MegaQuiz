/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataInput;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mpgsa
 */
public abstract class ABSInput{
    // Fields
    final int NUM_MULT_QUESTIONS = 4;
    final int STATUS_EXIT = 0;
    final String EXIT = "exit";
    final String CHANGE_GAME = "change";
    final String CHANGE_PLAYER = "change player";
    // Objects
    public Random random;
    public Scanner sc;
    // Constructor
    public ABSInput() {
        random = new Random();
        sc = new Scanner(System.in);
    }
    
    /**
     * To print data on terminal.
     * @param text - Text to print;
     */
    public void print(String text){ System.out.println(text);}
}
