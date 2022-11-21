package hexlet.code.games;
import hexlet.code.Engine;


public class Even {
    public static String[][] getQaArrayEven() {
        int randNumb1R = Engine.getRandomNumber();
        int randNumb2R = Engine.getRandomNumber();
        int randNumb3R = Engine.getRandomNumber();

        String questionEven1R = Integer.toString(randNumb1R);
        String questionEven2R = Integer.toString(randNumb2R);
        String questionEven3R = Integer.toString(randNumb3R);

        String correctEven1R = (randNumb1R % 2 == 0) ? "yes" : "no";
        String correctEven2R = (randNumb2R % 2 == 0) ? "yes" : "no";
        String correctEven3R = (randNumb3R % 2 == 0) ? "yes" : "no";

        return new String[][] {{questionEven1R, correctEven1R}, {questionEven2R, correctEven2R},
            {questionEven3R, correctEven3R}};
    }
}
