package hexlet.code.games;
import hexlet.code.Engine;


public class Calc {
    private static final String[] OPERATOR = {"+", "-", "*"};

    public static String[][] generateGameData() {

        String[][] qaArray = new String[Engine.MAX_CYCLES][Engine.MAX_CYCLES];

        for (int i = 0; i < Engine.MAX_CYCLES; i++) {

            int firstMember = Engine.getRandomNumber();
            int secondMember = Engine.getRandomNumber();
            String operator = OPERATOR[(int) (Math.random() * OPERATOR.length)];
            String question = firstMember + " " + operator + " " + secondMember;

            String correctAnswer = switch (operator) {
                case "+" -> Integer.toString(firstMember + secondMember);
                case "-" -> Integer.toString(firstMember - secondMember);
                case "*" -> Integer.toString(firstMember * secondMember);
                default -> "";
            };

            qaArray[i][0] = question;
            qaArray[i][1] = correctAnswer;
        }
        return qaArray;
    }


    public static String rules() {
        return "What is the result of the expression?";
    }
}


