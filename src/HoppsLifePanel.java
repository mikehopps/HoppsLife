import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by michael_hopps on 11/29/17.
 */
public class HoppsLifePanel extends JPanel{
    private Cell[][] grid;
    private Timer timer;

    public HoppsLifePanel(int w, int h){
        setSize(w, h);
        grid = new Cell[20][20];
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                grid[r][c] = new Cell(r, c, 40);

            }
        }
        grid[4][3].spawn(); //for testing
        grid[5][3].spawn();
        grid[4][2].spawn();
        grid[5][4].spawn();
        timer = new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Calculate every generation here.

                //boolean[][] nextgen...
                //go to every cell
                    //count the neighbors...
                    //apply the rules of life - cause true or false...

                //set cells to spawn or kill based on nextgen

                repaint();
            }
        });
        timer.start();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        //Tell every Cell to draw itself.
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                grid[r][c].draw(g2);
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
