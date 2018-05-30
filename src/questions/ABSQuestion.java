/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questions;

import dataInput.Choice;
import dataInput.KeyboardEntry;
import dataInput.MyFileReader;
import dataInput.Per;
import java.util.ArrayList;

/**
 *
 * @author eleves
 */
public abstract class ABSQuestion
{
    // Objects
    public String question;
    public String response;
    //
    public ArrayList<Per> listPer = new ArrayList<>();
    public MyFileReader frIn = new MyFileReader();
    public Choice choice = new Choice();
    public KeyboardEntry ke = new KeyboardEntry();
}
