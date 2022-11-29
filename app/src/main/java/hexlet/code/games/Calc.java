package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;


public class Calc {
    private static final String[] OPERATOR = {"+", "-", "*"};

    public static void startGame() {
        Engine.launchGame(Calc.generateGameData(), Calc.rules());
    }

    public static String[][] generateGameData() {

        String[][] qaArray = new String[Utils.MAX_CYCLES][Utils.MAX_CYCLES];

        for (int i = 0; i < Utils.MAX_CYCLES; i++) {

            int firstMember = Utils.getRandomNumber();
            int secondMember = Utils.getRandomNumber();
            String operator = OPERATOR[Utils.getRandomNumber(OPERATOR.length)];

            String correctAnswer = switch (operator) {
                case "+" -> Integer.toString(firstMember + secondMember);
                case "-" -> Integer.toString(firstMember - secondMember);
                case "*" -> Integer.toString(firstMember * secondMember);
                default -> "Invalid data";
            };

            qaArray[i][Utils.QUESTION] = firstMember + " " + operator + " " + secondMember;
            qaArray[i][Utils.ANSWER] = correctAnswer;
        }
        return qaArray;
    }

    public static String rules() {
        return "What is the result of the expression?";
    }
}


