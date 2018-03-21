package com.example.rgathergood.rockpaperscissorslab;

import java.util.Random;

/**
 * Created by rgathergood on 21/03/2018.
 */

public class Game {

    public enum Choice {ROCK, PAPER, SCISSORS};

    public enum Result {WIN, LOSE, DRAW};

    private Choice userSelection;
    private Choice computerSelection;
    private Result gameResult;

    public Game() {
//        this.userSelection = playerHand;
        this.computerSelection = setComputerRandomChoice();
    }

    public Choice setComputerRandomChoice() {
        Random random = new Random();
        computerSelection = Choice.values()[random.nextInt(Choice.values().length)];
        return computerSelection;
    }

    public String play(Choice userSelection) {
        if (computerSelection == userSelection) {
            gameResult = Result.DRAW;
            return "It's a draw!";
        }
        else if (computerSelection == Choice.ROCK && userSelection == Choice.SCISSORS) {
            gameResult = Result.LOSE;
            return "You lose! " + computerSelection + " beats " + userSelection;
        }
        else if (computerSelection == Choice.PAPER && userSelection == Choice.ROCK) {
            gameResult = Result.LOSE;
            return "You lose! " + computerSelection + " beats " + userSelection;
        }
        else if (computerSelection == Choice.SCISSORS && userSelection == Choice.PAPER) {
            gameResult = Result.LOSE;
            return "You lose! " + computerSelection + " beats " + userSelection;
        } else {
            gameResult = Result.WIN;
        }
        return "You win! " + userSelection + " beats " + computerSelection;
    }
    
}
