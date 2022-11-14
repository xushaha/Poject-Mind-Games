package hexlet.code.games;
import hexlet.code.Engine;

public class Progression {

    public static void gameProgression() {

        int correctCount = 0;

        while (correctCount < 3) {

            int progLength = (int) (Math.random() * 7 + 5);
            int progDiff = (int) (Math.random() * 12 + 4);
            int secretNumberPos = (int) (Math.random() * progLength);
            int progressionStart = (int) (Math.random() * 8 + 5);

            Engine.createProgression(progLength, progDiff, secretNumberPos, progressionStart);
            int progUserAnswer = Engine.getUserAnswerInt();
            System.out.println("Your answer: " + progUserAnswer);
            int progCorrAnswer = Engine.getCorrAnswerProgression(progLength, progDiff, secretNumberPos,
                    progressionStart);

            if (progUserAnswer == progCorrAnswer) {
                System.out.println("Correct!");
                correctCount++;
                if (correctCount == 3) {
                    Engine.gameResultWin();
                }
            } else {
                System.out.println("'" + progUserAnswer + "' is wrong answer ;(. Correct answer was '"
                        + progCorrAnswer + "'.");
                Engine.gameResultLoss();
                break;
            }
        }
  }
}
