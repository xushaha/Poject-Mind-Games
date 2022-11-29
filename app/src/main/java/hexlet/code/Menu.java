package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.PrimeNumber;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class Menu {

    public static final int GREETING = 1;
    public static final int EVEN = 2;
    public static final int CALC = 3;
    public static final int GREATESTCD = 4;
    public static final int PROGRESSION = 5;
    public static final int PRIME_NUMBER = 6;
    public static final int EXIT = 0;



    public static void gameChoice() {

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime number");
        System.out.println("0 - Exit");

        Scanner gameChoice = new Scanner(System.in);
        int choice = gameChoice.nextInt();

        System.out.println("Your choice: " + choice);

        switch (choice) {
            case EXIT -> System.out.println("Bye, see you soon!");
            case GREETING -> Cli.greeting();
            case EVEN -> Even.startGame();
            case CALC -> Calc.startGame();
            case GREATESTCD -> GCD.startGame();
            case PROGRESSION -> Progression.startGame();
            case PRIME_NUMBER -> PrimeNumber.startGame();
            default -> System.out.println("Invalid choice. Try again");
        }
    }
}
