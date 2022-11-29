package hexlet.code;
import java.util.Scanner;

public class Engine {

    public static void launchGame(String[][] gameEngine, String rules) {
        Scanner scUserName = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scUserName.nextLine();
        System.out.println("Hello, " + userName + "!");

        System.out.println(rules);
        int correctCount = 0;

        for (int i = 0; i < Utils.MAX_CYCLES; i++) {
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

        if (correctCount == Utils.MAX_CYCLES) {
            System.out.println("Congratulations, " + userName + "!");
        }

    }
}
