import java.util.Scanner;
import java.util.Random;

public class Questions {

    public static void askQuestions() {
        Questions survey = new Questions();
        Scanner userInput = new Scanner(System.in);
        String carColor = survey.redCar(userInput);
        String petName = survey.pet(userInput);
        int luckyNum = survey.lucky(userInput);
        int jerseyNum = survey.quaterback(userInput);
        int modelNum = survey.modelNum(userInput);
        String actor = survey.actor(userInput);
        int userNum = survey.number(userInput);

        Random random = new Random();
        int rand1 = random.nextInt(75);
        int rand2 = random.nextInt(65);

        int magicBall = 0;

        if (rand1 < 32) {
            magicBall = jerseyNum * rand1;
            while (magicBall > 75) {
                magicBall -= 75;
            }
            System.out.println(magicBall);
        } else {
            magicBall = luckyNum * rand1;
            while (magicBall > 75) {
                magicBall -= 75;
            }
        }

        int nonMagic1 = petName.charAt(2);
        while (nonMagic1 > 65) {
            nonMagic1 -= 65;
        }

        int nonMagic2 = modelNum + luckyNum;
        while (nonMagic2 > 65) {
            nonMagic2 -= 65;
        }

        int nonMagic3 = userNum - rand2;
        while (nonMagic3 > 65) {
            nonMagic3 -= 65;
        }

        int nonMagic4 = 42;

        int nonMagic5 = actor.charAt(actor.length() - 1);

        System.out.println("Lottery Numbers: " + nonMagic1 + ", " + nonMagic2 + ", " + nonMagic3 + ", " + nonMagic4
                + ", " + nonMagic5 + " Magic Ball: " + magicBall);

    }

    public String redCar(Scanner userInput) {
        System.out.println("Do you have a red car?");
        String car = userInput.nextLine();
        return car;
    }

    public String pet(Scanner userInput) {
        System.out.println("What is the name of your favorite pet?");
        String pet = userInput.nextLine();
        return pet;
    }

    public Integer lucky(Scanner userInput) {
        System.out.println("What is your lucky number?");
        Integer lucky = userInput.nextInt();
        return lucky;
    }

    public Integer quaterback(Scanner userInput) {
        System.out.println("Do you have a favorite quaterback? What's their jersey number?");
        Integer jersey = userInput.nextInt();
        return jersey;
    }

    public Integer modelNum(Scanner userInput) {
        System.out.println("What is the two-digit model year of their car?");
        Integer model = userInput.nextInt();
        return model;
    }

    public String actor(Scanner userInput) {
        System.out.println();
        System.out.println("What is the first name of your favorite actor or actress?");
        String actor = userInput.next();
        return actor;
    }

    public Integer number(Scanner userInput) {
        System.out.println("Enter a number between 1 and 50");
        Integer num = userInput.nextInt();
        System.out.println();
        return num;
    }

}