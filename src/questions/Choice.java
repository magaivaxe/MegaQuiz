/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questions;

import java.util.Random;

/**
 * Class to 
 * @author Marcos Gomes
 */
public class Choice extends Random
{
    
    public Choice() {super();}
    
    /**
     * 
     * @param vectorSize - vector size to set the random sample.
     * @return an Integer number 
     */
    public int randomChoice(int vectorSize){
        int toReturn = this.nextInt(vectorSize);
        return toReturn;
    }
    
}
