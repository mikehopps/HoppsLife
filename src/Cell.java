import java.awt.*;

/**
 * Created by michael_hopps on 11/29/17.
 */
public class Cell {
    private boolean isAlive;
    private int row, col, size;


    public Cell(int r, int c, int size){
        isAlive = false;
        row = r;
        col = c;
        this.size = size;
    }
    public void kill(){

    }
    public void spawn(){
        isAlive = true;
    }

    public int numNeighbors(Cell[][] grid){

        return 0;
    }
    public void draw(Graphics2D g2){
        g2.drawRect(col*size, row*size, size, size);
        if(isAlive)
            g2.fillRect(col*size, row*size, size, size);
    }
    public boolean getIsAlive(){
        return isAlive;
    }


}
