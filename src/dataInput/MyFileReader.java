/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataInput;

import dataOutput.ScoreApp;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Class to read the text files converse it to ArrayList.
 * @author Marcos Gomes
 */
public class MyFileReader {
    //Fields
    private String url_path;
    // Objects
    
    //Contructor
    public MyFileReader(String url_path){
        this.url_path = url_path;
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
        //Try reader
        try {
            File file = new File(url_path);
            Scanner scanner = new Scanner(file);
            //
            int i = 0;
            while (scanner.hasNextLine()){
                Per per = new Per();
                String currentLine = scanner.nextLine();
                String [] line = currentLine.split(",");
                per.setElementQuestion(line[0]);
                per.setElementResponse(line[1]);
                toReturn.add(per);
            }
        } catch (Exception e) {
            e.printStackTrace();
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

}
