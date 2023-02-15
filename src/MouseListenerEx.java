import java.awt.*;
import java.awt.Container;
import java.awt.event.*;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JLabel;

// import org.w3c.dom.events.MouseEvent;

public class MouseListenerEx extends JFrame {

  private JLabel label = new JLabel("hello");

  public MouseListenerEx() {
    this.setTitle("Mouse Event 예제");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container contentPane = this.getContentPane();
    contentPane.addMouseListener(new MyMouseListener());

    contentPane.setLayout(null);
    contentPane.add(label);
    label.setLocation(100, 100);
    label.setSize(50, 20);

    this.setSize(300, 300);
    this.setVisible(true);
  }

  class MyMouseListener implements MouseListener {

    @Override
    public void mouseClicked(MouseEvent e) {
      // TODO Auto-generated method stub

    }

    @Override
    public void mousePressed(MouseEvent e) {
      // TODO Auto-generated method stub
      int x = e.getX();
      int y = e.getY();
      label.setLocation(x, y);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
      // TODO Auto-generated method stub

    }

    @Override
    public void mouseEntered(MouseEvent e) {
      // TODO Auto-generated method stub

    }

    @Override
    public void mouseExited(MouseEvent e) {
      // TODO Auto-generated method stub

    }
  }

  public static void main(String[] args) {
    new MouseListenerEx();
  }
}
