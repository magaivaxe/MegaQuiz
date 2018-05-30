/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataOutput;

import java.util.Date;

/**
 * Class to return the game score
 * @author Marcos Gomes
 */
public class ScoreApp {
    // Fields
    private int score;
    private int hight_score;
    private Date scoreDate;
    // Objects
    private static ScoreApp current;
    /**
     * 
     * @param hight_score : 
     */
    public ScoreApp(int hight_score) {
        this.hight_score = hight_score;
        this.score = 0;
        // To recall
        current = this;
    }
    
    // Setters
    public void setScore() {
        this.score++;
    }

    public void setHight_score() {
        // Conditions to set the high Score
        if (this.score > this.hight_score) {
            this.hight_score = this.score;
        }
        
    }
    
    
    
}
