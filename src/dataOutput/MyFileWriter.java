/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataOutput;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Class to wite in text files the score obtained.
 * @author Marcos Gomes
 */
public class MyFileWriter {
    //Fields
    final String URL_SCORE = "/Users/sire_marcos/projects/java_netbeans/MegaQuiz/src/files/score.txt";
    private File file;
    private DateTime dateTime;
    //Constructor
    public MyFileWriter(){
        file = new File(URL_SCORE);
        dateTime = new DateTime();
    }
    
    /**
     * Write the current time and date more name and score
     * @param gameType 1-4. 1- Canada; 2- USA; 3- Countries; 4- Ordinaries;
     * @param name player name
     * @param score player score
     */
    public void lineWriter(int gameType, String name, int score) {
        String type;
        switch (gameType) {
            case 1: type = "Canada"; break;
            case 2: type = "USA"; break;
            case 3: type = "Countries"; break;
            default: type = "Ordinaries"; break;
        }
        try (BufferedWriter writer = new BufferedWriter(
                new FileWriter(file, true))) {
            writer.append(
                dateTime.getCurrentTime() + "," +
                dateTime.getCurrentDate() + "," +
                type + "," + name + "," + score);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
