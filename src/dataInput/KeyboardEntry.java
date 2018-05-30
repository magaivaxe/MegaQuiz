package dataInput;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * Use this class for customs entries as conditions, booleans and Strings.
 * @author Marcos Gomes
 */
public class KeyboardEntry {
    // Objects
    Scanner sc;
    // Constructor
    public KeyboardEntry(){
        sc = new Scanner(System.in);
    }
    
    public String readString() throws NoSuchElementException {
        // Locals
        String toReturn;
        // Try assign
        toReturn = sc.nextLine();
        return toReturn;
    }
    
    public int readInteger() throws InputMismatchException {
        // Locals
        int toReturn;
        // Try assign
        toReturn = sc.nextInt();
        return toReturn;
    }
    
    public double readDouble() throws InputMismatchException {
        // Locals
        double toReturn;
        // Try assign
        toReturn = sc.nextDouble();
        return toReturn;
    }
    
    public float readFloat() throws InputMismatchException {
        // Locals
        float toReturn;
        // Try assign
        toReturn = sc.nextFloat();
        return toReturn;
    }
}
