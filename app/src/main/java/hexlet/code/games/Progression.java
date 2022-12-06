package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {

    public static final int MIN_PROGR_LENGTH = 5;
    public static final int MAX_PROGR_LENGTH = 8;
    public static final int MIN_PROGR_DIFF = 4;
    public static final int MAX_PROGR_DIFF = 13;
    public static final int SECRET_POS_KOEF = 1;
    public static final int MIN_PROGR_START = 5;
    public static final int MAX_PROGR_START = 8;

    public static int[] createProgression(int progLength, int progDiff, int progressionStart) {

        int[] progression = new int[progLength];
        progression[0] = progressionStart;

        for (int i = 1; i < progLength; i++) {
            progression[i] = progression[i - 1] + progDiff;
        }

        return progression;
    }

    public static void startGame() {
        String rules = "What number is missing in the progression?";
        String[][] questionsAndAnswers = new String[Engine.MAX_CYCLES][Engine.MAX_CYCLES];

        for (int i = 0; i < Engine.MAX_CYCLES; i++) {

            final int progLength = Utils.getRandomNumber(MIN_PROGR_LENGTH, MAX_PROGR_LENGTH);
            final int progDiff = Utils.getRandomNumber(MIN_PROGR_DIFF, MAX_PROGR_DIFF);
            final int secretNumberPos = (int) (Math.random() * (progLength - SECRET_POS_KOEF));
            final int progressionStart = Utils.getRandomNumber(MIN_PROGR_START, MAX_PROGR_START);
            int[] progression = createProgression(progLength, progDiff, progressionStart);

            StringBuilder question = new StringBuilder();

            for (int j = 0; j < progLength; j++) {
                if (j == secretNumberPos) {
                    question.append(".. ");
                } else if (j == progLength - 1) {
                    question.append(progression[j]);
                } else {
                    question.append(progression[j]).append(" ");
                }
            }

            questionsAndAnswers[i][Engine.QUESTION] = String.valueOf(question);
            questionsAndAnswers[i][Engine.ANSWER] = Integer.toString(progression[secretNumberPos]);

        }
        Engine.gameMechanics(questionsAndAnswers, rules);
    }

}
