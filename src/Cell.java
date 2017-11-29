/**
 * Created by michael_hopps on 11/29/17.
 */
public class Cell {
    private boolean isAlive;
    private int row, col, size;
    private Cell[][] grid;

    public Cell(int r, int c, Cell[][] grid, int size){
        this.grid = grid;
        isAlive = false;
        row = r;
        col = c;
        this.size = size;
    }

}
