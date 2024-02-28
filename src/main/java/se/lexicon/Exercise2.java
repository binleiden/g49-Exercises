package se.lexicon;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year to se if its a leapyer");
        int year = scanner.nextInt();
        if (year % 400 == 0){
            System.out.println("Its a leapyear!");
        } else if (year % 4 == 0 && year % 100 != 0) {
            System.out.println("Its a leapyear!");
        }else  {
            System.out.println("Its not a leapyear!");
        }
    }
}
