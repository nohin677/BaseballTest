/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package baseballtest;

/**
 *
 * @author nohin6777
 */
public class BaseballTeam extends Sports implements overallPoints{
    
    //sets 2 ints and 1 string for private variables
    private int playerCount, points;
    private String team;

    /**
     * sets the amount of players on the team
     * pre: none
     * post: playerCount is returned
     * @param playerC
     * @return 
     */
    public int setPlayers(int playerC){
        playerCount = playerC;
        return playerCount;
    }
    
    /**
     * sets the team name
     * pre: none
     * post: team is returned
     * @param teamName
     * @return 
     */
    public String setTeamName(String teamName){
        team = teamName;
        return team;
    }
    
    /**
     * sets the team points
     * pre: none
     * post: points is returned
     * @param pointC
     * @return 
     */
    @Override
    public int setTeamPoints(int pointC){
        points = pointC;
        return points;
    }
    
    /**
     * sets all of the stats in order to display them
     * pre: none
     * post: output is returned
     * @return 
     */
    @Override
    public String toString(){
        String output = "\nTeam Name: " + team;
        output += "\nNumber of players: " + playerCount;
        output += "\nPoints: " + points;
        return output;
    }
}
