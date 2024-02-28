package se.lexicon;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        // User puts in seconds to be converted
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter seconds and ill tell you how many hours it is!");
        int totalSeconds = scanner.nextInt();

        //divide seconds with 3600 to get hours
        int hours = totalSeconds / 3600;
        int quotient = totalSeconds % 3600;
        int minutes = quotient / 60;
        int seconds = totalSeconds % 60;
        System.out.println(hours + ":" + minutes + ":" + seconds);


    }
}
