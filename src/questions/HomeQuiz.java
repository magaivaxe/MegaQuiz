package questions;


/**
 * Show the MegaQuiz statements
 * @author Marcos Gomess
 */
public class HomeQuiz extends ABSQuestion {

    // Fields
    private String str;
    private int chooseNumber;
    
    // Constructor
    public HomeQuiz(){
        super();
    }
    
    /**
     * Method to start the game
     */
    public void start(){
        print(msg.MSG_WELCOME);
        //Scanner the player name
        setPlayer(scanner.next());
        print("\nWelcome " + getPlayer() + "!");
        menu();
    }
    
    /**
     * Method to choice on menu game
     */
    private void menu(){
        print(getPlayer() + ", " + msg.MSG_CHOICE);
        str = scanner.next();
        if (check()) {
            
        }else{
            error();
        }
    }
    
    private boolean check(){
        try {
            chooseNumber = Integer.parseInt(str);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    private void error() {
        print(msg.ERROR + "(" + Integer.TYPE.toString().toUpperCase() + ")");
        menu();
    }
    
}
