package hexlet.code;

import hexlet.code.games.*;

import java.util.Scanner;

public class Menu {

        public static void gameChoice() {

                final int CHOICE_EXIT = 0;
                final int CHOICE_GREETING = 1;
                final int CHOICE_EVEN = 2;
                final int CHOICE_CALC = 3;
                final int CHOICE_GCD = 4;
                final int CHOICE_PROGRESSION = 5;
                final int CHOICE_PRIME_NUMBER = 6;

                Scanner gameChoice = new Scanner(System.in);
                int choice = gameChoice.nextInt();

                System.out.println("Your choice: " + choice);

                switch (choice) {
                        case CHOICE_EXIT -> System.out.println("Bye, see you soon!");
                        case CHOICE_GREETING -> Cli.greeting();
                        case CHOICE_EVEN -> {
                                Engine.userGreeting();
                                System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
                                Even.gameEven();
                        }
                        case CHOICE_CALC -> {
                                Engine.userGreeting();
                                System.out.println("What is the result of the expression?");
                                Calc.gameCalc();
                        }
                        case CHOICE_GCD -> {
                                Engine.userGreeting();
                                System.out.println("Find the greatest common divisor of given numbers.");
                                GCD.gameGCD();
                        }
                        case CHOICE_PROGRESSION -> {
                                Engine.userGreeting();
                                System.out.println("What number is missing in the progression?");
                                Progression.gameProgression();
                        }
                        case CHOICE_PRIME_NUMBER -> {
                                Engine.userGreeting();
                                System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
                                PrimeNumber.gamePrimeNumber();
                        }
                        default -> System.out.println("Try again");
                }
        }
}
