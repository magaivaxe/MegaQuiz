package questions;

/**
 * Show the MegaQuiz statements
 * @author Marcos Gomess
 */
public class HomeQuiz extends ABSQuestion {
    // Fields
    private String str;
    private int chooseNumber;
    //
    private MultipleQuiz multipleQuiz;
    private OrdinaryQuiz ordinaryQuiz;
    // Constructor
    public HomeQuiz(){
        super();
        multipleQuiz = new MultipleQuiz();
        ordinaryQuiz = new OrdinaryQuiz();
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
    private void mainMenu(){
        print(getPlayer() + ", " + msg.MSG_CHOICE);
        str = keyboardEntry.readString();
        if (keyboardEntry.checkNumber(str, 1, 4)) {
            chooseNumber = Integer.parseInt(str);
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
        switch(chooseNumber){
            case 1:
                multipleQuiz.startMultiple(URL_CANADA);
                break;
            case 2:
                //fileReader.setURL(URL_USA);
                break;
            case 3:
                //fileReader.setURL(URL_COUNTRY_CAPITAL);
                break;
            case 4:
                //fileReader.setURL(URL_ORDINARY);
                break;
        }
    }
   
    
}
