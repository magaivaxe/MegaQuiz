
package questions;

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
    // Objects
    public ArrayList<Per> listPer;
    public MyFileReader fileReader;
    public RandomChoice randomChoice;
    public KeyboardEntry entry;
    public Scanner scanner;
    public GameMsg msg;
    //Constructor
    public ABSQuestion(){
        listPer = new ArrayList<>();
        fileReader = new MyFileReader();
        randomChoice = new RandomChoice();
        entry = new KeyboardEntry();
        scanner = new Scanner(System.in);
        msg = new GameMsg();
    }
    
    public void print(String text){
        System.out.println(text);
    }

    public String getQuestion() { return question;}

    public void setQuestion(String question) {this.question = question;}

    public String getResponse() {return response;}

    public void setResponse(String response) {this.response = response;}

    public String getPlayer() {return player;}

    public void setPlayer(String player) {this.player = player;}
    
    
}
