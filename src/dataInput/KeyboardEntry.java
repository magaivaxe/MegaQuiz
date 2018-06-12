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
        try {
            return sc.nextLine();
        } catch (NoSuchElementException e) {
            return "-1";
        }
    }
    
    /**
     * Method to convert a string number to integer. If it isn't possible<br>
 return false. If it is possible checkNumber the number {@code n} range 
     * {@code inf < n < sup} <br> to return true or false.
     * @param str String to parse to integer
     * @param inf interval limit to choice
     * @param sup interval limit to choice
     * @return a boolean
     */
    public boolean checkNumber(String str, int inf, int sup){
        try {
            int n = Integer.parseInt(str);
            return (n <= sup && n >= inf);
        } catch (NumberFormatException e) {
            return false;
        }
    }
    
    
    
}
