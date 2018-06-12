package dataInput;

import java.util.NoSuchElementException;
import questions.HomeQuiz;
import static questions.HomeQuiz.currentHomeQuiz;
import questions.MultipleQuiz;
import questions.OrdinaryQuiz;

/**
 * Use this class for customs entries as conditions, booleans and Strings.
 * @author Marcos Gomes
 */
public class KeyboardEntry extends ABSInput{
    // Constructor
    public KeyboardEntry(){ super(); }
    
    /**
     * 
     * @return a String entered on terminal
     */
    public String readString() {
        // Locals
        try {
            String entry = sc.nextLine();
            checkMessage(entry);
            return entry;
        } catch (NoSuchElementException e) {
            return "-1";
        }
    }
    
    /**
     * Method to convert a string number to integer. If it isn't possible<br>
 return false. If it is possible checkNumber the number {@code n} range 
     * {@code inf < n < sup} <br> to return true or false.
     * @param str String to parse to integer
     * @param inf interval limit to choice
     * @param sup interval limit to choice
     * @return a boolean
     */
    public boolean checkNumber(String str, int inf, int sup){
        try {
            int n = Integer.parseInt(str);
            return (n <= sup && n >= inf);
        } catch (NumberFormatException e) {
            return false;
        }
    }
    
    /**
     * To check if the commands was entered
     * @param entry String entered in terminal
     */
    private void checkMessage(String entry){
        if (entry.equalsIgnoreCase(EXIT)) {
            exitWriteScore();
            print("Goodbye " + HomeQuiz.currentHomeQuiz.getPlayer());
            Runtime.getRuntime().exit(STATUS_EXIT);
        } else if (entry.equalsIgnoreCase(CHANGE_GAME)) {
            exitWriteScore();
            HomeQuiz.currentHomeQuiz.mainMenu();
        } else if (entry.equalsIgnoreCase(CHANGE_PLAYER)) {
            exitWriteScore();
            print("Goodbye " + HomeQuiz.currentHomeQuiz.getPlayer());
            HomeQuiz.currentHomeQuiz.start();
        }
    }
    
    /**
     * Write player data when player exit.
     */
    private void exitWriteScore(){
        int n = HomeQuiz.currentHomeQuiz.getChooseNumber();
        if ( n == 1 || n == 2 || n == 3) {
            MultipleQuiz.currentMultipleQuiz.myFileWriter.lineWriter(
                currentHomeQuiz.getChooseNumber(),
                HomeQuiz.currentHomeQuiz.getPlayer(),
                MultipleQuiz.currentMultipleQuiz.scoreApp.getScore());
        } else {
            OrdinaryQuiz.currentOrdinaryQuiz.myFileWriter.lineWriter(
                currentHomeQuiz.getChooseNumber(),
                HomeQuiz.currentHomeQuiz.getPlayer(),
                OrdinaryQuiz.currentOrdinaryQuiz.scoreApp.getScore());
        }
    }
}
