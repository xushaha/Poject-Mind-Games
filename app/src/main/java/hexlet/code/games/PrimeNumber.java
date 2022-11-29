package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class PrimeNumber {

    public static void startGame() {
        Engine.launchGame(PrimeNumber.generateGameData(), PrimeNumber.rules());
    }

    public static String[][] generateGameData() {

        String[][] qaArray = new String[Utils.MAX_CYCLES][Utils.MAX_CYCLES];

        for (int i = 0; i < Utils.MAX_CYCLES; i++) {

            int randNumb = Utils.getRandomNumber();

            qaArray[i][Utils.QUESTION] = Integer.toString(randNumb);
            qaArray[i][Utils.ANSWER] = (isPrimeNumber(randNumb)) ? "yes" : "no";
        }
        return qaArray;
    }

    public static boolean isPrimeNumber(int a) {
        boolean prime = true;

        if (a <= 1) {
            prime = false;
        } else {
            for (int i = 2; i < a; i++) {
                if (a % i == 0) {
                    prime = false;
                    break;
                }
            }
        }
        return prime;
    }

    public static String rules() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }
}
