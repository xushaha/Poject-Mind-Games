package hexlet.code.games;
import hexlet.code.Engine;

public class GCD {

    public static String[][] generateGameData() {

        String[][] qaArray = new String[Engine.MAX_CYCLES][Engine.MAX_CYCLES];

        for (int i = 0; i < Engine.MAX_CYCLES; i++) {

            int firstNumber = Engine.getRandomNumber();
            int secondNumber = Engine.getRandomNumber();
            String question = firstNumber + " " + secondNumber;
            String correctAnswer = Integer.toString(findGCD(firstNumber, secondNumber));

            qaArray[i][0] = question;
            qaArray[i][1] = correctAnswer;
        }
        return qaArray;
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


    public static String rules() {
        return "Find the greatest common divisor of given numbers.";
    }

}
