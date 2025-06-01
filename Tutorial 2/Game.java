import java.util.Scanner;
import java.util.Random;

public class Game {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        System.out.println("0. ROCK");
        System.out.println("1. PAPER");
        System.out.println("2. SCISSORS");


        System.out.println("Enter choice as 0/1/2:");
        int userChoice=scanner.nextInt();

        int computerChoice=new Random().nextInt(3);
        String userChoiceStr="";
        String computerChoiceStr ="";

        if (userChoice == 0) {
            userChoiceStr = "Rock";
        } else if (userChoice == 1) {
            userChoiceStr = "Paper";
        } else if (userChoice == 2) {
            userChoiceStr = "Scissors";
        } else {
            System.out.println("Invalid input. Please enter 0, 1, or 2.");
            return;
        }

        

        if (computerChoice == 0) {
            computerChoiceStr = "Rock";
        } else if (computerChoice == 1) {
            computerChoiceStr = "Paper";
        } else if (computerChoice == 2) {
            computerChoiceStr = "Scissors";
        }

        
        System.out.println("User chose: " + userChoiceStr);
        System.out.println("Computer chose: " + computerChoiceStr);

        
        if (userChoice == computerChoice) {
            System.out.println("It's a tie!");
        } else if (userChoice == 0 && computerChoice == 2) {
            System.out.println("User wins! Rock crushes Scissors.");
        } else if (userChoice == 2 && computerChoice == 1) {
            System.out.println("User wins! Scissors cuts Paper.");
        } else if (userChoice == 1 && computerChoice == 0) {
            System.out.println("User wins! Paper covers Rock.");
        } else if (computerChoice == 0 && userChoice == 2) {
            System.out.println("Computer wins! Rock crushes Scissors.");
        } else if (computerChoice == 2 && userChoice == 1) {
            System.out.println("Computer wins! Scissors cuts Paper.");
        } else if (computerChoice == 1 && userChoice == 0) {
            System.out.println("Computer wins! Paper covers Rock.");
        }

    }    
}
