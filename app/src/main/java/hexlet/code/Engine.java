package hexlet.code;
import java.util.Scanner;

public class Engine {

    //константы для цикла вывода вопроса и проверки ответа
    public static final int MAX_CYCLES = 3;
    public static final int QUESTION = 0;
    public static final int ANSWER = 1;

    public static void gameMechanics(String[][] questionsAndAnswers, String rules) {
        Scanner scUserName = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scUserName.nextLine();
        System.out.println("Hello, " + userName + "!");

        System.out.println(rules);
        int correctCount = 0;

        for (int i = 0; i < MAX_CYCLES; i++) {
            System.out.println("Question: " + questionsAndAnswers[i][QUESTION]);
            Scanner scUserAnswer = new Scanner(System.in);
            String userAnswer = scUserAnswer.nextLine().toLowerCase();
            System.out.println("Your answer: " + userAnswer);

            if (userAnswer.equals(questionsAndAnswers[i][ANSWER])) {
                System.out.println("Correct!");
                correctCount += 1;
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '"
                    + questionsAndAnswers[i][ANSWER] + "'.");
                System.out.println("Let's try again, " + userName + "!");
                break;
            }
        }

        if (correctCount == MAX_CYCLES) {
            System.out.println("Congratulations, " + userName + "!");
        }

    }
}
