package dataOutput;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * Class to get the current date and time
 * @author sire_marcos
 */
public class DateTime {
    // Objects
    private LocalDate currentDate;
    private LocalTime currentTime;
    private DateTimeFormatter formatTime;
    private DateTimeFormatter formatDate;
    private final String TIME_FORMAT = "hh:mm:ss";
    private final String DATE_FORMAT = "yyyy-MM-dd";
    // Constructor
    public DateTime() {
        this.formatTime = DateTimeFormatter.ofPattern(TIME_FORMAT);
        this.formatDate = DateTimeFormatter.ofPattern(DATE_FORMAT);
    }
    // Getters
    public LocalDate getCurrentDate() {
        this.currentDate = LocalDate.now();
        return currentDate;
    }

    public String getCurrentTime() {
        // Locals
        String time;
        // Objects
        this.currentTime = LocalTime.now();
        time = this.currentTime.format(formatTime);
        return time;
    }

    public void setCurrentDate(String currentDate) {
        this.currentDate = LocalDate.parse(currentDate, formatDate);
    }

    public void setCurrentTime(String currentTime) {
        this.currentTime = LocalTime.parse(currentTime, formatTime);
    }
    
    
}
