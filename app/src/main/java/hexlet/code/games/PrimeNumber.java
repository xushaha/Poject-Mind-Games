package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class PrimeNumber {

    public static void startGame() {
        String rules = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[][] questionsAndAnswers = new String[Engine.MAX_CYCLES][Engine.MAX_CYCLES];

        for (int i = 0; i < Engine.MAX_CYCLES; i++) {
            int randNumb = Utils.getRandomNumber();

            questionsAndAnswers[i][Engine.QUESTION] = Integer.toString(randNumb);
            questionsAndAnswers[i][Engine.ANSWER] = (isPrimeNumber(randNumb)) ? "yes" : "no";
        }
        Engine.gameMechanics(questionsAndAnswers, rules);
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
