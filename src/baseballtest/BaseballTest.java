/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package baseballtest;
import java.util.Scanner;
/**
 *
 * @author nohin6777
 */
public class BaseballTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BaseballTeam team1 = new BaseballTeam();
        
        System.out.print("What is the team name?: ");
        team1.setTeamName(input.nextLine());
        
        System.out.print("How many players are on the team?: ");
        team1.setPlayers(input.nextInt());
        
        System.out.print("How many wins does the team have?: ");
        int wins = input.nextInt();
        
        System.out.print("How many ties does the team have?: ");
        int ties = input.nextInt();
        
        System.out.print("How many losses does the team have?: ");
        int losses = input.nextInt();
        
        int points = (wins*2)+ties;
        team1.setTeamPoints(points);
        
        System.out.println(team1.toString());
    }
    
}
