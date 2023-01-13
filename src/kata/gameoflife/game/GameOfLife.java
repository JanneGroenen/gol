package kata.gameoflife.game;

import kata.gameoflife.cell.Cell;
import kata.gameoflife.screen.Screen;
import kata.gameoflife.screen.WindowScreen;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GameOfLife {

    private static List<Cell> listOfCells = new ArrayList<>();
    private static Screen windowScreen=new WindowScreen("GameOfLife");



    public void createAllCells(){
        for (int row = 0; row < 10; row++) {
            for (int column = 0; column < 10; column++) {
                Cell cell = new Cell(row,column);
                listOfCells.add(cell);
            }
        }
    }

    public List<Cell> getListOfCells() {
        return listOfCells;
    }

    public void setAllAliveOrDead(List<List<Integer>> aliveCells){


    }

}
