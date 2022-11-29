package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {

    public static void startGame() {
        String rules = "Find the greatest common divisor of given numbers.";
        String[][] qaArray = new String[Utils.MAX_CYCLES][Utils.MAX_CYCLES];

        for (int i = 0; i < Utils.MAX_CYCLES; i++) {
            int firstNumber = Utils.getRandomNumber();
            int secondNumber = Utils.getRandomNumber();

            qaArray[i][Utils.QUESTION] = firstNumber + " " + secondNumber;
            qaArray[i][Utils.ANSWER] = Integer.toString(findGCD(firstNumber, secondNumber));
        }

        Engine.gameMechanics(qaArray, rules);
    }

    public static int findGCD(int a, int b) {

        while ((a != 0) && (b != 0)) {

            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }
        return a + b;
    }

}
