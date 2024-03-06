package se.lexicon.timeExercises;


import java.time.*;
import java.time.format.DateTimeFormatter;

import static java.time.LocalDate.parse;

public class TimeExercise {
    public static void main(String[] args) {
        //Exercise 1
        LocalDate today = LocalDate.now();
        System.out.println(today);

        //Exercise 2
        String custom = today.format(DateTimeFormatter.ofPattern("eeee d MMMM"));
                System.out.println(custom);

        //Exercise 3
       LocalDate lastMonday = LocalDate.of(2024,2,26);

       for (int i = 0; i < 7; i++ ){
           System.out.println(lastMonday);
           lastMonday = lastMonday.plusDays(1);
       }

        //Exercise 4
        String dateString = "2024-03-05";

        LocalDate date = parse(dateString);
        System.out.println("Parsed localDate: " + date);

        //Exercise 5
        LocalDate myBirthDay = LocalDate.of(1983,3,22);

        DayOfWeek dayOfWeek = myBirthDay.getDayOfWeek();
        System.out.println("My birth day falls on a " + dayOfWeek);

        //Exercise 6
        LocalDate futureMonth = LocalDate.of(2024,3,6);
        futureMonth = futureMonth.plusYears(10);
        futureMonth = futureMonth.minusMonths(10);
        System.out.println(futureMonth);

        //Exercise 7
        LocalDate from = myBirthDay;
        LocalDate to = futureMonth;
        Period period = Period.between(from, to);
        System.out.println(period);
        System.out.println(period.getYears()+ " years");
        System.out.println(period.getMonths()+ " months");
        System.out.println(period.getDays()+ " days");

        //Exercise 8
        LocalDate currentDate = LocalDate.now();
        Period add = period.of(4,7,29);
        LocalDate futureDate = currentDate.plus(add);
        System.out.println(futureDate);

        //Exercise 9
        LocalTime currentTime = LocalTime.now();

        //Exercise 10
        int nanoseconds = currentTime.getNano();
        System.out.println(nanoseconds);

        //Exercise 11
        String timeString = "10:53:06";

        LocalTime localTimeObj = LocalTime.parse(timeString);
        System.out.println("Parsed localtime: " + localTimeObj);

        //Exercise 12
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String formattedTime = currentTime.format(formatter);
        System.out.println(formattedTime);

        //Exercise 13
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter dateTime = DateTimeFormatter.ofPattern("Y-M-dd, HH:mm");
        String formatedDateTime = now.format(dateTime);
        System.out.println(formatedDateTime);

        //Exercise 14
        DateTimeFormatter dagTid = DateTimeFormatter.ofPattern("eeee d MMMM, HH:mm");
        String formatedDagTid = now.format(dagTid);
        System.out.println(formatedDagTid);

        //Exercise 15
        LocalDate localDate = LocalDate.now();
        LocalTime localtime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.of(localDate, localtime);
        System.out.println(localDateTime);

        //Exercise 16
        LocalDate todaysdate = localDateTime.toLocalDate();
        LocalTime timenow = localDateTime.toLocalTime();
        System.out.println("Todays date extracted: " +todaysdate);
        System.out.println("Time extracted: " +timenow);

    }
}
