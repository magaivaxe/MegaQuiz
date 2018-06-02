package questions;

import java.util.Scanner;

/**
 * Show the MegaQuiz statements
 * @author sire_marcos
 */
public class HomeQuiz {
    // Fields
    private String player;
    // Objects
    Scanner sc = new Scanner(System.in);
    // Constructor
    public HomeQuiz(){}
    
    public void start(){
        System.out.println(
            "Welcome to Mega Quiz! \n" +
            "Enter the player name: \n"
        );
        player = sc.next();
        
        System.out.println(player);
    }
    
}
