/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainPack;

import dataInput.FalseResponse;
import dataInput.MyFileReader;
import dataOutput.DateTime;
import questions.HomeQuiz;

/**
 *
 * @author eleves
 */
public class Main
{
    static MyFileReader mfr;
    static DateTime d;
    static HomeQuiz hq;
    static FalseResponse fr;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        
        hq = new HomeQuiz();
        hq.start();
  
    }
    
}
