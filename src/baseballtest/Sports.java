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
public class Sports {
    private int playerCount;
    private String team;
    
    /**
     * sets the amount of players on the team
     * pre: none
     * post: playerCount is returned
     * @param players 
     */
    public int setPlayers(int players){
        playerCount = players;
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
    
}
