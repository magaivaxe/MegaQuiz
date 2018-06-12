/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questions;

import dataInput.MyFileReader;

/**
 * Class to build and show the multiple questions
 * @author Marcos Gomes
 */
public class MultipleQuiz extends ABSQuestion {
    // Constructor
    public MultipleQuiz() { super(); }
     
    public void startMultiple(String url_path){
        // Local file reader
        MyFileReader fileReader = new MyFileReader(url_path);
        // Clear lists before use
        perList.clear(); indexList.clear(); falseResponses.clear();
        // Fill the lists
        perList = fileReader.createPerList();
        falseResponses = randomChoice.createFalseRespList(perList);
        indexList = randomChoice.randomIndex(perList);
        // Questions loop
        int current = 0;
        while (current < perList.size()) {
            print("\nQuestion " + current + ": ");
            // Set current question, true and falses responses to object
            setResponses(current);
            // Print current question
            print(msg.START_QUESTION + getQuestion() + msg.END_QUESTION);
            // Responses on differents positions
            String [] arrayResponses = setArrayResponses();
            printResponses(arrayResponses);
            // Enter user response
            String str = keyboardEntry.readString();
            // Check true response
            if (keyboardEntry.checkNumber(str, 0, 3)) {
                int itemChoose = Integer.parseInt(str);
                if (arrayResponses[itemChoose].equalsIgnoreCase(getTrueResponse())){
                    System.out.println("Correct");
                    // TODO score
                }
            }else{
                System.out.println("Enter value");
            }
            current++;
        }
    }
    
    /**
     * Set encapsulated parameters 
     * @param current current value to perList index 
     */
    private void setResponses(int current){
        setQuestion(
            perList.get(indexList.get(current)).getElementQuestion()
        );
        setTrueResponse(
            perList.get(indexList.get(current)).getElementResponse()
        );
        setFalseResponse1(
            falseResponses.get(indexList.get(current)).getFalseResponse1()
        );
        setFalseResponse2(
            falseResponses.get(indexList.get(current)).getFalseResponse2()
        );
        setFalseResponse3(
            falseResponses.get(indexList.get(current)).getFalseResponse3()
        );
    }
    
    /**
     * Set random positions to multiple responses
     * @return Random response position array
     */
    private String [] setArrayResponses(){
        int [] positions = randomChoice.randomRespPos();
        String [] toReturn = new String[positions.length];
        toReturn[positions[0]] = getTrueResponse();
        toReturn[positions[1]] = getFalseResponse1();
        toReturn[positions[2]] = getFalseResponse2();
        toReturn[positions[3]] = getFalseResponse3();
        return toReturn;
    }
    
    /**
     * Method to print array
     * @param responses array to print
     */
    private void printResponses(String [] responses){
        for (int i = 0; i < responses.length; i++) {
            print("\t" + i + ")" + responses[i]);
        }
    }
    
    private void checkCorrect(){
        
    }
}
