package hexlet.code.games;
import hexlet.code.Engine;

public class PrimeNumber {

    public static String[][] getQaArrayPrimeNumber() {
        int randNumb1R = Engine.getRandomNumber();
        int randNumb2R = Engine.getRandomNumber();
        int randNumb3R = Engine.getRandomNumber();

        String questionPrimeNumber1R = Integer.toString(randNumb1R);
        String questionPrimeNumber2R = Integer.toString(randNumb2R);
        String questionPrimeNumber3R = Integer.toString(randNumb3R);

        String correctPrimeNumber1R = (isPrimeNumber(randNumb1R)) ? "yes" : "no";
        String correctPrimeNumber2R = (isPrimeNumber(randNumb2R)) ? "yes" : "no";
        String correctPrimeNumber3R = (isPrimeNumber(randNumb3R)) ? "yes" : "no";

        return new String[][]{{questionPrimeNumber1R, correctPrimeNumber1R},
            {questionPrimeNumber2R, correctPrimeNumber2R}, {questionPrimeNumber3R, correctPrimeNumber3R}};
    }

    public static boolean isPrimeNumber(int a) {
        boolean prime = false;

        if (a == 2) {
            prime = true;
        } else if (a == 1) {
            prime = false;
        } else {
            for (int i = 2; i < a; i++) {
                if (a % i == 0)  {
                    prime = false;
                    break;
                } else {
                    prime = true;
                }
            }
        }
        return prime;
    }
}
