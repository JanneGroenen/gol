package kata.gameoflife.game;

import kata.gameoflife.cell.Cell;
import kata.gameoflife.screen.InputConverter;
import kata.gameoflife.screen.Screen;
import kata.gameoflife.screen.WindowScreen;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GameOfLife {

    private static List<List<Cell>> listOfCells = new ArrayList<>();
    private static Screen windowScreen=new WindowScreen("GameOfLife");

    public void createAllCells(){
        for (int row = 0; row < 10; row++) {
            List<Cell> rowOfCells = new ArrayList<>();
            for (int column = 0; column < 10; column++) {
                Cell cell = new Cell(column,row);
                rowOfCells.add(cell);
            }
            listOfCells.add(rowOfCells);
        }
    }

    public List<List<Cell>> getListOfCells() {
        return listOfCells;
    }

    public void setAllAliveOrDead(List<List<Integer>> aliveCells) {
        for (int row = 0; row < 10; row++) {
            for (int column = 0; column < 10; column++) {
//                System.out.println(listOfCells.get(row).get(column));
                if (aliveCells.get(row).get(column) == 0) {
                    listOfCells.get(row).get(column).setAlive(false);
                }
                else if (aliveCells.get(row).get(column) == 1) {
                    listOfCells.get(row).get(column).setAlive(true);
                }
                else {
                    throw new IllegalArgumentException("Not a valid value for aliveCells row: " +
                            row + " column: " + column + " value: " +
                            aliveCells.get(row).get(column));
                }
            }
        }
    }

    public void findNeighboursForAllCells() {
        for(List<Cell> cellList1:listOfCells){
            for(Cell cell:cellList1){
                cell.findAllNeighbourCells(listOfCells);
            }
        }
    }

    public void startGameOfLife(){
        InputConverter inputConverter = new InputConverter();
        windowScreen.draw(inputConverter.convertToScreenInput(listOfCells));
    }

}
