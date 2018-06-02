package questions;

import java.util.Scanner;

/**
 * Show the MegaQuiz statements
 * @author sire_marcos
 */
public class HomeQuiz {
    // Fields
    private String player;
    private String temp;
    private int choice;
    
    private String MSG_WC = 
            "\n\n" +
            "------------------------------------------\n" + 
            "Welcome to Mega Quiz! \n" +
            "Enter the player name: ";
    private String MSG_CH = 
            "Welcome!\n" +
            "Choice your Mega Quiz type...\n" +
            "-- Multiple choice;\n" +
            "\t 1 - Canada;\n" +
            "\t 2 - United States\n" +
            "\t 3 - Country - capital\n" +
            "4 - Direct response" + 
            "Your choice:\n";;
    // Objects
    Scanner sc = new Scanner(System.in);
    // Constructor
    public HomeQuiz(){}
    
    public void choices(){
        Boolean ok;
        print(MSG_CH);
        temp = sc.next();
        if (ok = check()) {
            
        }else{
            choices();
        }
    }
    
    public void start(){
        print(MSG_WC);
        player = sc.next();
        choices();
    }
    
    private void print(String text){
        System.out.println(text);
    }
    
    private boolean check(){
        try {
            choice = Integer.parseInt(temp);
            return true;
        }
        catch (Exception e) {
            return false;
        }
    }
    
}
