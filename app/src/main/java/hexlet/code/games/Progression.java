package hexlet.code.games;
import hexlet.code.Engine;

public class Progression {

    public static void gameProgression() {

        int correctCount = 0;

        while (correctCount < Engine.MAX_CYCLES) {

            int progLength = Engine.getProgLength();
            int progDiff = Engine.getProgDiff();
            int secretNumberPos = Engine.getSecretNumberPos();
            int progressionStart = Engine.getProgressionStart();

            Engine.createProgression(progLength, progDiff, secretNumberPos, progressionStart);
            int progUserAnswer = Engine.getUserAnswerInt();
            System.out.println("Your answer: " + progUserAnswer);
            int progCorrAnswer = Engine.getCorrAnswerProgression(progLength, progDiff, secretNumberPos,
                    progressionStart);

            if (progUserAnswer == progCorrAnswer) {
                System.out.println("Correct!");
                correctCount++;
                if (correctCount == Engine.MAX_CYCLES) {
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
