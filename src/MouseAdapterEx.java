import java.awt.*;
import java.awt.Container;
import java.awt.event.*;
import java.awt.event.MouseAdapter;
import javax.swing.JFrame;
import javax.swing.JLabel;

// import org.w3c.dom.events.MouseEvent;

public class MouseAdapterEx extends JFrame {

  private JLabel label = new JLabel("hello");

  public MouseAdapterEx() {
    this.setTitle("Mouse Event 예제");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container contentPane = this.getContentPane();
    contentPane.addMouseListener(new MyMouseAdapter());

    contentPane.setLayout(null);
    contentPane.add(label);
    label.setLocation(100, 100);
    label.setSize(50, 20);

    this.setSize(300, 300);
    this.setVisible(true);
  }

  class MyMouseAdapter extends MouseAdapter {

    public void mousePressed(MouseEvent e) {
      int x = e.getX();
      int y = e.getY();
      label.setLocation(x, y);
    }
  }

  public static void main(String[] args) {
    new MouseAdapterEx();
  }
}
