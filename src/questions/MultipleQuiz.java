/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questions;

import dataInput.MyFileReader;
import java.util.ArrayList;

/**
 *
 * @author Marcos Gomes
 */
public class MultipleQuiz extends ABSQuestion {
    // Constructor
    public MultipleQuiz() { super(); }
     
    public void startMultiple(String url_path){
        // Create a new fileReader
        MyFileReader fileReader = new MyFileReader(url_path);
        // Clear and fill the list before start
        listPer.clear();
        listPer = fileReader.createPerList();
        falseResponseses = randomChoice.createFalseRespList(listPer);
        // Locals
        int size = listPer.size();
        // Random index to questions
        ArrayList<Integer> iList = randomChoice.randomIndex(size);
        // Questions loop
        int current = 0;
        while (current < size) {
            // Presentation
            print("Question " + current + ": ");
            // Question
            print(msg.QUESTION + 
                listPer.get(iList.get(current)).getElementQuestion() +
                msg.RESPONSE);
            // Array positions
            int [] positions = randomChoice.responsesPositions();
            String [] responses = new String[4];
                responses[positions[0]] = listPer.get(iList.get(current)).getElementResponse();
                responses[positions[1]] = falseResponseses.get(iList.get(current)).getFalseResponse1();
                responses[positions[2]] = falseResponseses.get(iList.get(current)).getFalseResponse2();
                responses[positions[3]] = falseResponseses.get(iList.get(current)).getFalseResponse3();
               
            // Print possibles responses
            for (int i = 0; i < responses.length; i++) {
                print(
                    "\t" + i + ")" + responses[i]
                );
            }
            
            
            
            current++;
        }
         
    }
}
