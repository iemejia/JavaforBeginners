import java.time.DayOfWeek;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.Year;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class LearnAboutDates {
    public static void main(String[] args) {
        long timestamp = System.currentTimeMillis();
        System.out.println("Current timestamp: " + timestamp);

        Instant now = Instant.now();
        System.out.println("Current instant: " + now);

        Instant other = Instant.ofEpochSecond(12569537);
        System.out.println("Other instant from UNIX time: " + other);

        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(1990, Month.OCTOBER, 25);
        DayOfWeek dayOfBirth = birthday.getDayOfWeek();

        LocalDate nextBirthday = birthday.with(Year.of(today.getYear()));
        if (nextBirthday.isBefore(today) || nextBirthday.equals(today)) {
            nextBirthday = nextBirthday.plusYears(1);
        }

        Period periodUntilNextBirthday = today.until(nextBirthday);
        // Period.between(today, nextBirthday);
        long daysUntilBirthday = ChronoUnit.DAYS.between(today, nextBirthday);
        System.out.println(daysUntilBirthday + " days until next birthday");

        LocalDate orderGiftDate = nextBirthday.minusWeeks(2);
        System.out.println("Don't forget to buy a gift the " + orderGiftDate);

        LocalTime whattimesisit = LocalTime.now();
        LocalDateTime nextBirtDateTime = nextBirthday.atStartOfDay();
        Duration durationUntilNextBirthday = Duration.between(today.atStartOfDay(), nextBirtDateTime);
        Duration twoHours = Duration.ofHours(2);

        ZonedDateTime birthdayAtSydney = nextBirthday.atStartOfDay(ZoneId.of("Australia/Sydney"));
        System.out.println(birthdayAtSydney);

        ZonedDateTime birthdayAtMyZone = birthdayAtSydney.withZoneSameInstant(ZoneId.systemDefault());
        System.out.println(birthdayAtMyZone);
    }
}
