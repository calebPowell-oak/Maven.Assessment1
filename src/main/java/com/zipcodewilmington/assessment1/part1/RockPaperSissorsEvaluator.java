package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class RockPaperSissorsEvaluator {
    protected static final String ROCK = "rock";
    protected static final String PAPER = "paper";
    protected static final String SCISSOR = "scissor";

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective winning move
     */
    public String getWinningMove(String handSign) {
        switch (handSign){
            case ROCK:{
                return PAPER;
            }
            case PAPER:{
                return SCISSOR;
            }
            default:{
                return ROCK;
            }
        }
    }

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective losing move
     */
    public String getLosingMove(String handSign) {
        switch (handSign){
            case ROCK:{
                return SCISSOR;
            }
            case PAPER:{
                return ROCK;
            }
            default:{
                return PAPER;
            }
        }
    }

    /**
     * @param handSignOfPlayer1 a string representative of a hand sign of a player
     * @param handSignOfPlayer2 a string representative of a hand sign of a challenger
     * @return a string representative of the winning hand sign between the two players
     */
    public String getWinner(String handSignOfPlayer1, String handSignOfPlayer2) {
        if(getLosingMove(handSignOfPlayer1).equals(handSignOfPlayer2)){
            return handSignOfPlayer1;
        } else {
            return handSignOfPlayer2;
        }
    }
}
