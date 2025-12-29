import java.util.Random;
import java.util.Scanner;

public class RPSSimulator {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            Random rand = new Random();
            int playerScore = 0, cpuScore = 0;
            String[] choices = {"rock", "paper", "scissors"};
            System.out.println("--- Best of Series ---");
            while (playerScore < 2 && cpuScore < 2) {
                
                System.out.print("\nEnter Rock, Paper, or Scissors: ");
                String playerChoice = sc.nextLine().toLowerCase();
                String cpuChoice = choices[rand.nextInt(3)];
                
                System.out.println("Computer played: " + cpuChoice);
                
                switch (playerChoice + cpuChoice) {
                    case "rockscissors", "paperrock", "scissorspaper" -> {
                        System.out.println("Point for Player!");
                        playerScore++;
                    }
                    case "rockpaper", "paperscissors", "scissorsrock" -> {
                        System.out.println("Point for Computer!");
                        cpuScore++;
                    }
                    case "rockrock", "paperpaper", "scissorsscissors" -> {
                        System.out.println("Tie!");
                    }
                    default -> {
                        System.out.println("Invalid input! Try again.");
                    }
                }
                System.out.println("Score: Player " + playerScore + " / Computer " + cpuScore);
            }   String winner = (playerScore == 2) ? "PLAYER" : "COMPUTER";
            System.out.println("\n*** Game Over! Winner is " + winner + " ***");
        }
    }
}