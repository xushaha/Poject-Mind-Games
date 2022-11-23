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



    public static int getProgLength() {
        return (int) (Math.random() * MAX_PROGR_LENGTH + MIN_PROGR_LENGTH);
    }

    public static int getProgDiff() {
        return (int) (Math.random() * MAX_PROGR_DIFF + MIN_PROGR_DIFF);
    }

    public static int getSecretNumberPos(int progLenth) {
        return (int) (Math.random() * (progLenth - SECRET_POS_KOEF));
    }

    public static int getProgressionStart() {
        return (int) (Math.random() * MAX_PROGR_START + MIN_PROGR_START);
    }

    public static String createProgression(int progLength, int progDiff, int secretNumberPos, int progressionStart) {

        int[] progression = new int[progLength];
        progression[0] = progressionStart;
        StringBuilder progressionString = new StringBuilder();

        for (int i = 1; i < progLength; i++) {
            progression[i] = progression[i - 1] + progDiff;
        }

        for (int j = 0; j < progLength; j++) {
            if (j == secretNumberPos) {
                progressionString.append(".. ");
            } else if (j == progLength - 1) {
                progressionString.append(progression[j]);
            } else {
                progressionString.append(progression[j]).append(" ");
            }
        }
        return progressionString.toString();
    }

    public static String getCorrAnswer(int progLength, int progDiff, int secretNumberPos, int progressionStart) {

        int[] progression = new int[progLength];
        progression[0] = progressionStart;

        for (int i = 1; i < progLength; i++) {
            progression[i] = progression[i - 1] + progDiff;
        }

        return Integer.toString(progression[secretNumberPos]);
    }




    public static String[][] getQaArray() {

        String[][] qaArray = new String[Engine.MAX_CYCLES][Engine.MAX_CYCLES];

        for (int i = 0; i < Engine.MAX_CYCLES; i++) {

            final int progLength = getProgLength();
            final int progDiff = getProgDiff();
            final int secretNumberPos = getSecretNumberPos(progLength);
            final int progressionStart = getProgressionStart();

            String question = createProgression(progLength, progDiff, secretNumberPos,
                    progressionStart);
            String correctAnswer = getCorrAnswer(progLength, progDiff, secretNumberPos,
                    progressionStart);

            qaArray[i][0] = question;
            qaArray[i][1] = correctAnswer;

        }
        return qaArray;

    }



    public static String getRules() {
        return "What number is missing in the progression?";
    }
}
