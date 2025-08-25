import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class TimeDate {
    public static void main(String[] args) {
//        LocalDateTime CurrentTimeDate=LocalDateTime.now();
//        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyy-mm-dd hh:mm:ss");
//        String formattedDateTime=CurrentTimeDate.format(formatter);
//        System.out.println("Current date and Time :"+formattedDateTime);
        LocalDate cDate=LocalDate.now();
        LocalTime cTime=LocalTime.now();
        System.out.println("Date->"+cDate+"\n"+"Time->"+cTime);
    }
}
