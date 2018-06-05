/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questions;

import java.util.ArrayList;

/**
 *
 * @author Marcos Gomes
 */
public class MultipleQuiz extends ABSQuestion {
    // Fields
    
    // Constructor
    public MultipleQuiz() { super(); }
     
    public void startMultiple(){
        listPer.clear();
        // Locals
        listPer = fileReader.createPerList();
        ArrayList<Integer> ramdomIndex = randomChoice.randomIndex(listPer.size());
        // Clear the list before start
        
         
    }
}
