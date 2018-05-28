/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainPack;

import dataApp.MyFileReader;

/**
 *
 * @author eleves
 */
public class Main
{
    static MyFileReader mfr;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        mfr = new MyFileReader();
        System.out.println(mfr.listFromReader().get(0).getElementQuestion());
    }
    
}
