package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.PrimeNumber;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class Menu {
    public static final int CHOICE_EXIT = 0;
    public static final int CHOICE_GREETING = 1;
    public static final int CHOICE_EVEN = 2;
    public static final int CHOICE_CALC = 3;
    public static final int CHOICE_GCD = 4;
    public static final int CHOICE_PROGRESSION = 5;
    public static final int CHOICE_PRIME_NUMBER = 6;

    public static void gameChoice() {

        Scanner gameChoice = new Scanner(System.in);
        int choice = gameChoice.nextInt();

        System.out.println("Your choice: " + choice);

        switch (choice) {
            case CHOICE_EXIT -> System.out.println("Bye, see you soon!");
            case CHOICE_GREETING -> Cli.greeting();
            case CHOICE_EVEN -> {
                Engine.userGreeting();
                System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
                Engine.checkAnswers(Even.getQaArrayEven());
            }
            case CHOICE_CALC -> {
                Engine.userGreeting();
                System.out.println("What is the result of the expression?");
                Engine.checkAnswers(Calc.getQaArrayCalc());
            }
            case CHOICE_GCD -> {
                Engine.userGreeting();
                System.out.println("Find the greatest common divisor of given numbers.");
                Engine.checkAnswers(GCD.getQaArrayGCD());
            }
            case CHOICE_PROGRESSION -> {
                Engine.userGreeting();
                System.out.println("What number is missing in the progression?");
                Engine.checkAnswers(Progression.getQaArrayProgression());
            }
            case CHOICE_PRIME_NUMBER -> {
                Engine.userGreeting();
                System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
                Engine.checkAnswers(PrimeNumber.getQaArrayPrimeNumber());
            }
            default -> System.out.println("Try again");
        }
    }
}
