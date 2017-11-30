import javax.swing.*;
import java.awt.*;

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
                grid[r][c] = new Cell(r, c, 40);
                //give a 50% of spawn()?
            }
        }

    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("Life of Hopps");
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        int width = 800;
        int height = 800;
        frame.setPreferredSize(new Dimension(width, height + 24));


        JPanel panel = new HoppsLifePanel(width, height);
        panel.setFocusable(true);
        panel.grabFocus();

        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }



}
