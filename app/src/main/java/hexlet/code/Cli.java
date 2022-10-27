package hexlet.code;
import java.util.Scanner;

public class Cli {
    public static void greeting() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        System.out.println("Hello, " + sc.next() + "!");

        sc.close();
    }
}
