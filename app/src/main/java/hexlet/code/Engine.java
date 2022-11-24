package hexlet.code;
import java.util.Scanner;

public class Engine {

//получение юзернейма
    private static String userName;
    public static String getUserName() {
        return userName;
    }
    public static void setUserName(String name) {
        userName = name;
    }

//получение случайного числа от 1 до 100
    public static final int MAX_RAND_NUMBER = 100;
    public static final int MIN_RAND_NUMBER = 1;
    public static int getRandomNumber() {
        return (int) (Math.random() * MAX_RAND_NUMBER + MIN_RAND_NUMBER);
    }


//цикл вывода вопроса и проверки ответа
    private static int correctCount = 0;
    public static final int MAX_CYCLES = 3;

    public static void launchGame(String[][] gameEngine, String rules) {
        Scanner scUserName = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scUserName.nextLine();
        System.out.println("Hello, " + userName + "!");

        System.out.println(rules);


        for (int i = 0; i < MAX_CYCLES; i++) {
            System.out.println("Question: " + gameEngine[i][0]);
            Scanner scUserAnswer = new Scanner(System.in);
            String userAnswer = scUserAnswer.nextLine().toLowerCase();
            System.out.println("Your answer: " + userAnswer);

            if (userAnswer.equals(gameEngine[i][1])) {
                System.out.println("Correct!");
                correctCount += 1;
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '"
                    + gameEngine[i][1] + "'.");
                System.out.println("Let's try again, " + userName + "!");
                break;
            }
        }

        if (correctCount == MAX_CYCLES) {
            System.out.println("Congratulations, " + userName + "!");
        }

    }
}
