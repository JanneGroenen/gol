package kata.gameoflife.cell;

public class Cell {
    private final int x;
    private final int y;
    private boolean isAlive;
    private boolean isAliveNextRound;

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
