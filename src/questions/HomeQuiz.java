package questions;

/**
 * Show the MegaQuiz statements
 * @author Marcos Gomess
 */
public class HomeQuiz extends ABSQuestion {
    // Fields
    private String entry;
    private int chooseNumber;
    private String player;
    public static HomeQuiz currentHomeQuiz;
    // Constructor
    public HomeQuiz(){ 
    }
    
    /**
     * Method to start the game
     */
    public void start(){
        print(msg.MSG_WELCOME);
        //Scanner the player name
        setPlayer(keyboardEntry.readString());
        print("\nWelcome " + getPlayer() + "!");
        mainMenu();
    }
    
    /**
     * Method to choice on mainMenu game
     */
    public void mainMenu(){
        print(getPlayer() + ", " + msg.MSG_CHOICE);
        entry = keyboardEntry.readString();
        if (keyboardEntry.checkNumber(entry, 1, 4)) {
            chooseNumber = Integer.parseInt(entry);
            settings();
        }else{
            msgError();
            mainMenu();
        }
    }
    
    /**
     * Method to chose the path to game:<br>
     * <ul><li>1-Canada</li><li>2-United States</li>
     * <li>3-Country capital</li><li>4-Ordinary questions</li></ul>
     */
    private void settings(){
        // Locals
        currentHomeQuiz = this;
        MultipleQuiz multipleQuiz = new MultipleQuiz();
        OrdinaryQuiz ordinaryQuiz = new OrdinaryQuiz();
        switch(chooseNumber){
            case 1:
                multipleQuiz.startMegaQuiz(URL_CANADA);
                break;
            case 2:
                multipleQuiz.startMegaQuiz(URL_USA);
                break;
            case 3:
                multipleQuiz.startMegaQuiz(URL_COUNTRY_CAPITAL);
                break;
            case 4:
                ordinaryQuiz.startMegaQuiz(URL_ORDINARY);
                break;
        }
    }
    
    // Setters and Getters =====================================================
    public String getPlayer() {return player;}

    public void setPlayer(String player) {this.player = player;}
    
    public int getChooseNumber() { return chooseNumber;}
    
    // Setters and Getters =====================================================

    

    
}
