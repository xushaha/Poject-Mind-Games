package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;


public class Even {

    public static void startGame() {

        String rules = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] questionsAndAnswers = new String[Engine.MAX_CYCLES][Engine.MAX_CYCLES];

        for (int i = 0; i < Engine.MAX_CYCLES; i++) {
            int randNumb = Utils.getRandomNumber();
            questionsAndAnswers[i][Engine.QUESTION] = Integer.toString(randNumb);
            questionsAndAnswers[i][Engine.ANSWER] = (randNumb % 2 == 0) ? "yes" : "no";
        }

        Engine.gameMechanics(questionsAndAnswers, rules);
    }
}
