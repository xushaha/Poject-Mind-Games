package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;


public class Even {

    public static void startGame() {

        String rules = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] qaArray = new String[Utils.MAX_CYCLES][Utils.MAX_CYCLES];

        for (int i = 0; i < Utils.MAX_CYCLES; i++) {
            int randNumb = Utils.getRandomNumber();
            qaArray[i][Utils.QUESTION] = Integer.toString(randNumb);
            qaArray[i][Utils.ANSWER] = (randNumb % 2 == 0) ? "yes" : "no";
        }

        Engine.gameMechanics(qaArray, rules);
    }
}
