/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataInput;

import java.util.ArrayList;
import java.util.Random;

/**
 * Class to choice a randomly position for a Per ArrayList().
 * @see #randomChoice(int).
 * @author Marcos Gomes.
 */
public class Choice extends Random {
    //Fields
    private ArrayList<Integer> chooses;
    
    public Choice(){
        super();
        chooses = new ArrayList<>();
    }
    /**
     * Method to return a random integer with sample size <i>vectorSize</i>
     * that it don't repeat the number choose.<br>
     * The number choose it will be added to a Array List where it will go
     * checked by a loop and a <i>boolean</i> variable. If the number was
     * already choose it will be select again.
     * @param vectorSize - vector size to set the random sample.
     * @return an Integer number.
     */
    public int randomChoice(int vectorSize){
        // Locals
        boolean found = false;
        int choosen = 0;
        int toReturn;
        // Finder loop
        while (!found) {
            // Random integer
            choosen = this.nextInt(vectorSize);
            // Checker
            for (Integer c : chooses) {
                if (c == choosen) {
                    break;
                }else{
                    chooses.add(choosen);
                    found = true;
                }
            }
        }
        toReturn = choosen;
        return toReturn;
    }
}
