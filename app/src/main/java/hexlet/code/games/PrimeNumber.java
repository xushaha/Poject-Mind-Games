package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class PrimeNumber {

    public static void startGame() {
        String rules = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[][] qaArray = new String[Utils.MAX_CYCLES][Utils.MAX_CYCLES];

        for (int i = 0; i < Utils.MAX_CYCLES; i++) {
            int randNumb = Utils.getRandomNumber();

            qaArray[i][Utils.QUESTION] = Integer.toString(randNumb);
            qaArray[i][Utils.ANSWER] = (isPrimeNumber(randNumb)) ? "yes" : "no";
        }
        Engine.gameMechanics(qaArray, rules);
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

}
