
package questions;

import dataInput.MyFileReader;

/**
 *
 * @author Marcos Gomes
 */
public class OrdinaryQuiz extends HomeQuiz{
    // Constructor
    public OrdinaryQuiz() { }
    
    @Override
    public void startMegaQuiz(String url_path){
        // Local file reader
        MyFileReader fileReader = new MyFileReader(url_path);
        // Clear lists before use
        perList.clear(); indexList.clear();
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
            String entryResp = keyboardEntry.readString();
            // Check true response
            if (getTrueResponse().equalsIgnoreCase(entryResp)) {
                print("Correct");
                // TODO score
            }else{
                print("False");
            }
            current++;
        }
    }      
}
