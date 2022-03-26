package com.kraft.SnakeAndLadder.SnakeAndLadder.accessor;

import com.kraft.SnakeAndLadder.SnakeAndLadder.constants.BoardConstants;
import com.kraft.SnakeAndLadder.SnakeAndLadder.model.PlayerTurn;
import com.kraft.SnakeAndLadder.SnakeAndLadder.model.Position;

public class PlayTurn {
    private PlayerTurn currPlayer;
    private PlayerTurn nextPlayer;

    public void moveOnBoard() {
        Integer move = Dice.getDiceValue();
        Position currPos = currPlayer.getPosition();
        int xValue = currPos.getxValue();
        int yValue = currPos.getyValue();

        //move this to constants
        if((xValue + move) > 4) {
            if(yValue != 3) {
                int diff = 4 - move;
                currPos.setxValue(diff); // xValue = diff;
                yValue = yValue + 1;
                currPos.setyValue(yValue);
            }
        }

        if(BoardConstants.BOARD_LAYOUT[xValue][yValue] == 16) {
            //Player Won

        }
    }

}
