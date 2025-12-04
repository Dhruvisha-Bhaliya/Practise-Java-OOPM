/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package OOPMAssign_7;

import java.util.Scanner;

/**
 *
 * @author DHRUVI
 */

/*
Aim : Implementing Dynamic Polymorphism using Method Overriding

A. Create a class named SingleTennisGame that holds data about a single tennis game.

The class has mentioned fields: player1_name, player2_name, player1_score,
player2_score, Result (values can be- “team1 win”, “team2 win”).

Include get methods for each of the fields. Also include setNames() method that accepts
two players’ names from the user, and another setScores() method that accepts the two
integer score values.

The score for a player is the number of points the player won during the game; this value
should be in the range of 0 through 4. If either of the setScores() method parameters is not
in the range of 0 through 4, assign 0 to both scores and “error” to the Result.

If both players’ score parameters are 4, assign 0 to both scores and “tie” to the Result. The
Result value(“team1 win”, “team2win”) is also set by the setScores() method based on the
scores of both players.
 */
class SingleTennisGame {

    private String player1_name, player2_name, result;
    private int player1_score, player2_score;

    public void setNames(String player1_name, String player2_name) {
        this.player1_name = player1_name;
        this.player2_name = player2_name;
    }

    public void setScores(int player1_score, int player2_score) {
        if (player1_score < 0 || player1_score > 4 || player2_score < 0 || player2_score > 4) {
            this.player1_score = 0;
            this.player2_score = 0;
            this.result = "error";
        } else if (player1_score == 4 && player2_score == 4) {
            this.player1_score = 0;
            this.player2_score = 0;
            this.result = "tie";
        } else {
            this.player1_score = player1_score;
            this.player2_score = player2_score;
            this.result = (player1_score > player2_score) ? player1_name + "win" : player2_name + "win";
        }
    }

    public String getPlayer1_name() {
        return player1_name;
    }

    public String getPlayer2_name() {
        return player2_name;
    }

    public String getResult() {
        return result;
    }

    public int getPlayer1_score() {
        return player1_score;
    }

    public int getPlayer2_score() {
        return player2_score;
    }

}

class DoublesTennisGame extends SingleTennisGame {

    private String team1_name;
    private String team2_name;

    @Override
    public void setNames(String team1_name, String team2_name) {
        super.setNames(team1_name, team2_name);
    }

    public String getTeam1_name() {
        return team1_name;
    }

    public String getTeam2_name() {
        return team2_name;
    }

}

public class OA7_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 'single' for Single Tennis Game or 'double' for Doubles Tennis Game: ");
        String choice = sc.next();

        if (choice.equalsIgnoreCase("single")) {
            SingleTennisGame singleGame = new SingleTennisGame();
            System.out.print("Enter player 1 name: ");
            String player1Name = sc.next();
            System.out.print("Enter player 2 name: ");
            String player2Name = sc.next();
            singleGame.setNames(player1Name, player2Name);
            System.out.print("Enter player 1 score: ");
            int player1Score = sc.nextInt();
            System.out.print("Enter player 2 score: ");
            int player2Score = sc.nextInt();
            singleGame.setScores(player1Score, player2Score);
            System.out.println("Player1 name: "+singleGame.getPlayer1_name());
            System.out.println("Player2 name: "+singleGame.getPlayer2_name());
            System.out.print("Result: " + singleGame.getResult());
        } else if (choice.equalsIgnoreCase("double")) {
            DoublesTennisGame doublesGame = new DoublesTennisGame();
            System.out.print("Enter team 1 name: ");
            String team1Name = sc.next();
            System.out.print("Enter team 2 name: ");
            String team2Name = sc.next();
            doublesGame.setNames(team1Name, team2Name);
            System.out.print("Enter team 1 score: ");
            int team1Score = sc.nextInt();
            System.out.print("Enter team 2 score: ");
            int team2Score = sc.nextInt();
            doublesGame.setScores(team1Score, team2Score);
            System.out.println("Team1 name: "+doublesGame.getTeam1_name());
            System.out.println("Team2 name: "+doublesGame.getTeam2_name());
            System.out.print("Result: " + doublesGame.getResult());
        } else {
            System.out.print("Invalid choice!");
        }
    }
    // TODO code application logic here
}
