package hexlet.code.games;

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

    public static int getSecretNumberPos() {
        return (int) (Math.random() * (getProgLength() - SECRET_POS_KOEF));
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

    public static String getCorrAnswerProgression(int progLength, int progDiff, int secretNumberPos,
                                                  int progressionStart) {
        int[] progression = new int[progLength];
        progression[0] = progressionStart;

        for (int i = 1; i < progLength; i++) {
            progression[i] = progression[i - 1] + progDiff;
        }

        return Integer.toString(progression[secretNumberPos]);
    }

    public static String[][] getQaArrayProgression() {
        int progLength1R = getProgLength();
        int progDiff1R = getProgDiff();
        int secretNumberPos1R = getSecretNumberPos();
        int progressionStart1R = getProgressionStart();

        int progLength2R = getProgLength();
        int progDiff2R = getProgDiff();
        int secretNumberPos2R = getSecretNumberPos();
        int progressionStart2R = getProgressionStart();

        int progLength3R = getProgLength();
        int progDiff3R = getProgDiff();
        int secretNumberPos3R = getSecretNumberPos();
        int progressionStart3R = getProgressionStart();

        String questionProgression1R = createProgression(progLength1R, progDiff1R, secretNumberPos1R,
                progressionStart1R);
        String questionProgression2R = createProgression(progLength2R, progDiff2R, secretNumberPos2R,
                progressionStart2R);
        String questionProgression3R = createProgression(progLength3R, progDiff3R, secretNumberPos3R,
                progressionStart3R);

        String correctProgression1R = getCorrAnswerProgression(progLength1R, progDiff1R, secretNumberPos1R,
                progressionStart1R);
        String correctProgression2R = getCorrAnswerProgression(progLength2R, progDiff2R, secretNumberPos2R,
                progressionStart2R);
        String correctProgression3R = getCorrAnswerProgression(progLength3R, progDiff3R, secretNumberPos3R,
                progressionStart3R);

        return new String[][]{{questionProgression1R, correctProgression1R}, {questionProgression2R,
                correctProgression2R}, {questionProgression3R, correctProgression3R}};
    }

}
