import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        AsciiChars.printNumbers();
        AsciiChars.printUpperCase();
        AsciiChars.printLowerCase();

        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter your name:");
        String name = userInput.nextLine();
        System.out.printf("Hello %s ", name);
        System.out.println();
        System.out.println("Would you like to continue to the interactive portion? yes/y or no");
        String ans = userInput.nextLine();

        switch (ans) {
            case "yes":
            case "Yes":
            case "YES":
            case "Y":
            case "y":
                System.out.println("Continue");
                Questions.askQuestions();
                System.out.println();
                System.out.println("Would you like to continue to play again? yes/y or no");
                String ans2 = userInput.nextLine();
                switch (ans2) {
                    case "yes":
                    case "Yes":
                    case "YES":
                    case "Y":
                    case "y":
                        Questions.askQuestions();
                        break;
                    default:
                        System.out.println("GoodBye!");
                        userInput.close();
                        break;
                }
                break;
            default:
                System.out.println("Please return later to complete the survey");
                userInput.close();
                break;
        }
    }
}