package kata.gameoflife;

import kata.gameoflife.cell.Cell;
import kata.gameoflife.game.GameOfLife;
import kata.gameoflife.screen.WindowScreen;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        GameOfLife gol = new GameOfLife();

        gol.createAllCells();
        List<List<Cell>> cellList=gol.getListOfCells();

        List<List<Integer>> startingState= List.of(
                List.of(0,0,0,0,0,0,0,0,0,0),
                List.of(0,0,1,0,0,0,0,0,0,0),
                List.of(0,1,1,1,0,0,1,1,1,0),
                List.of(0,0,0,0,0,0,0,0,0,0),
                List.of(0,0,0,0,0,1,0,0,0,0),
                List.of(0,0,1,0,0,0,0,1,0,0),
                List.of(0,0,1,0,0,0,0,1,0,0),
                List.of(0,0,1,0,0,0,0,1,0,0),
                List.of(0,0,0,0,0,0,0,0,0,0),
                List.of(0,0,0,0,0,0,0,0,0,0));

        gol.setAllAliveOrDead(startingState);

        gol.findNeighboursForAllCells();

//        for (List<Cell> cell1 : cellList) {
//            for (Cell cell : cell1) {
//                System.out.println(cell.getX() + ", " + cell.getY() + ", " + cell.getNeighbourCells());
//            }
//        }

        gol.startGameOfLife();

    }

}
