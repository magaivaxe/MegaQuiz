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
        // Clear and fill the list before start
        listPer.clear();
        listPer = fileReader.createPerList();
        // Locals
        int size = listPer.size();
        int current = 0;
        ArrayList<Integer> iList = randomChoice.randomIndex(size);
        // Questions loop
        while (current < size) {
            // Presentation
            print("Question " + current + 1 + ": ");
            // Question
            print(listPer.get(iList.get(current)).getElementQuestion());
            // Print possibles responses
            
            
            current++;
        }
         
    }
}
