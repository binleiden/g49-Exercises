package se.lexicon;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        System.out.println("Lets do some math!");
        System.out.println("Enter two numbers and ill do the math for you!");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        System.out.println(num1 + num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2);
        System.out.println(num1 - num2);
    }
}
