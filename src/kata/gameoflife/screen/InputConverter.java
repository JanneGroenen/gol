package kata.gameoflife.screen;

import kata.gameoflife.cell.Cell;

import java.util.ArrayList;
import java.util.List;

public class InputConverter {
    private List<List<Integer>> screenInput = new ArrayList<>();

    public List<List<Integer>> convertToScreenInput(List<List<Cell>> cellList){
            for (int row = 0; row < 10; row++) {
                List<Integer> rowOfCells = new ArrayList<>();
                for (int column = 0; column < 10; column++) {
//                System.out.println(listOfCells.get(row).get(column));
                    if (!cellList.get(row).get(column).isAlive()) {
                        rowOfCells.add(0);
                    } else {
                        rowOfCells.add(1);
                    }
                }
                screenInput.add(rowOfCells);
            }

        return screenInput;
    }

}
