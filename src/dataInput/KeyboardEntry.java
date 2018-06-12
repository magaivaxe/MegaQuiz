package dataInput;

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
    
    public String readString() {
        // Locals
        String toReturn;
        // Try assign
        try {
            return toReturn = sc.nextLine();
        } catch (NoSuchElementException e) {
            return "-1";
        }
    }
    
    /**
     * Method to convert a string number to integer. If it isn't possible<br>
     * return false. If it is possible check the number range {@code 0 < n < 5}
     * <br> to return true or false.
     * @return a boolean
     */
    public boolean check(String str, int inferiorLimit, int superLimit){
        try {
            int chooseNumber = Integer.parseInt(str);
            return chooseNumber <= superLimit || chooseNumber >= inferiorLimit;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    
    
    
}
