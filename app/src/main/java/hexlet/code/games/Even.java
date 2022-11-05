package hexlet.code.games;
import hexlet.code.Engine;


public class Even {

    public static void gameEven() {

        int correctCount = 0;

        String posAns = "yes";
        String negAns = "no";

        while (correctCount < 3) {
            int randNumb = (int) (Math.random() * 100 + 1);
            System.out.println(randNumb);
            String evenUserAnswer = Engine.getUserAnswerString();

            if ((randNumb % 2 == 0) && (evenUserAnswer.equals(posAns))
                    || (randNumb % 2 != 0) && (evenUserAnswer.equals(negAns))) {
                System.out.println("Correct!");
                correctCount++;
                if (correctCount == 3) {
                    Engine.gameResultWin();
                }
            } else {
                if (randNumb % 2 == 0) {
                    System.out.println("'" + evenUserAnswer + "' is wrong answer ;(. Correct answer was 'yes'.");
                    Engine.gameResultLoss();
                }
                if (randNumb % 2 != 0) {
                    System.out.println("'" + evenUserAnswer + "' is wrong answer ;(. Correct answer was 'no'.");
                    Engine.gameResultLoss();
                }
               break;
            }
        }
    }
}
