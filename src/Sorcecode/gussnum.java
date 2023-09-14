import java.util.Random;
import java.util.Scanner;

public class gussnum {
    public static void main(String[] args) {
        System.out.println("Enter your number!");
        Scanner input = new Scanner(System.in);
        Random ran = new Random();
        int yourNum;
        int guessNum = ran.nextInt(101);
        int count = 10;

        while (count > 0) {
            System.out.print("Guess a number between 0 and 100: ");
            yourNum = input.nextInt();

            if (yourNum == guessNum) {
                System.out.println("Congratulations! That's correct.");
                break;
            } else if (yourNum > guessNum) {
                System.out.println("Number is too big.");
            } else {
                System.out.println("Number is too small.");
            }

            count--;

            if (count == 0) {
                System.out.println("Out of guesses. The correct number was: " + guessNum);
            }
        }

        input.close();
    }


}
