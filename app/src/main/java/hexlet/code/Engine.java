package hexlet.code;
import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.PrimeNumber;
import hexlet.code.games.Progression;
import java.util.Scanner;

public class Engine {

    //  Методы для всех игр
    private static String userName;

    public static void gameChoice() {
        Scanner gameChoice = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("6 - Prime number");
        System.out.println("5 - Progression");
        System.out.println("4 - GCD");
        System.out.println("3 - Calc");
        System.out.println("2 - Even");
        System.out.println("1 - Greet");
        System.out.println("0 - Exit");

        int choice = gameChoice.nextInt();
        System.out.println("Your choice: " + choice);

        switch (choice) {
            case 0 -> System.out.println("Bye, see you soon!");
            case 1 -> Cli.greeting();
            case 2 -> {
                Engine.userGreeting();
                System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
                Even.gameEven();
            }
            case 3 -> {
                Engine.userGreeting();
                System.out.println("What is the result of the expression?");
                Calc.gameCalc();
            }
            case 4 -> {
                Engine.userGreeting();
                System.out.println("Find the greatest common divisor of given numbers.");
                GCD.gameGCD();
            }
            case 5 -> {
                Engine.userGreeting();
                System.out.println("What number is missing in the progression?");
                Progression.gameProgression();
            }
            case 6 -> {
                Engine.userGreeting();
                System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
                PrimeNumber.gamePrimeNumber();
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



    // Методы для игры GCD
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



    // Методы для игры Прогрессия
    public static void createProgression(int progLength, int progDiff, int secretNumberPos, int progressionStart) {

        int[] progression = new int[progLength];
        progression[0] = progressionStart;

        for (int i = 1; i < progLength; i++) {
            progression[i] = progression[i - 1] + progDiff;
        }

        System.out.print("Question: ");

        for (int j = 0; j < progLength; j++) {
            if (j == secretNumberPos) {
                System.out.print(".. ");
            } else if (j == progLength - 1) {
                System.out.println(progression[j]);
            } else {
                System.out.print(progression[j] + " ");
            }
        }

    }

    public static int getCorrAnswerProgression(int progLength, int progDiff, int secretNumberPos,
                                               int progressionStart) {
        int[] progression = new int[progLength];
        progression[0] = progressionStart;

        for (int i = 1; i < progLength; i++) {
            progression[i] = progression[i - 1] + progDiff;
        }

        return progression[secretNumberPos];
    }

    // Методы для игры Простое число
    public static boolean isPrimeNumber(int questionPrimeNumber) {
        boolean prime = false;

        for (int i = 2; i < questionPrimeNumber; i++) {
            if (questionPrimeNumber % i == 0) {
                prime = false;
                break;
            } else {
                prime = true;
            }
        }
        return prime;
    }

    public static int getRandomNumber() {
        int minNumber = 1;
        int maxNumber = 100;
        return (int) (Math.random() * maxNumber + minNumber);
    }


}

