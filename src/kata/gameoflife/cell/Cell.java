package kata.gameoflife.cell;

import java.util.ArrayList;
import java.util.List;

public class Cell {
    private final int x;
    private final int y;
    private boolean isAlive;
    private boolean isAliveNextRound;
    private List<Cell> neighbourCells = new ArrayList<>();

    public Cell(int x, int y) {
        this.x = x;
        this.y = y;
        isAlive=false;
        isAliveNextRound=false;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public void findAllNeighbourCells (List<List<Cell>> cellList) {
        for (int row = -1; row <= 1; row++) {
            if (row + x < 0 || row + x >= cellList.size())
            for (int column = -1; column <= 1; column++) {
                if (row + y < 0 || row + y >= cellList.get(0).size())
                if (row == 0 && column == 0) {
                    continue;
                }
//                if (cellList.get(x + row).get(y + column)) {

                }
            }
        }
    }

    public boolean isAliveNextRound() {
        return isAliveNextRound;
    }

    public void setAliveNextRound(boolean aliveNextRound) {
        isAliveNextRound = aliveNextRound;
    }



    @Override
    public String toString() {
        return "Cell{" +
                "x=" + x +
                ", y=" + y +
                ", isAlive=" + isAlive +
//                ", isAliveNextRound=" + isAliveNextRound +
                '}';
    }
}
