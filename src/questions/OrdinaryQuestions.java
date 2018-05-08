
package questions;

/**
 *
 * @author Marcos Gomes
 */
public class OrdinaryQuestions extends AbsQuestion
{
    private final String URL_FILE_OQ = 
            "/Users/eleves/Desktop/POOII_TP1/fixes.txt";
    /**
     * Method to return the fixes questions
     */
    public void ordinaryQuestions(){
        
    }
    /**
     * Method to set the OrdinaryQuestions configurations.
     */
    private void settins(){
        //Clear if exists data inside
        listPer.clear();
        //Ordinary questions path to fixes.txt
        mfr.setURL(URL_FILE_OQ);
        //Resturn list from reader
        listPer = mfr.listFromReader();
    }       
}
