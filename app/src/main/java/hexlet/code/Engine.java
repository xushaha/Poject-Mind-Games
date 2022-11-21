package hexlet.code;
import java.util.Scanner;

public class Engine {

    //  Методы для всех игр

    //получение юзернейма
    private static String userName;
    public static String getUserName() {
        return userName;
    }
    public static void setUserName(String name) {
        userName = name;
    }

// приветствие
    public static void userGreeting() {
        Scanner scUserName = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        setUserName(scUserName.nextLine());
        System.out.println("Hello, " + getUserName() + "!");

    }

//получение ответа пользователя
    public static String getUserAnswer() {
        Scanner scUserAnswer = new Scanner(System.in);
        return scUserAnswer.nextLine().toLowerCase();

    }


// формирование строки с рузельтатом (выгирыш/проигрыш)
    public static void gameResultWin() {
        System.out.println("Congratulations, " + getUserName() + "!");
    }
    public static void gameResultLoss() {
        System.out.println("Let's try again, " + getUserName() + "!");
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

    public static void checkAnswers(String[][] gameEngine) {

        for (int i = 0; i < MAX_CYCLES; i++) {
            System.out.println("Question: " + gameEngine[i][0]);
            String userAnswer = Engine.getUserAnswer();
            System.out.println("Your answer: " + userAnswer);

            if (userAnswer.equals(gameEngine[i][1])) {
                System.out.println("Correct!");
                correctCount += 1;
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '"
                    + gameEngine[i][1] + "'.");
                Engine.gameResultLoss();
                break;
            }

            if (correctCount == MAX_CYCLES) {
                Engine.gameResultWin();
            }

        }
    }
}
