package hexlet.code.games;
import hexlet.code.Engine;


public class Calc {

    public static String getOperator() {
        String[] operator = {"+", "-", "*"};
        return operator[(int) (Math.random() * 2 + 1)];
    }

    public static String getQuestionCalc(int a, int b, String operatorCalc) {
        return a + " " + operatorCalc + " " + b;
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

    public static String[][] getQaArrayCalc() {

        int firstMember1R = Engine.getRandomNumber();
        int secondMember1R = Engine.getRandomNumber();

        int firstMember2R = Engine.getRandomNumber();
        int secondMember2R = Engine.getRandomNumber();

        int firstMember3R = Engine.getRandomNumber();
        int secondMember3R = Engine.getRandomNumber();


        String operator1 = getOperator();
        String operator2 = getOperator();
        String operator3 = getOperator();


        String questionCalc1 = getQuestionCalc(firstMember1R, secondMember1R, operator1);
        String questionCalc2 = getQuestionCalc(firstMember2R, secondMember2R, operator2);
        String questionCalc3 = getQuestionCalc(firstMember3R, secondMember3R, operator3);


        String correctCalc1R = getCorrectAnswerCalc(firstMember1R, secondMember1R, operator1);
        String correctCalc2R = getCorrectAnswerCalc(firstMember2R, secondMember2R, operator2);
        String correctCalc3R = getCorrectAnswerCalc(firstMember3R, secondMember3R, operator3);

        return new String[][] {{questionCalc1, correctCalc1R}, {questionCalc2, correctCalc2R},
            {questionCalc3, correctCalc3R}};
    }
}
