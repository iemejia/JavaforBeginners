import java.sql.Date;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class LearnAboutDates2 {
    public static void main(String[] args) {
        String lastmodified = "10-25-2020 23:10:50";
        LocalDateTime parsedDate = LocalDateTime.parse(lastmodified, DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss"));
        System.out.println(parsedDate);

        String format = parsedDate.format(DateTimeFormatter.ofPattern("yyyy/MM/dd"));
        System.out.println(format);

        String formatUK = parsedDate.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).withLocale(Locale.UK));
        System.out.println(formatUK);

        //Old Java API
        java.util.Date date = new java.util.Date();
        Instant instantFromDate = date.toInstant();
        java.util.Date date2 = java.util.Date.from(Instant.now());

        Calendar calendar = new GregorianCalendar(2020, Calendar.OCTOBER, 25);
        Instant instantFromCalendar = calendar.toInstant();
        ZonedDateTime zonedDateTimeFromCalendar = calendar.toInstant().atZone(ZoneId.systemDefault());

        // SQL API
        java.sql.Timestamp sqlTimestamp = java.sql.Timestamp.from(Instant.now());
        Instant instantFromSQLTimestamp = sqlTimestamp.toInstant();

        java.sql.Date sqlDate = new java.sql.Date(System.currentTimeMillis());
        Date sqlDateFromLocalDate = java.sql.Date.valueOf(LocalDate.of(2021, Month.OCTOBER, 25));
        LocalDate localDate = sqlDateFromLocalDate.toLocalDate();

        System.out.println("Thanks and please don't forget to keep your date APIs tidy!");
    }
}
