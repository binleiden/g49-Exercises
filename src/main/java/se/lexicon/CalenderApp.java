package se.lexicon;

import java.time.*;
import java.util.Calendar;

public class CalenderApp {
    public static void main(String[] args) {
        FirstDay();
        Month();


    }

    private static void Month() {
        for (Month month : Month.values()) {
            // Get the number of days in the current month
            YearMonth yearMonth = YearMonth.of(2018, month);
            int numberOfDaysInMonth = yearMonth.lengthOfMonth();

            // Print the name of the month and the number of days
            System.out.println(month + ": " + numberOfDaysInMonth + " days");
        }
    }

    private static void FirstDay() {
        LocalDate firstDay = LocalDate.of(2018,1,1);
        DayOfWeek day = firstDay.getDayOfWeek();
        System.out.println(day);
    }




}
