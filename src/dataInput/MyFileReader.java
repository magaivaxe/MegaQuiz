/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataInput;

import dataOutput.ScoreApp;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

/**
 * Class to read the text files converse it to ArrayList.
 * @author Marcos Gomes
 */
public class MyFileReader extends ABSInput{
    //Fields
    private String url_path = "";
    // Objects
    
    //Contructor
    public MyFileReader(){
        super();
    }
    
    /**
     * Method to read a text file line by line:<br>
     * 1- The method try to read by BufferedReader according to the address;<br>
     * 2- In the loop it read each line, set the elements objects and add Per
     * object to Per list;<br>
     * @return an ArrayList type Per.
     */
    public ArrayList<Per> createPerList() {
        //Locals
        ArrayList<Per> toReturn = new ArrayList<>();
        Per per = new Per();
        //Try reader
        try(BufferedReader br = new BufferedReader(new FileReader(url_path))){
            String currentLine;
            //Loop to read lines
            while ((currentLine = br.readLine()) != null){
                String [] line = currentLine.split(",");
                per.setElementQuestion(line[0]);
                per.setElementResponse(line[1]);
                toReturn.add(per);
            }
        } catch (Exception e) {}
        
        return toReturn;
    }
    
    /**
     * Create a random FalseResponse list from the Per list to use on object<br>
     * MultipleQuestions.
     * 
     * @return FalseResponse ArrayList to MultipleQuiz
     */
    public ArrayList<FalseResponse> createFalseRespList(ArrayList<Per> listPer){
        // Locals
        ArrayList<FalseResponse> toReturn = new ArrayList<>();
        FalseResponse fr = new FalseResponse();
        int size = listPer.size();
        //
        while (toReturn.size() < size) {
            int i = rd.nextInt(size);
            int j = rd.nextInt(size);
            int k = rd.nextInt(size);
            
            while (i == j || i == k || j == k) {
                // Conditions to assign values
                if (i == j) { j = noEqualsIntegers(i, j, size); }
                if (i == k) { k = noEqualsIntegers(i, k, size); }
                if (j == k) { k = noEqualsIntegers(j, k, size); }
            }
            fr.setFalseResponse1(listPer.get(i).getElementResponse());
            fr.setFalseResponse2(listPer.get(j).getElementResponse());
            fr.setFalseResponse3(listPer.get(k).getElementResponse());
            
            toReturn.add(fr);
        }
        return toReturn;
    }
    
    /**
     * TO DO
     * @return 
     */
    public ArrayList<ScoreApp> scoreList(){
        // Locals
        ArrayList<ScoreApp> toReturn = new ArrayList();
        
        return toReturn;
    }

    public void setURL(String URL_FILE) {this.url_path = URL_FILE;}
    
}
