/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainPack;

import dataInput.MyFileReader;
import dataOutput.DateTime;

/**
 *
 * @author eleves
 */
public class Main
{
    static MyFileReader mfr;
    static DateTime d;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception
    {
        mfr = new MyFileReader();
        d = new DateTime();
        mfr.setURL("/Users/sire_marcos/projects/java_netbeans/MegaQuiz/files/fixes.txt");
        System.out.println(mfr.perList().get(0).getElementQuestion());
        System.out.println(d.getCurrentDate() +" " + d.getCurrentTime());
    }
    
}
