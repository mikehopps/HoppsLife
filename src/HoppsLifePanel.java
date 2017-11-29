import javax.swing.*;

/**
 * Created by michael_hopps on 11/29/17.
 */
public class HoppsLifePanel extends JPanel{
    private Cell[][] grid;

    public HoppsLifePanel(int w, int h){
        setSize(w, h);
        grid = new Cell[20][20];
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                grid[r][c] = new Cell(r, c, grid, 40);
            }
        }

    }



}
