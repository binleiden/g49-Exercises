package se.lexicon;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Whats your name?");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);
    }
}
