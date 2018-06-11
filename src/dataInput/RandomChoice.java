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
     * The index ok is removed from the sample after and the size<br>
     * decremented.
     * @param listSize - Number of lines to set sample.
     * @return an List of Integers numbers.
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
                choosen = random.nextInt(size);
                toReturn.add(sample.get(choosen));
                sample.remove(choosen);
            } catch (Exception e) {
            }
            // Exit condition
            if (sample.isEmpty()) {ok = true;}
        }
        return toReturn;
    }
    
    /**
     * Method to create a random responses positions array to MultipleQuestions
     * @return an integer array
     */
    public int [] responsesPositions(){
        // Locals
        int [] toReturn = new int[NUM_MULT_QUESTIONS];
        int size = toReturn.length;
        int i, j, k, w;
        i = random.nextInt(size);
        j = random.nextInt(size);
        k = random.nextInt(size);
        w = random.nextInt(size);
        // Conditions to assign j values
        while (i == j || j == k || j == w) {
            j = random.nextInt(size);
            while (k == i || k == j || k == w) {
                k = random.nextInt(size); 
                while (i == w || j == w || k == w) {
                    w = random.nextInt(size); 
                }
            }
        }
        toReturn[0] = i; toReturn[1] = j; toReturn[2] = k; toReturn[3] = w; 
        
        System.out.println("Test out\n");
        return toReturn;
    }
    
    /**
     * Create a random FalseResponse list from the Per list to use on object<br>
     * MultipleQuestions.
     * 
     * @param listPer
     * @return FalseResponse ArrayList to MultipleQuiz
     */
    public ArrayList<FalseResponse> createFalseRespList(ArrayList<Per> listPer){
        // Locals
        ArrayList<FalseResponse> toReturn = new ArrayList<>();
        
        int size = listPer.size();
        
        // Loop to assign random values index to i, j and k 
        while (toReturn.size() < size) {
            // New False Responses 
            FalseResponse fr = new FalseResponse();
            int i = random.nextInt(size);
            int j = random.nextInt(size);
            int k = random.nextInt(size);
            // Conditions to assign values
            while (i == j || k == j) {
                j = random.nextInt(size);
                while (i == k || j == k) {
                    k = random.nextInt(size); 
                }
            } 
            fr.setFalseResponse1(listPer.get(i).getElementResponse());
            fr.setFalseResponse2(listPer.get(j).getElementResponse());
            fr.setFalseResponse3(listPer.get(k).getElementResponse());
            
            toReturn.add(fr);
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
