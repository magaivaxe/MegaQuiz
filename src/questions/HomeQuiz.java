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
    public HomeQuiz(){super();}
    
    /**
     * Method to start the game
     */
    public void start(){
        print(msg.MSG_WELCOME);
        //Scanner the player name
        setPlayer(scanner.next());
        print("\nWelcome " + getPlayer() + "!");
        mainMenu();
    }
    
    /**
     * Method to choice on mainMenu game
     */
    private void mainMenu(){
        print(getPlayer() + ", " + msg.MSG_CHOICE);
        str = scanner.next();
        if (check()) {
            settings();
        }else{
            msgError();
            mainMenu();
        }
    }
    
    
    /**
     * Method to convert a string number to integer. If it isn't possible<br>
     * return false. If it is possible check the number range {@code 0 < n < 5}
     * <br> to return true or false.
     * @return a boolean
     */
    private boolean check(){
        try {
                chooseNumber = Integer.parseInt(str);
                return chooseNumber <= 4 || chooseNumber >= 1;
        } catch (NumberFormatException e) {
            return false;
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
                fileReader.setURL(URL_CANADA);
                multipleQuiz.startMultiple();
                break;
            case 2:
                fileReader.setURL(URL_USA);
                break;
            case 3:
                fileReader.setURL(URL_COUNTRY_CAPITAL);
                break;
            case 4:
                fileReader.setURL(URL_ORDINARY);
                break;
        }
    }
   
    
}
