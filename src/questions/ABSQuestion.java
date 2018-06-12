
package questions;

import dataInput.FalseResponse;
import dataInput.RandomChoice;
import dataInput.KeyboardEntry;
import dataInput.Per;
import java.util.ArrayList;

/**
 * Class to encapsulate objects and methods to questions package
 * @author Marcos Gomes
 */
public abstract class ABSQuestion {
    
    // Fields
    private String question;
    private String trueResponse;
    private String falseResponse1;
    private String falseResponse2;
    private String falseResponse3;
    private String player;
    public final String URL_CANADA = "/Users/sire_marcos/projects/java_netbeans/MegaQuiz/src/files/canada.txt";
    public final String URL_USA = "USA.txt";
    public final String URL_COUNTRY_CAPITAL = "COUNTRY_CAPITAL.txt";
    public final String URL_ORDINARY = "ORDINARY.txt";
    // Objects
    public ArrayList<Per> perList;
    public ArrayList<FalseResponse> falseResponses;
    public ArrayList<Integer> indexList;
    public RandomChoice randomChoice;
    public KeyboardEntry entry;
    public KeyboardEntry keyboardEntry;
    public GameMsg msg;
    //Constructor
    public ABSQuestion(){
        perList = new ArrayList<>();
        falseResponses = new ArrayList<>();
        indexList = new ArrayList<>();
        randomChoice = new RandomChoice();
        entry = new KeyboardEntry();
        keyboardEntry = new KeyboardEntry();
        msg = new GameMsg();
    }
    
    /**
     * To print data on terminal.
     * @param text - Text to print;
     */
    public void print(String text){ System.out.println(text);}
    
    /**
     * Print message error
     */
    public void msgError() {
        print(msg.ERROR1 + msg.ERROR2);
    }
    
    

    public String getQuestion() { return question;}

    public void setQuestion(String question) {this.question = question;}

    public String getTrueResponse() { return trueResponse;}

    public void setTrueResponse(String trueResponse) {
        this.trueResponse = trueResponse;
    }

    public String getFalseResponse1() {return falseResponse1;}

    public void setFalseResponse1(String falseResponse1) {
        this.falseResponse1 = falseResponse1;
    }

    public String getFalseResponse2() {return falseResponse2;}

    public void setFalseResponse2(String falseResponse2) {
        this.falseResponse2 = falseResponse2;
    }

    public String getFalseResponse3() {return falseResponse3;}

    public void setFalseResponse3(String falseResponse3) {
        this.falseResponse3 = falseResponse3;
    }

    public String getPlayer() {return player;}

    public void setPlayer(String player) {this.player = player;}
    
    
}
