package hexlet.code;
import java.util.Scanner;

public class Cli {
    public static void greeting() {
        Scanner scGreeting = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        System.out.println("Hello, " + scGreeting.next() + "!");

        scGreeting.close();
    }
}
