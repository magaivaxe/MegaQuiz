/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questions;

import java.util.ArrayList;
import java.util.Random;

/**
 * Class to choice randomly the per
 * @author Marcos Gomes
 */
public class Choice extends Random
{
    //Fields
    ArrayList<Integer> chooses;
    
    public Choice(){
        super();
        chooses = new ArrayList<>();
    }
    
    /**
     * 
     * @param vectorSize - vector size to set the random sample.
     * @return an Integer number 
     */
    public int randomChoice(int vectorSize){
        // Bool to check if the number was found
        boolean found = false;
        int choosen = 0;
        int toReturn;
        
        while (!found) {
            // Choice the number to return
            choosen = this.nextInt(vectorSize);
            // Check if the number choose it was already choose
            for (Integer c : chooses) {
                if (c == choosen) {
                    break;
                }else{
                    // Add the choosen to chooses
                    chooses.add(choosen);
                    // To loop exit
                    found = true;
                }
            }
        }
        toReturn = choosen;
        return toReturn;
    }
    
}
