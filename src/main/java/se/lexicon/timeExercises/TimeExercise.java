package se.lexicon.timeExercises;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TimeExercise {
    public static void main(String[] args) {
        //Exercise 1
        LocalDate today = LocalDate.now();
        System.out.println(today);

        //Exercise 2
        String custom = today.format(DateTimeFormatter.ofPattern("eeee d MMMM"));
                System.out.println(custom);

        //Exercise 3
        String dateString = "2024-03-05";

        LocalDate date = LocalDate.parse(dateString);
        System.out.println("Parsed localDate: " + date);

        //Exercise 4

    }
}
