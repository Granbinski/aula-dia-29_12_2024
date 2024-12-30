package app;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Program {
    public static void main(String[] args) {

        LocalDate d04 = LocalDate.parse("2024-12-29");
        LocalDateTime d05 = LocalDateTime.parse("2024-12-29T01:30:26");
        Instant d06 = Instant.parse("2024-12-29T01:01:30Z"); 

        LocalDate pastWeekLocalDate = d04.minusDays(7);
        LocalDate nextWeekLocalDate = d04.plusDays(7);

        System.out.println("past week date: " + pastWeekLocalDate);
        System.out.println("next week date: " + nextWeekLocalDate);
        System.out.println("parsed instant: " + d06);
    }
}
