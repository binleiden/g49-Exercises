package se.lexicon;

import java.util.Scanner;

public class Hours {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter seconds and ill tell you how many hours it is!");
        int seconds = scanner.nextInt();

        double actualQuotient = (double)seconds / 3600;
        System.out.println(actualQuotient);
    }
}
