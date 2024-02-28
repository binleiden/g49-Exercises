package se.lexicon;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        // define the range
        int max = 500;
        int min = 1;
        int range = max - min + 1;

        // generate random numbers within 1 to 500
        int rand = (int) (Math.random() * range) + min;
        //user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Make a guess");
        int userInput;
        userInput = scanner.nextInt();
        // Output is different everytime this code is executed
        //System.out.println(rand);

        // Game loop
        while (rand != userInput) {
            System.out.println("wrong guess again");
            userInput = scanner.nextInt();
            {
            }
            if (userInput < rand) {
                System.out.println("To low");

            } else if (userInput > rand) {
                System.out.println("To high");

            } else if (userInput == rand) {
                System.out.println("You made it!");
                break;


            }
        }
    }
}
