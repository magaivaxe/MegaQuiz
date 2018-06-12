
package questions;

import dataInput.MyFileReader;

/**
 *
 * @author Marcos Gomes
 */
public class OrdinaryQuiz extends HomeQuiz{
    //Fields
    public static OrdinaryQuiz currentOrdinaryQuiz;
    // Constructor
    public OrdinaryQuiz() { }
    
    @Override
    public void startMegaQuiz(String url_path){
        // Local file reader
        MyFileReader fileReader = new MyFileReader(url_path);
        // Clear lists and score to zero before use
        perList.clear(); indexList.clear(); scoreApp.setScoreToZero();
        // Fill the lists
        perList = fileReader.createPerList();
        indexList = randomChoice.randomIndex(perList);
        // Questions loop
        int current = 0;
        while (current < perList.size()) {
            print(msg.LINE);
            print("\nQuestion " + current + ": ");
            setQuestion(perList.get(indexList.get(current)).getElementQuestion());
            setTrueResponse(perList.get(indexList.get(current)).getElementResponse());
            print(getQuestion() + "?");
            currentOrdinaryQuiz = this;
            String entryResp = keyboardEntry.readString();
            // Check true response
            if (getTrueResponse().equalsIgnoreCase(entryResp)) {
                print("Correct " + currentHomeQuiz.getPlayer() + "!");
                scoreApp.setScore();
                print("Score: " + scoreApp.getScore());
            }else{
                print("False");
            }
            current++;
        }
        myFileWriter.lineWriter(currentHomeQuiz.getPlayer(), scoreApp.getScore());
        mainMenu();
    } 
}
