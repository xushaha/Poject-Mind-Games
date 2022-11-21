package hexlet.code.games;
import hexlet.code.Engine;

public class Calc {

    public static String[][] getQaArrayCalc() {
        int firstMember1R = Engine.getRandomNumber();
        int secondMember1R = Engine.getRandomNumber();
        int firstMember2R = Engine.getRandomNumber();
        int secondMember2R = Engine.getRandomNumber();
        int firstMember3R = Engine.getRandomNumber();
        int secondMember3R = Engine.getRandomNumber();

        String[] operator = {"+", "-", "*"};
        String operator1 = operator[(int) (Math.random() * 2 + 1)];
        String operator2 = operator[(int) (Math.random() * 2 + 1)];
        String operator3 = operator[(int) (Math.random() * 2 + 1)];

        String questionCacl1 = firstMember1R + " " + operator1 + " " + secondMember1R;
        String questionCacl2 = firstMember2R + " " + operator2 + " " + secondMember2R;
        String questionCacl3 = firstMember3R + " " + operator3 + " " + secondMember3R;

        String correctCalc1R = getCorrectAnswerCalc(firstMember1R, secondMember1R, operator1);
        String correctCalc2R = getCorrectAnswerCalc(firstMember2R, secondMember2R, operator2);
        String correctCalc3R = getCorrectAnswerCalc(firstMember3R, secondMember3R, operator3);

        return new String[][] {{questionCacl1, correctCalc1R}, {questionCacl2, correctCalc2R},
            {questionCacl3, correctCalc3R}};
    }

    public static String getCorrectAnswerCalc(int a, int b, String operators) {

        switch (operators) {
            case "+" -> {
                return Integer.toString(a + b);
            }
            case "-" -> {
                return Integer.toString(a - b);
            }
            case "*" -> {
                return Integer.toString(a * b);
            }
            default -> {
                return "";
            }
        }
    }
}
