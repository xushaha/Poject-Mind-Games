package hexlet.code.games;
import hexlet.code.Engine;

public class PrimeNumber {

    public static void gamePrimeNumber() {

        int correctCount = 0;

        while (correctCount < Engine.MAX_CYCLES) {

            int questionPrimeNumber = Engine.getRandomNumber();
            System.out.println("Question: " + questionPrimeNumber);

            String primeNumberUserAnswer = Engine.getUserAnswerString();
            System.out.println("Your answer: " + primeNumberUserAnswer);
            boolean primeNumberCorrAnswer = Engine.isPrimeNumber(questionPrimeNumber);
            String primeNumberAnswer = (primeNumberCorrAnswer) ? "yes" : "no";


            if (primeNumberAnswer.equals(primeNumberUserAnswer)) {
                System.out.println("Correct!");
                correctCount++;
                if (correctCount == Engine.MAX_CYCLES) {
                    Engine.gameResultWin();
                }
            } else {
                System.out.println("'" + primeNumberUserAnswer + "' is wrong answer ;(. Correct answer was '"
                        + primeNumberAnswer + "'.");
                Engine.gameResultLoss();
                break;
            }
        }
    }
}
