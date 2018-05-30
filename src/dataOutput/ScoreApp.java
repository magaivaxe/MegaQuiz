
package dataOutput;

import java.time.LocalDate;
import java.time.LocalTime;



/**
 * Class to return the game score
 * @author Marcos Gomes
 */
public class ScoreApp {
    // Fields
    private int hight_score;
    // Objects
    private String player;
    private LocalDate date;
    private LocalTime time;
    /**
     * Constructor to get and set values from the files and list
     */
    public ScoreApp() {}

    public int getHight_score() {
        return hight_score;
    }

    public void setHight_score(int hight_score) {
        this.hight_score = hight_score;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }
    

   
    
    
    

    
    
    
    
}
