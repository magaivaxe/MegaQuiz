/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataInput;

import java.util.ArrayList;
import java.util.Random;

/**
 * Class to do a random index ArrayList to choice the questions.
 * @see #randomIndex(int)
 * @author Marcos Gomes.
 */
public class RandomChoice extends Random {
    // Constructor
    public RandomChoice(){super();}
    
    /**
     * Method to return a random index ArrayList from a sample ArrayList.<br>
     * The index found is removed from the sample after and the size<br>
     * decremented.
     * @param listSize - Number of lines to set sample.
     * @return an Integer number.
     */
    public ArrayList<Integer> randomIndex(int listSize){
        // Locals
        boolean found = false;
        int choosen = 0;
        ArrayList<Integer> toReturn = new ArrayList<>();
        ArrayList<Integer> sample = indexSample(listSize);
        int size = sample.size();
        // Loop to fill ramdom index list
        while (!found) {
            choosen = this.nextInt(size);
            toReturn.add(sample.get(choosen));
            sample.remove(choosen);
            size--;
            // Exit condition
            if (sample.isEmpty()) {found = true;}
        }
        return toReturn;
    }
    
    /**
     * Method to fill a index list of size {@param listSize}
     * @param listSize
     * @return an integer ArrayList
     */
    private ArrayList<Integer> indexSample(int listSize){
        // Locals
        ArrayList<Integer> toReturn = new ArrayList<>();
        for (int i = 0; i < listSize; i++) {
            toReturn.add(i);
        }
        return toReturn;
    }
}
