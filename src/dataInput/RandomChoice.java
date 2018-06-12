package dataInput;

import java.util.ArrayList;

/**
 * Class to do random indexes to build the questions and multiple questions.
 * @author Marcos Gomes.
 */
public class RandomChoice extends ABSInput {
    // Fields 
    
    // Constructor
    public RandomChoice(){super();}
    
    /**
     * Method to return a random index ArrayList from a sample ArrayList.<br>
     * The index is removed from the sample after the number choose <br> 
     * and the size decremented.
     * @param listSize - Number of lines to set sample.
     * @return an List of Integers numbers.
     */
    public ArrayList<Integer> randomIndex(ArrayList<Per> perList){
        // Locals
        boolean ok = false;
        int choosen = 0;
        ArrayList<Integer> toReturn = new ArrayList<>();
        ArrayList<Integer> sample = indexSample(perList.size());
        int size = sample.size();
        // Loop to fill ramdom index list
        while (!ok) {
            try {
                choosen = random.nextInt(size);
                toReturn.add(sample.get(choosen));
                sample.remove(choosen);
            } catch (Exception e) {
            }
            // Exit condition
            if (sample.isEmpty()) {ok = true;}
        }
        return toReturn;
    }
    
    /**
     * Method to fill a index list from 0 to {@param listSize}
     * @param listSize list size of ArrayList{@code <Per>}
     * @return an integer ArrayList of Integers. 
     */
    private ArrayList<Integer> indexSample(int listSize){
        // Locals
        ArrayList<Integer> toReturn = new ArrayList<>();
        for (int i = 0; i < listSize; i++) {
            toReturn.add(i);
        }
        return toReturn;
    }
    
    /**
     * Method to create a random positions array to MultipleQuestions
     * @return an integer array
     */
    public int [] randomRespPos(){
        // Locals
        int [] toReturn = new int[NUM_MULT_QUESTIONS];
        int size = toReturn.length;
        int i, j, k, w;
        i = random.nextInt(size);
        j = random.nextInt(size);
        k = random.nextInt(size);
        w = random.nextInt(size);
        // Conditions to assign values
        while (i == j || j == k || j == w || i == k || i == w || k == w) {
            j = random.nextInt(size);
            while (k == i || k == j || k == w) {
                k = random.nextInt(size); 
                while (i == w || j == w || k == w) {
                    w = random.nextInt(size); 
                }
            }
        }
        toReturn[0] = i; toReturn[1] = j; toReturn[2] = k; toReturn[3] = w; 
        
        return toReturn;
    }
    
    /**
     * Create a random FalseResponse list from the ArrayList{@code <Per>}<br> 
     * to use on object MultipleQuestions.
     * 
     * @param listPer Per list read from the specific file
     * @return  ArrayList{@code <FalseResponse>} to MultipleQuiz
     */
    public ArrayList<FalseResponse> createFalseRespList(ArrayList<Per> listPer){
        // Locals
        ArrayList<FalseResponse> toReturn = new ArrayList<>();
        int size = listPer.size();
        // Loop to assign random values index to i, j and k 
        int current = 0;
        while (toReturn.size() < size) {
            FalseResponse fr = new FalseResponse();
            int i, j, k;
            // Temp values
            i = random.nextInt(size);
            j = random.nextInt(size);
            k = random.nextInt(size);
            String currentResp = listPer.get(current).getElementResponse();
            fr.setFalseResponse1(listPer.get(i).getElementResponse());
            fr.setFalseResponse2(listPer.get(j).getElementResponse());
            fr.setFalseResponse3(listPer.get(k).getElementResponse());
            // Condition to don't choice same response - falseResponse
            while (
                fr.getFalseResponse1().equals(currentResp)
                ) {
                i = random.nextInt(size);
                fr.setFalseResponse1(listPer.get(i).getElementResponse());
            }
            while (
                fr.getFalseResponse2().equals(currentResp) ||
                fr.getFalseResponse2().equals(fr.getFalseResponse1())
                ) {
                j = random.nextInt(size);
                fr.setFalseResponse2(listPer.get(j).getElementResponse());
                while (
                    fr.getFalseResponse3().equals(currentResp) ||
                    fr.getFalseResponse3().equals(fr.getFalseResponse2()) ||
                    fr.getFalseResponse3().equals(fr.getFalseResponse1())
                    ) {
                    k = random.nextInt(size);
                    fr.setFalseResponse3(listPer.get(k).getElementResponse());
                }
            }
            toReturn.add(fr);
            current++;
        }
        return toReturn;
    }
    
    
    
}
