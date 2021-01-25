import javax.swing.*;

public class RandomWalk{
  public static void main(String[] args){
    JFrame jFrame = new JFrame("2 Dimensional Random Walk");
    jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    jFrame.add(new MyPanel());
    jFrame.pack();
    jFrame.setVisible(true);
  }
}
