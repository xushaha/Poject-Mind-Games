package hexlet.code;
import java.util.Scanner;

public class Engine {

    //  Методы для всех игр
    private static String userName;
    public static final int MAX_CYCLES = 3;
    public static final int MAX_RAND_NUMBER = 100;
    public static final int MIN_RAND_NUMBER = 1;

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

    public static int getRandomNumber() {
        return (int) (Math.random() * MAX_RAND_NUMBER + MIN_RAND_NUMBER);
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

    public static final int MAX_PROGR_LENGTH = 7;
    public static final int MIN_PROGR_LENGTH = 5;

    public static final int MAX_PROGR_DIFF = 12;
    public static final int MIN_PROGR_DIFF = 4;

    public static final int SECRET_POS_KOEF = 1;
    public static final int MAX_PROGR_START = 8;
    public static final int MIN_PROGR_START = 5;

    public static int getProgLength() {
        return (int) (Math.random() * MAX_PROGR_LENGTH + MIN_PROGR_LENGTH);
    }

    public static int getProgDiff() {
        return (int) (Math.random() * MAX_PROGR_DIFF + MIN_PROGR_DIFF);
    }

    public static int getSecretNumberPos() {
        return (int) (Math.random() * getProgLength() - SECRET_POS_KOEF);
    }

    public static int getProgressionStart() {
        return (int) (Math.random() * MAX_PROGR_START + MIN_PROGR_START);
    }


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
    public static final int MAX_PPIME_NUMBER = 98;
    public static final int MIN_PPIME_NUMBER = 2;
    public static int getNumberPrime() {
        return (int) (Math.random() * MAX_PPIME_NUMBER + MIN_PPIME_NUMBER);
    }

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




}

