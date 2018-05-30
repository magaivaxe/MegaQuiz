
package questions;

/**
 *
 * @author Marcos Gomes
 */
public class OrdinaryQuiz extends ABSQuestion
{
    private final String URL_FILE_OQ = 
            "/Users/eleves/Desktop/POOII_TP1/fixes.txt";

    public OrdinaryQuiz() {
        super();
    }
    
    
    
    /**
     * Method to return the fixes questions
     */
    public void ordinaryQuestions(){
        
    }
    /**
     * Method to set the OrdinaryQuiz configurations.
     */
    private void settins(){
        //Clear if exists data inside
        listPer.clear();
        //Ordinary questions path to fixes.txt
        frIn.setURL(URL_FILE_OQ);
        //Resturn list from reader
        listPer = frIn.perList();
    }       
}
