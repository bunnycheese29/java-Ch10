import java.awt.*;
import java.awt.Container;
import java.awt.event.*;
import java.awt.event.MouseAdapter;
import javax.swing.*;
import javax.swing.JFrame;

public class FlyingTextEx extends JFrame {

  private final int FLYING_UNIT = 10;
  private JLabel label = new JLabel("HELLO");

  public FlyingTextEx() {
    this.setTitle("상하좌우 키를 이용하여 텍스트 움직이기");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container contentPane = this.getContentPane();
    contentPane.setLayout(null);
    contentPane.addKeyListener(new MyKeyListener());

    label.setLocation(50, 50);
    label.setSize(100, 20);
    contentPane.add(label);

    this.setSize(300, 300);
    this.setVisible(true);
    contentPane.setFocusable(true);
    contentPane.requestFocus();
    // //포커스 강제 지정
    // contentPane.addMouseListener(
    //   new MouseAdapter() {
    //     public void mouseClicked(MouseEvent e) {
    //       Component com = (Component) e.getSource(); //마우스가 클린된 컴포넌트
    //       com.setFocusable(true);
    //       com.requestFocus();
    //     }
    //   }
    // );
  }

  class MyKeyListener extends KeyAdapter {

    public void keyPressed(KeyEvent e) {
      int keyCode = e.getKeyCode();
      if (keyCode == KeyEvent.VK_UP) {
        label.setLocation(label.getX(), label.getY() - FLYING_UNIT);
      } else if (keyCode == KeyEvent.VK_DOWN) {
        label.setLocation(label.getX(), label.getY() + FLYING_UNIT);
      } else if (keyCode == KeyEvent.VK_LEFT) {
        label.setLocation(label.getX() - FLYING_UNIT, label.getY());
      } else if (keyCode == KeyEvent.VK_RIGHT) {
        label.setLocation(label.getX() + FLYING_UNIT, label.getY());
      }
    }
  }

  public static void main(String[] args) {
    new FlyingTextEx();
  }
}
