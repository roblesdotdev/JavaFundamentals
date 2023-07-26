import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateTime {
    public static void main(String[] args) {
        Date today = new Date();
        System.out.println(today);

        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTime(today);
        Date todayCalendar = calendar.getTime();
        System.out.println(todayCalendar);

        System.out.println("Year " + calendar.get(Calendar.YEAR));
        System.out.println("Day " + calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println("Month " + calendar.get(Calendar.MONTH));

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String prettyDate = sdf.format(today);
        System.out.println(prettyDate);

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt.format(DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm")));
        LocalDate ld = LocalDate.of(2023, 7, 26);
        System.out.println(ld);

        LocalDate now = LocalDate.now();
        LocalDate yesterday = now.minusDays(1);
        LocalDate myBirthday = LocalDate.of(1994, 5, 2);
        System.out.println("Yesterday: " + yesterday);
        System.out.println("My birthday myBirthday: " + myBirthday);

        System.out.println("How many: " + Period.between(now, myBirthday));
    }
}
