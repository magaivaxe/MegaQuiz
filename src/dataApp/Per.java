/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataApp;

/**
 * Save a per of: question and response from the file<br>
 * that come from BufferedReader
 * @author eleves
 */
public class Per
{
    //Fields
    private String elementQuestion;
    private String elementResponse;
    
    //Contructor void to call the objects
    public Per() {}
    
    // getters and setters
    public String getElementQuestion() { return elementQuestion;}
    
    public String getElementResponse() {return elementResponse;}

    public void setElementQuestion(String elementQuestion)
    { this.elementQuestion = elementQuestion;}

    public void setElementResponse(String elementResponse)
    { this.elementResponse = elementResponse;}
    
}
