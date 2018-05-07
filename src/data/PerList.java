
package data;

import java.util.ArrayList;

/**
 *
 * @author eleves
 */
public class PerList extends ArrayList<Per>
{
    //Constructor
    public PerList()
    {
        
    }
    

    //Setters and getters
    public ArrayList<Per> getList() {return this;}

    public void setList(Per per) {add(per);}

    @Override
    public String toString()
    {
        return "PerList{" + '}';
    }

    
    
}
