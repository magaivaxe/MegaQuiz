/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataInput;

import dataOutput.ScoreApp;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Class to read the text files converse it to ArrayList.
 * 
 * @author Marcos Gomes
 */
public class MyFileReader
{
    //Fields
    private String url_path = "";
    //Contructor
    public MyFileReader(){}
    
    /**
     * Method to read a text file line by line:<br>
     * 1- The method try to read by BufferedReader according to the address;<br>
     * 2- In the loop it read each line, set the elements objects and add Per
     * object to Per list;<br>
     * @return an ArrayList type Per.
     * @throws java.lang.Exception
     */
    public ArrayList<Per> perList() throws Exception {
        //Locals
        ArrayList<Per> toReturn = new ArrayList<>();
        Per per = new Per();
        //Try reader
        BufferedReader br = new BufferedReader(new FileReader(url_path));
        String currentLine;
        //Loop to read lines
        while ((currentLine = br.readLine()) != null){
            String [] line = currentLine.split(",");
            per.setElementQuestion(line[0]);
            per.setElementResponse(line[1]);
            toReturn.add(per);
        }
        return toReturn;
    }
    
    public ArrayList<ScoreApp> scoreList(){
        // Locals
        ArrayList<ScoreApp> toReturn = new ArrayList();
        
        return toReturn;
    }

    public void setURL(String URL_FILE) {this.url_path = URL_FILE;}
    
}
