package hexlet.code.games;
import hexlet.code.Engine;

public class GCD {

    public static String[][] getQaArrayGCD() {
        int firstNumber1R = Engine.getRandomNumber();
        int secondNumber1R = Engine.getRandomNumber();

        int firstNumber2R = Engine.getRandomNumber();
        int secondNumber2R = Engine.getRandomNumber();

        int firstNumber3R = Engine.getRandomNumber();
        int secondNumber3R = Engine.getRandomNumber();


        String questionGCD1 = createQuestionGCD(firstNumber1R, secondNumber1R);
        String questionGCD2 = createQuestionGCD(firstNumber2R, secondNumber2R);
        String questionGCD3 = createQuestionGCD(firstNumber3R, secondNumber3R);


        String correctGCD1R = Integer.toString(findGCD(firstNumber1R, secondNumber1R));
        String correctGCD2R = Integer.toString(findGCD(firstNumber2R, secondNumber2R));
        String correctGCD3R = Integer.toString(findGCD(firstNumber3R, secondNumber3R));

        return new String[][] {{questionGCD1, correctGCD1R}, {questionGCD2, correctGCD2R},
            {questionGCD3, correctGCD3R}};
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

    public static String createQuestionGCD(int c, int d) {
        return c + " " + d;
    }

}
