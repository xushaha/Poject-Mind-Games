package hexlet.code.games;
import hexlet.code.Engine;

public class PrimeNumber {


    public static String[][] generateGameData() {

        String[][] qaArray = new String[Engine.MAX_CYCLES][Engine.MAX_CYCLES];

        for (int i = 0; i < Engine.MAX_CYCLES; i++) {

            int randNumb = Engine.getRandomNumber();
            String question = Integer.toString(randNumb);
            String correctAnswer = (isPrimeNumber(randNumb)) ? "yes" : "no";

            qaArray[i][0] = question;
            qaArray[i][1] = correctAnswer;
        }
        return qaArray;
    }


    public static boolean isPrimeNumber(int a) {
        boolean prime = true;

        if (a <= 1) {
            prime = false;
        } else if (a == 2) {
            prime = true;
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
