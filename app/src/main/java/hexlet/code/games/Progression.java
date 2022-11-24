package hexlet.code.games;

import hexlet.code.Engine;

public class Progression {

    public static final int MAX_PROGR_LENGTH = 8;
    public static final int MIN_PROGR_LENGTH = 5;

    public static final int MAX_PROGR_DIFF = 13;
    public static final int MIN_PROGR_DIFF = 4;

    public static final int SECRET_POS_KOEF = 1;

    public static final int MAX_PROGR_START = 8;
    public static final int MIN_PROGR_START = 5;


    public static int[] createProgression(int progLength, int progDiff, int progressionStart) {

        int[] progression = new int[progLength];
        progression[0] = progressionStart;

        for (int i = 1; i < progLength; i++) {
            progression[i] = progression[i - 1] + progDiff;
        }

        return progression;
    }

    public static String[][] generateGameData() {

        String[][] qaArray = new String[Engine.MAX_CYCLES][Engine.MAX_CYCLES];


        for (int i = 0; i < Engine.MAX_CYCLES; i++) {

            final int progLength = (int) (Math.random() * MAX_PROGR_LENGTH + MIN_PROGR_LENGTH);;
            final int progDiff = (int) (Math.random() * MAX_PROGR_DIFF + MIN_PROGR_DIFF);
            final int secretNumberPos = (int) (Math.random() * (progLength - SECRET_POS_KOEF));
            final int progressionStart = (int) (Math.random() * MAX_PROGR_START + MIN_PROGR_START);
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

            String correctAnswer = Integer.toString(progression[secretNumberPos]);

            qaArray[i][0] = String.valueOf(question);
            qaArray[i][1] = correctAnswer;

        }
        return qaArray;

    }


    public static String rules() {
        return "What number is missing in the progression?";
    }
}
