package hexlet.code;
import java.util.Scanner;

public class Even {

    public static void gameEven() {

        Scanner scEven = new Scanner(System.in);


        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        String nameEven = scEven.nextLine();
        System.out.println("Hello, " + nameEven + "!");

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        int correctCount = 0;

        String posAnsw = "yes";
        String negAnsw = "no";

        while (correctCount < 3) {
            int randNumb = (int) (Math.random() * 100 + 1);
            System.out.println(randNumb);
            String answer = scEven.nextLine().toLowerCase();

            if ((randNumb % 2 == 0) && (answer.equals(posAnsw)) || (randNumb % 2 != 0) && (answer.equals(negAnsw))) {
                System.out.println("Correct!");
                correctCount++;
                if (correctCount == 3) {
                    System.out.println("Congratulations, " + nameEven + "!");
                }
            } else {
                                if (randNumb % 2 == 0) {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was 'yes'.");
                System.out.println("Let's try again, " + nameEven + "!");
                }
                if (randNumb % 2 != 0) {
                    System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was 'no'.");
                    System.out.println("Let's try again, " + nameEven + "!");
                }
               break;
            }
        }
        scEven.close();
    }
}
