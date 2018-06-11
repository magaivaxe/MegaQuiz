
package questions;

import dataInput.FalseResponse;
import dataInput.RandomChoice;
import dataInput.KeyboardEntry;
import dataInput.MyFileReader;
import dataInput.Per;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Class to encapsulate objects and methods to questions package
 * @author Marcos Gomes
 */
public abstract class ABSQuestion {
    
    // Fields
    private String question;
    private String response;
    private String player;
    public final String URL_CANADA = "C:\\Users\\mpgsa\\Downloads\\canada.txt";
    public final String URL_USA = "USA.txt";
    public final String URL_COUNTRY_CAPITAL = "COUNTRY_CAPITAL.txt";
    public final String URL_ORDINARY = "ORDINARY.txt";
    // Objects
    public ArrayList<Per> listPer;
    public ArrayList<FalseResponse> falseResponseses;
    public RandomChoice randomChoice;
    public KeyboardEntry entry;
    public Scanner scanner;
    public GameMsg msg;
    //Constructor
    public ABSQuestion(){
        listPer = new ArrayList<>();
        falseResponseses = new ArrayList<>();
        randomChoice = new RandomChoice();
        entry = new KeyboardEntry();
        scanner = new Scanner(System.in);
        msg = new GameMsg();
    }
    
    /**
     * To print data on terminal.
     * @param text - Text to print;
     */
    public void print(String text){ System.out.println(text);}
    
    public void msgError() {
        print(msg.ERROR1 + msg.ERROR2);
    }

    public String getQuestion() { return question;}

    public void setQuestion(String question) {this.question = question;}

    public String getResponse() {return response;}

    public void setResponse(String response) {this.response = response;}

    public String getPlayer() {return player;}

    public void setPlayer(String player) {this.player = player;}
    
    
}
