package hexlet.code.games;
import hexlet.code.Engine;

public class GCD {

    public static void gameGCD() {

        int correctCount = 0;
        int maxCycles = 3;

        while (correctCount < maxCycles) {
            int randNumb1 = Engine.getRandomNumber();
            int randNumb2 = Engine.getRandomNumber();
            int gcd = Engine.findCGD(randNumb1, randNumb2);

            System.out.println("Question: " + randNumb1 + " " + randNumb2);
            int gcdUserAnswer = Engine.getUserAnswerInt();
            System.out.println("Your answer: " + gcdUserAnswer);

            if (gcdUserAnswer == gcd) {
                System.out.println("Correct!");
                correctCount++;
                if (correctCount == 3) {
                    Engine.gameResultWin();
                }
            } else {
                System.out.println("'" + gcdUserAnswer + "' is wrong answer ;(. Correct answer was '" + gcd + "'.");
                Engine.gameResultLoss();
                break;
            }
        }
    }
}
