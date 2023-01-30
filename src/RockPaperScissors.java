import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    private static final String Rock = "Rock";
    private static final String Paper = "Paper";
    private static final String Scissors = "Scissors";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Do you want to play Trial mode? (y / n): ");
        String trial = scanner.nextLine();
        int cWins = 0;
        int pWins = 0;
        boolean flag = false;
        int trials = 0;
        int n = 0;

        if (trial.equals("y") || trial.equals("yes")) {
            System.out.println("How many trials do you want to play? ");
            n = Integer.parseInt(scanner.nextLine());
            flag = true;

            for (int i = 0; i < n; i++){
                System.out.print("Choose [r]ock, [p]aper or [s]cissors: ");
                String playerMove = scanner.nextLine();

                if (playerMove.equals("r") || playerMove.equals("rock")){
                    playerMove = Rock;
                } else if (playerMove.equals("p") || playerMove.equals("paper")){
                    playerMove = Paper;
                } else if (playerMove.equals("s") || playerMove.equals("scissors")){
                    playerMove = Scissors;
                } else {
                    System.out.println("Incorrect input. Try again...");
                    return;
                }

                int computerMoveN = random.nextInt(3);
                String computerMove = "";

                switch (computerMoveN){
                    case 0:
                        computerMove = Rock;
                        break;
                    case 1:
                        computerMove = Paper;
                        break;
                    case 2:
                        computerMove = Scissors;
                        break;

                }

                System.out.printf("The computer chose %s%n", computerMove);

                if((playerMove.equals(Rock) && computerMove.equals(Scissors)) || (playerMove.equals(Paper) && computerMove.equals(Rock)) || (playerMove.equals(Scissors) && computerMove.equals(Paper))){
                    System.out.println("You win!");
                    pWins++;
                } else if ((playerMove.equals(Rock) && computerMove.equals(Paper)) || (playerMove.equals(Paper) && computerMove.equals(Scissors)) || (playerMove.equals(Scissors) && computerMove.equals(Rock))){
                    System.out.println("The computer wins.");
                    cWins++;
                } else {
                    System.out.println("It's a draw!");
                }
                System.out.println("");
            }
        } else if (trial.equals("n") || trial.equals("no")){
            System.out.print("Choose [r]ock, [p]aper or [s]cissors: ");
            String playerMove = scanner.nextLine();

            if (playerMove.equals("r") || playerMove.equals("rock")){
                playerMove = Rock;
            } else if (playerMove.equals("p") || playerMove.equals("paper")){
                playerMove = Paper;
            } else if (playerMove.equals("s") || playerMove.equals("scissors")){
                playerMove = Scissors;
            } else {
                System.out.println("Incorrect input. Try again...");
                return;
            }

            int computerMoveN = random.nextInt(3);
            String computerMove = "";

            switch (computerMoveN){
                case 0:
                    computerMove = Rock;
                    break;
                case 1:
                    computerMove = Paper;
                    break;
                case 2:
                    computerMove = Scissors;
                    break;

            }

            System.out.printf("The computer chose %s%n", computerMove);

            if((playerMove.equals(Rock) && computerMove.equals(Scissors)) || (playerMove.equals(Paper) && computerMove.equals(Rock)) || (playerMove.equals(Scissors) && computerMove.equals(Paper))){
                System.out.println("You win!");
            } else if ((playerMove.equals(Rock) && computerMove.equals(Paper)) || (playerMove.equals(Paper) && computerMove.equals(Scissors)) || (playerMove.equals(Scissors) && computerMove.equals(Rock))){
                System.out.println("The computer wins.");
            } else {
                System.out.println("It's a draw!");
            }
        } else {
            System.out.println("Incorrect data!");
            return;
        }

        if (flag == true) {
            if (cWins > pWins){
                System.out.printf("Out of %d trials, the computer wins.", n);
            } else if (pWins > cWins){
                System.out.printf("Out of %d trials, you win!", n);
            } else {
                System.out.printf("Out of %d trials, it is a draw.", n);
            }
        }



    }
}