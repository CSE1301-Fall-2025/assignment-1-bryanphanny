package assignment01;

import java.util.Scanner;

public class NimGame {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int beginningSticks = 7;
        int rounds = 0;
        int chosenSticks = 0;


        System.out.println("There are " + beginningSticks + " at the beginning of the game.");

        int remainingSticks = 10; // Just a value so that loop can run

        int initialSticks = beginningSticks;

        while (remainingSticks > 0) {
            if (remainingSticks == 1) {
                System.out.println("Choose 1 to take the last stick!");
                chosenSticks = in.nextInt();
                while (chosenSticks != 1) {
                    System.out.println("Selected number not valid. Please Try Again!");
                    chosenSticks = in.nextInt();
                }
            }
            else {
                System.out.println("Choose between 1 or 2 sticks to take.");
                chosenSticks = in.nextInt();
            }
                while ((chosenSticks != 1) && (chosenSticks != 2)) {
                    System.out.println("Selected number not valid. Please Try Again!");
                    chosenSticks = in.nextInt();
                }
            
            remainingSticks = initialSticks - chosenSticks;
            boolean humanWins = remainingSticks <= 0;
            if (!humanWins) {
                System.out.println("Round " + rounds + ": " + initialSticks + " at start, human takes " + chosenSticks + " so " + remainingSticks + " remain.");
                initialSticks = remainingSticks;
                rounds++;

         // Implement the computer taking 1 or 2 sticks
            if (initialSticks == 1) {
                chosenSticks = 1;
            } 
            
            else {
                chosenSticks = (int)(Math.random() * 2 + 1);
            }

            remainingSticks = initialSticks - chosenSticks;
            boolean computerWins = remainingSticks <= 0;
            
                if (!computerWins) {
                    System.out.println("Round " + rounds + ": " + initialSticks + " at start, computer takes " + chosenSticks + " so " + remainingSticks + " remain.");
                    initialSticks = remainingSticks;
                    rounds++;
                }
                else {
                    System.out.println("Round " + rounds + ": " + initialSticks + " at start, computer takes " + chosenSticks + " so " + remainingSticks + " remain.");
                    System.out.println("You lose. Computer wins!");
                }
            }

            else {
                System.out.println("Round " + rounds + ": " + initialSticks + " at start, human takes " + chosenSticks + " so " + remainingSticks + " remain.");
                System.out.println("You win! Computer loses.");
            }
        }

    }
}
