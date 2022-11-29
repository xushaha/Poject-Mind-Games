package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;


public class Calc {
    private static final String[] OPERATOR = {"+", "-", "*"};


    public static void startGame() {

        String rules = "What is the result of the expression?";
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
        Engine.gameMechanics(qaArray, rules);
    }

}


