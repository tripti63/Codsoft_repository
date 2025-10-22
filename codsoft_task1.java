import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int maxAttempts = 5;  
        int score = 0;
        boolean playAgain = true;

        System.out.println(" Welcome to the Number Guessing Game!");
        System.out.println("I have chosen a number between 1 and 100.");
        System.out.println("You have " + maxAttempts + " attempts to guess it.\n");

        while (playAgain) {
            int numberToGuess = random.nextInt(100) + 1; 
            int attemptsLeft = maxAttempts;
            boolean guessedCorrectly = false;

            while (attemptsLeft > 0) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                attemptsLeft--;

                if (userGuess == numberToGuess) {
                    System.out.println("Correct! You guessed the number.");
                    score++;
                    guessedCorrectly = true;
                    break;
                } else if (userGuess > numberToGuess) {
                    System.out.println("Too high! Attempts left: " + attemptsLeft);
                } else {
                    System.out.println(" Too low! Attempts left: " + attemptsLeft);
                }
            }

            if (!guessedCorrectly) {
                System.out.println("You've run out of attempts. The correct number was: " + numberToGuess);
            }

            System.out.println("Current Score: " + score);
            System.out.print("Do you want to play again? (yes/no): ");
            String response = scanner.next().toLowerCase();
            playAgain = response.equals("yes");
        }

        System.out.println("\nGame Over! Your final score is: " + score);
        scanner.close();
    }
}
