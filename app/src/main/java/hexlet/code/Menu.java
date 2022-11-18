package hexlet.code;

import hexlet.code.games.*;

import java.util.Scanner;

public class Menu {

        public static void gameChoice() {
                Scanner gameChoice = new Scanner(System.in);
                final int choice = gameChoice.nextInt();
                System.out.println("Your choice: " + choice);

                if (choice == 0) {
                        System.out.println("Bye, see you soon!");
                } else if (choice == 1) {
                        Cli.greeting();
                } else if (choice == 2) {
                        Engine.userGreeting();
                        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
                        Even.gameEven();
                } else if (choice == 3) {
                        Engine.userGreeting();
                        System.out.println("What is the result of the expression?");
                        Calc.gameCalc();
                } else if (choice == 4) {
                        Engine.userGreeting();
                        System.out.println("Find the greatest common divisor of given numbers.");
                        GCD.gameGCD();
                } else if (choice == 5) {
                        Engine.userGreeting();
                        System.out.println("What number is missing in the progression?");
                        Progression.gameProgression();
                } else if (choice == 6) {
                        Engine.userGreeting();
                        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
                        PrimeNumber.gamePrimeNumber();
                } else {
                        System.out.println("Try again");
                }
                gameChoice.close();
        }
}
