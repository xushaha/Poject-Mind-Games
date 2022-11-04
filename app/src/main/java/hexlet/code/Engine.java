package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;

import java.util.Scanner;

public class Engine {
public static String userName;
public static final int COUNT_OF_QUESTIONS = 3;
public static final int RANDOMIZE_MULTIPLIER = 100;

    public static void gameChoice() {
        Scanner gameChoice = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("4 - GCD");
        System.out.println("3 - Calc");
        System.out.println("2 - Even");
        System.out.println("1 - Greet");
        System.out.println("0 - Exit");

        int choice = gameChoice.nextInt();
        System.out.println("Your choice: " + choice);

        Engine.userGreeting();

        switch (choice) {
            case 0 -> System.out.println("Bye, see you soon!");
            case 1 -> Cli.greeting();
            case 2 -> {
                System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
                Even.gameEven();
            }
            case 3 -> {
                System.out.println("What is the result of the expression?");
                Calc.gameCalc();
            }
            case 4 -> {
                System.out.println("Find the greatest common divisor of given numbers.");
                GCD.gameGCD();
            }
            default -> System.out.println("Try again");
        }
        gameChoice.close();
    }

    public static String getUserName() {
        return userName;
    }
   public static void setUserName(String name) {
        userName = name;
    }

    public static void userGreeting() {
        Scanner scUserName = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        setUserName(scUserName.nextLine());
        System.out.println("Hello, " + getUserName() + "!");

    }

    public static void gameResultWin() {
        System.out.println("Congratulations, " + getUserName() + "!");
    }

    public static void gameResultLoss() {
        System.out.println("Let's try again, " + getUserName() + "!");
    }

    public static int getUserAnswerInt() {
        Scanner scUserAnswerInt = new Scanner(System.in);
        int userAnswerInt = scUserAnswerInt.nextInt();
        return userAnswerInt;
    }

    public static String getUserAnswerString() {
        Scanner scUserAnswerString = new Scanner(System.in);
        String userAnswerString = scUserAnswerString.nextLine().toLowerCase();
        return userAnswerString;
    }


    public static int findCGD(int randNumb1, int randNumb2) {


        while ((randNumb1 != 0) && (randNumb2 != 0)) {

            if (randNumb1 > randNumb2) {
                randNumb1 = randNumb1 % randNumb2;
            } else {
                randNumb2 = randNumb2 % randNumb1;
            }
        }
        return randNumb1 + randNumb2;
    }
}
