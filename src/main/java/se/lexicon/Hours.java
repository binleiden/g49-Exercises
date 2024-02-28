package se.lexicon;

import java.util.Scanner;

public class Hours {
    public static void main(String[] args) {
        // User puts in seconds to be converted
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter seconds and ill tell you how many hours it is!");
        int seconds = scanner.nextInt();

        //divide seconds with 3600 to get hours
        double actualQuotient = (double)seconds / 3600;
        System.out.println(actualQuotient);
        int H = seconds / 3600
        //divide remaining with 60 to get minutes
        remainder = % 60
        int M = H % 60
        // remaining is seconds
        int S = M / 60
        // sout dislay 00:00:00
    }
}
