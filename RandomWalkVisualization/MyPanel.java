import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class MyPanel extends JPanel{

  private final int MPS = 20;
  private final int length = 1010;
  private final long START_TIME = System.nanoTime();
  private final long TIME_INCREMENT = (long) Math.pow(10, 9) / MPS;
  private long currentTime = 0;
  private int[] coordinates = {500, 500};
  private int x = 0, y = 1;
  private int count = 0;
  private int stepSize = 10;
  private int[][] squareColors = new int[length/stepSize][length/stepSize];

  @Override
  public Dimension getPreferredSize(){
    return new Dimension(length, length);
  }

  @Override
  public void paintComponent(Graphics g){
    if(coordinates[x] < 0 || coordinates[x] > length-5 || coordinates[y] < 0 || coordinates[y] > length-5){
      System.exit(0);
    }
    super.paintComponent(g);
    for(int i = 0; i < length/stepSize; i++){
      for(int j = 0; j < length/stepSize; j++){
          g.setColor(new Color(squareColors[i][j],0,0));
          g.fillRect(i*10, j*10, 10, 10);
      }
    }
    g.setColor(new Color(255,0,0));
    g.fillRect(coordinates[x], coordinates[y], 10, 10);
    repaint();
    if(squareColors[coordinates[x]/stepSize][coordinates[y]/stepSize]< 225)squareColors[coordinates[x]/stepSize][coordinates[y]/stepSize]+=30;
    coordinates = move(coordinates);
    currentTime += TIME_INCREMENT;
    while (System.nanoTime() - START_TIME < currentTime);
  }


  public int[] move(int[]c){
    int move = (int) (Math.random() * 4);
    if(move == 0)c[0]+=10;
    if(move == 1)c[0]-=10;
    if(move == 2)c[1]+=10;
    if(move == 3)c[1]-=10;
    return c;
  }
}
