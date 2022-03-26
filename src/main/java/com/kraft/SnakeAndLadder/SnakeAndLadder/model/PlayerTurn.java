package com.kraft.SnakeAndLadder.SnakeAndLadder.model;

import java.util.List;

public class PlayerTurn extends Player{
    private Game currentGame;
    private Position position;
    private List<Position> positions;

    public Game getCurrentGame() {
        return currentGame;
    }

    public void setCurrentGame(Game currentGame) {
        this.currentGame = currentGame;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public List<Position> getPositions() {
        return positions;
    }

    public void setPositions(List<Position> positions) {
        this.positions = positions;
    }


}
