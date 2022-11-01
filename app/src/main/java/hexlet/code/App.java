package hexlet.code;
import java.util.Scanner;


public class App {
    public static void main(String[] args) {

        Scanner gameChoice = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("2 - Even");
        System.out.println("1 - Greet");
        System.out.println("0 - Exit");

        int choice = gameChoice.nextInt();

        System.out.println("Your choice: " + choice);

        if (choice == 1) {
            Cli.greeting();
        }

        if (choice == 2) {
            Even.gameEven();
        }

        gameChoice.close();
    }
}
