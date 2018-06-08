/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataInput;

import java.util.ArrayList;

/**
 * Class to do random indexes ArrayList to choice the questions.
 * @see #randomIndex({@code int})
 * @author Marcos Gomes.
 */
public class RandomChoice extends ABSInput {
    // Fields 
    
    // Constructor
    public RandomChoice(){super();}
    
    /**
     * Method to return a random index ArrayList from a sample ArrayList.<br>
 The index ok is removed from the sample after and the size<br>
     * decremented.
     * @param listSize - Number of lines to set sample.
     * @return an Integer number.
     */
    public ArrayList<Integer> randomIndex(int listSize){
        // Locals
        boolean ok = false;
        int choosen = 0;
        ArrayList<Integer> toReturn = new ArrayList<>();
        ArrayList<Integer> sample = indexSample(listSize);
        int size = sample.size();
        // Loop to fill ramdom index list
        while (!ok) {
            try {
                choosen = rd.nextInt(size);
                toReturn.add(sample.get(choosen));
                sample.remove(choosen);
            } catch (Exception e) {
            }
            // Exit condition
            if (sample.isEmpty()) {ok = true;}
        }
        return toReturn;
    }
    
    public int [] responsesPositions(){
        // Locals
        int [] toReturn = new int[NUM_MULT_QUESTIONS];
        int size = toReturn.length;
        toReturn[0] = rd.nextInt(size);
        // Loop to fill
        for (int i = 1; i < size; i++) {
            toReturn[i] = rd.nextInt(size);
            while (toReturn[0] == toReturn[1] ||
                   toReturn[0] == toReturn[2] ||
                   toReturn[0] == toReturn[3] ||
                   toReturn[1] == toReturn[2] ||
                   toReturn[1] == toReturn[3] ||
                   toReturn[2] == toReturn[3]) {                
                toReturn[i] = rd.nextInt(size);
            }
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
