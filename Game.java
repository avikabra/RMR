/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rmr_esports;

import java.util.Random;
import javax.swing.JTextField;

/**
 *
 * @author home
 */
public class Game {
    public String game;
    public JTextField[] winning_team;
    public JTextField[] losing_team; 
    public int game_index;
    
    public Game(String game, JTextField[] winning_team, JTextField[] losing_team) {
        this.game = game;
        this.winning_team = winning_team;
        this.losing_team = losing_team;
        Random rand = new Random();
        this.game_index = rand.nextInt(10000);
    }

    public String getGame() {
        return game;
    }
    
    public void setGame(String g) {
        game = g;
    }
    
    public JTextField[] getWinning_team() {
        return winning_team;
    }

    public void setWinning_team(JTextField[] winning_team) {
        this.winning_team = winning_team;
    }

    public JTextField[] getLosing_team() {
        return losing_team;
    }

    public void setLosing_team(JTextField[] losing_team) {
        this.losing_team = losing_team;
    }

    public int getGame_index() {
        return game_index;
    }

    public void setGame_index(int game_index) {
        this.game_index = game_index;
    }

    public String toString() {
        String returnS = "";
        returnS += ("Game: " + game + "\n");
        returnS += ("Game Index: " + game_index + "\n");
        returnS += ("Winning team names: ");
        for (JTextField j : winning_team) {
            returnS += (j.getText() + ", ");
        }
        returnS += "\n";
        returnS += ("Losing team names: ");
        for (JTextField j : losing_team) {
            returnS += (j.getText() + ", ");
        }
        return returnS;
    }
    
}
