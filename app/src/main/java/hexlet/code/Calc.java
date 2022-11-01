package hexlet.code;
import java.util.Scanner;

public class Calc {
    public static void gameCalc() {
        Scanner scCalc = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String nameCalc = scCalc.nextLine();
        System.out.println("Hello, " + nameCalc + "!");

        System.out.println("What is the result of the expression?");

        int corrCountCalc = 0;

        while (corrCountCalc < 3) {
            int randNumb1 = (int) (Math.random() * 100 + 1);
            int randNumb2 = (int) (Math.random() * 100 + 1);
            String randOperator = new String();
            int operatorSwitch = (int) (Math.random() * 2 + 1);
            int correctAnswerCalc = 0;

            switch (operatorSwitch) {
                case 0 -> {
                    randOperator = "+";
                    correctAnswerCalc = randNumb1 + randNumb2;
                }
                case 1 -> {
                    randOperator = "-";
                    correctAnswerCalc = randNumb1 - randNumb2;
                }
                case 2 -> {
                    randOperator = "*";
                    correctAnswerCalc = randNumb1 * randNumb2;
                }
                default -> {
                    randOperator = "";
                    correctAnswerCalc = 1;
                }
            }
            System.out.println("Question: " + randNumb1 + randOperator + randNumb2);

            int answerCalc = scCalc.nextInt();
            System.out.println("Your answer: " + answerCalc);


            if (((operatorSwitch == 0) && (answerCalc == randNumb1 + randNumb2))
                    || ((operatorSwitch == 1) && (answerCalc == randNumb1 - randNumb2))
                    || ((operatorSwitch == 2) && (answerCalc == randNumb1 * randNumb2))) {
                System.out.println("Correct!");
                corrCountCalc++;

                if (corrCountCalc == 3) {
                    System.out.println("Congratulations, " + nameCalc + "!");
                }

            } else {
                System.out.println("'" + answerCalc + "' is wrong answer ;(. Correct answer was '" + correctAnswerCalc + "'.");
                System.out.println("Let's try again, " + nameCalc + "!");
                break;
            }


        }

    }
}
