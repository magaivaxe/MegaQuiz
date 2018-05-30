package dataOutput;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author sire_marcos
 */
public class Dates {
    // Objects
    private Date current_date;
    private String modifiedDate;
    private final String FORMAT = "yyyy-mm-dd";
    private Calendar calendar;
    // Constructor
    public Dates() {
        this.modifiedDate = new SimpleDateFormat(FORMAT).format(current_date);
        this.calendar = Calendar.getInstance();
        this.current_date = calendar.getTime();
    }
    // Getters
    public Date getCurrent_date() {
        return current_date;
    }
    
    
}
