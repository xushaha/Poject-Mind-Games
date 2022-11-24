package hexlet.code.games;
import hexlet.code.Engine;


public class Even {
    public static String[][] generateGameData() {

        String[][] qaArray = new String[Engine.MAX_CYCLES][Engine.MAX_CYCLES];

        for (int i = 0; i < Engine.MAX_CYCLES; i++) {

            int randNumb = Engine.getRandomNumber();
            String question = Integer.toString(randNumb);
            String correctAnswer = (randNumb % 2 == 0) ? "yes" : "no";

            qaArray[i][0] = question;
            qaArray[i][1] = correctAnswer;
        }
        return qaArray;
    }


    public static String rules() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }
}
