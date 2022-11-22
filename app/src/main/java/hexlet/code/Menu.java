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

    static String rulesEven = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    static String rulesCalc = "What is the result of the expression?";
    static String rulesGCD = "Find the greatest common divisor of given numbers.";
    static String rulesProgression = "What number is missing in the progression?";
    static String rulesPrimeNumber = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";


    public static void gameChoice() {

        Scanner gameChoice = new Scanner(System.in);
        int choice = gameChoice.nextInt();

        System.out.println("Your choice: " + choice);

        switch (choice) {
            case CHOICE_EXIT -> System.out.println("Bye, see you soon!");
            case CHOICE_GREETING -> Cli.greeting();
            case CHOICE_EVEN -> Engine.checkAnswers(Even.getQaArrayEven(), rulesEven);
            case CHOICE_CALC -> Engine.checkAnswers(Calc.getQaArrayCalc(), rulesCalc);
            case CHOICE_GCD -> Engine.checkAnswers(GCD.getQaArrayGCD(), rulesGCD);
            case CHOICE_PROGRESSION -> Engine.checkAnswers(Progression.getQaArrayProgression(), rulesProgression);
            case CHOICE_PRIME_NUMBER -> Engine.checkAnswers(PrimeNumber.getQaArrayPrimeNumber(), rulesPrimeNumber);
            default -> System.out.println("Try again");
        }
    }
}
