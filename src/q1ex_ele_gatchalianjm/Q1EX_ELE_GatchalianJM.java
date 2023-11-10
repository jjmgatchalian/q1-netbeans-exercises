/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package q1ex_ele_gatchalianjm;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
/**
 *
 * @author user
 */
public class Q1EX_ELE_GatchalianJM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(in);                

                Move rock = new Move("Rock");
		Move paper = new Move("Paper");
		Move scissors = new Move("Scissors");
		
		rock.setStrongAgainst(scissors);
		paper.setStrongAgainst(rock);
		scissors.setStrongAgainst(paper);
		
		int roundsToWin = 2;
                int choice;
                
        OUTER:
        for (int i = 0; i < 1;) {
            System.out.println("Welcome to Rock Paper Scissors, please select an option");
            System.out.println("1. Begin Game");
            System.out.println("2. Change number of rounds");
            System.out.println("3. Exit Application");
            try {
                choice = Integer.parseInt(reader.readLine());
                switch (choice) {
                    case 3:
                        System.out.println("Thank you for playing!");
                        System.out.println("");
                        break OUTER;
                    case 2:
                        System.out.println("");
                        for (int j = 0; j < 1;) {
                            System.out.println("How many wins are needed to win a match?");
                            try {
                                roundsToWin = Integer.parseInt(reader.readLine());
                                if (roundsToWin < 1) {
                                System.out.println("Invalid number! Number must be greater than 0");
                                } else {
                                System.out.println("New setting saved!");
                                break;
                                }
                            }
                            catch (NumberFormatException ex) {
                                System.out.println("Entered input is not an integer!");
                                System.out.println("");
                            }
                        }   break;
                    case 1:
                        int playerscore = 0;
                        int cpuscore = 0;
                        Move cpumove = null;
                        Move playermove = null;
                        System.out.println("");
                        System.out.println("This matchup will be first to " + roundsToWin + " wins.");
                            while (playerscore < roundsToWin && cpuscore < roundsToWin){
                                int random = (int) Math.floor(Math.random()*3) + 1;
                                    switch (random){
                                        case 1 -> cpumove = rock;
                                        case 2 -> cpumove = paper;
                                        case 3 -> cpumove = scissors;
                                    }
                                System.out.println("The computer has selected its move. Select your move:");
                                System.out.println("1. Rock");
                                System.out.println("2. Paper");
                                System.out.println("3. Scissors");
                                    PSELECTOUTER:
                                    for (int k = 0; k < 1;) {
                                        int playerno;
                                        try {
                                            playerno = Integer.parseInt(reader.readLine());
                                                switch (playerno) {
                                                    case 1 -> {
                                                        playermove = rock;
                                                        break PSELECTOUTER;
                                                }
                                                    case 2 -> {
                                                        playermove = paper;
                                                        break PSELECTOUTER;
                                                }
                                                    case 3 -> {
                                                        playermove = scissors;
                                                        break PSELECTOUTER;
                                                }
                                                    default -> System.out.println("Entered input is not within the choices!");  
                                                }
                                        }
                                        catch (NumberFormatException ex) {
                                            System.out.println("Entered input is not an integer!");
                                        }
                                    }
                                System.out.println("");
                                System.out.println("Player chose " + playermove.getName() + ". CPU chose " + cpumove.getName() + ". ");
                                    switch (Move.compareMoves(playermove, cpumove)) {
                                        case 0:
                                            System.out.print("Player wins round! ");
                                            playerscore++;
                                            break;
                                        case 1:
                                            System.out.print("Computer wins round.. " );
                                            cpuscore++;
                                            break;
                                        case 2:
                                            System.out.print("Match results in a draw.. ");    
                                            break;
                                        default:
                                            break;
                                    }
                                System.out.println("");
                                System.out.println("Player: " + playerscore + " - CPU: " + cpuscore);
                                System.out.println("");
                            }
                        if (playerscore > cpuscore) {
                            System.out.println("Player Wins!");
                        }
                        else if (cpuscore > playerscore) {
                            System.out.println("Computer Wins!");
                        }
                        System.out.println("");
                        break;

                    default:
                        System.out.println("Entered input is not within the choices!");
                        break;
                }
                System.out.println("");
            }catch (NumberFormatException ex) {
                System.out.println("Entered value is not an integer!");
                System.out.println("");
            }
        }
    }
    
}
