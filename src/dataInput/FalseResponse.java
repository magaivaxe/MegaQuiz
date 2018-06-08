/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataInput;

/**
 *
 * @author mpgsa
 */
public class FalseResponse {
    // Fields
    private String falseResponse1;
    private String falseResponse2;
    private String falseResponse3;
    // Constructor
    public FalseResponse() { }
    // Setters and getters

    public String getFalseResponse1() {
        return falseResponse1;
    }

    public void setFalseResponse1(String falseResponse1) {
        this.falseResponse1 = falseResponse1;
    }

    public String getFalseResponse2() {
        return falseResponse2;
    }

    public void setFalseResponse2(String falseResponse2) {
        this.falseResponse2 = falseResponse2;
    }

    public String getFalseResponse3() {
        return falseResponse3;
    }

    public void setFalseResponse3(String falseResponse3) {
        this.falseResponse3 = falseResponse3;
    }
    
    public int getSizeFalseResponses(){
        return this.getClass().getDeclaredFields().length;
    }
    
}
