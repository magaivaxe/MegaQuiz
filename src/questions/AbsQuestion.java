/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questions;

import dataApp.MyFileReader;
import dataApp.Per;
import java.util.ArrayList;

/**
 *
 * @author eleves
 */
public abstract class AbsQuestion
{
    //Fields
    public String question;
    public String response;
    //Objects
    public ArrayList<Per> listPer = new ArrayList<>();
    public MyFileReader mfr = new MyFileReader();
    public Choice choice = new Choice();
}
