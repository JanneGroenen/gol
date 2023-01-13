package kata.gameoflife;

import kata.gameoflife.cell.Cell;
import kata.gameoflife.game.GameOfLife;
import kata.gameoflife.screen.WindowScreen;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        GameOfLife gol = new GameOfLife();

        gol.createAllCells();
     List<Cell> cellList=gol.getListOfCells();

    }

}
