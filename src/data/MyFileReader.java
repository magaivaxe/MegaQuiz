/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

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
    private String URL_FILE = "";
    //Contructor
    public MyFileReader(){}
    
    /**
     * Method to read a text file line by line:<br>
     * 1- The method try to read by BufferedReader according to the address;<br>
     * 2- In the loop it read each line, set the elements objects and add Per
     * object to Per list;<br>
     * @return an ArrayList type Per.
     */
    public ArrayList<Per> listFromReader(){
        //Local objects
        ArrayList<Per> toReturn = new ArrayList<>();
        Per per = new Per();
        //Try reader
        try(BufferedReader br = new BufferedReader(new FileReader(URL_FILE))){
            String currentLine;
            //Loop to read lines
            while ((currentLine = br.readLine()) != null){
                String [] line = currentLine.split(",");
                per.setElementQuestion(line[0]);
                per.setElementResponse(line[1]);
                toReturn.add(per);
            }
        }
        catch (IOException e) {e.printStackTrace();}
        return toReturn;
    }

    public void setURL(String URL_FILE) {this.URL_FILE = URL_FILE;}
    
}
