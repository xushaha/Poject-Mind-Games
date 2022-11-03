package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Scanner;

public class Calc {
    public static void gameCalc() {
        Scanner scCalc = new Scanner(System.in);



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
            int calcUserAnswer = Engine.getUserAnswerInt();
            System.out.println("Your answer: " + calcUserAnswer);

            if (((operatorSwitch == 0) && (calcUserAnswer == randNumb1 + randNumb2))
                    || ((operatorSwitch == 1) && (calcUserAnswer == randNumb1 - randNumb2))
                    || ((operatorSwitch == 2) && (calcUserAnswer == randNumb1 * randNumb2))) {
                System.out.println("Correct!");
                corrCountCalc++;

                if (corrCountCalc == 3) {
                    Engine.gameResultWin();
                }

            } else {
                System.out.println("'" + calcUserAnswer + "' is wrong answer ;(. Correct answer was '"
                        + correctAnswerCalc + "'.");
                Engine.gameResultLoss();
                break;
            }
        }
    }
}
