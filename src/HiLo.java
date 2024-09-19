import java.util.Random;
import java.util.Scanner;

public class HiLo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String playAgain;

        do {
            int secret = random.nextInt(100);
            int guess = 0;
            int attempts = 0;

            System.out.println("guess between 1-100");

            while (guess != secret) {
                System.out.print("enter your guess");
                guess = scanner.nextInt();
                attempts++;

                if (guess < secret) {
                    System.out.println("too low");
                } else if (guess > secret) {
                    System.out.println("too high");
                } else {
                    if (attempts > 10) {
                        System.out.println("ypu won and it took " + attempts + " attempts");
                        System.out.println("thats a lot of guesses. youre a winning loser");
                    } else {
                        System.out.println("ypu won and it took " + attempts + " attempts");
                    }
                }
            }

            System.out.print("play agian (yes/no) ");
            playAgain = scanner.next();
        } while (playAgain.equalsIgnoreCase("yes"));

        scanner.close();
    }
}
