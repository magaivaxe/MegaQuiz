
package dataOutput;


/**
 * Class to return the game score
 * @author Marcos Gomes
 */
public class ScoreApp {
    // Fields
    private int hight_score;
    private int score;
    // Objects
    /**
     * Constructor to get and set values from the files and list
     */
    public ScoreApp() {
        score = 0;
        hight_score = 0;
    }

    public int getScore() {return score;}

    public void setScore() {this.score++;}
    
    public void setScoreToZero() {this.score = 0;}
    
    public int getHight_score() {return hight_score;}

    public void setHight_score() {
        if (this.score > this.hight_score) {
            this.hight_score = this.score;
        }
    }

}
