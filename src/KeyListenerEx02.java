import java.awt.*;
import java.awt.Container;
import java.awt.event.*;
import java.awt.event.MouseAdapter;
import javax.swing.*;
import javax.swing.JFrame;

public class KeyListenerEx02 extends JFrame {

  private JLabel label = new JLabel();

  public KeyListenerEx02() {
    this.setTitle("KeyListener");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container contentPane = this.getContentPane();
    contentPane.setLayout(new FlowLayout());
    contentPane.addKeyListener(new MyKeyListener());

    this.setSize(300, 300);
    this.setVisible(true);
    contentPane.setFocusable(true);
    contentPane.requestFocus();
  }

  class MyKeyListener extends KeyAdapter {

    public void keyPressed(KeyEvent e) {
      Container contentPane = (Container) e.getSource();
      int keyCode = e.getKeyCode();
      char keyChar = e.getKeyChar();
      if (keyCode == KeyEvent.VK_F1) {
        contentPane.setBackground(Color.GREEN);
      } else if (keyCode == KeyEvent.VK_F2) {
        contentPane.setBackground(Color.YELLOW);
      }
    }

    public void keyTyped(KeyEvent e) {}

    public void keyReleased(KeyEvent e) {}
  }

  public static void main(String[] args) {
    new KeyListenerEx02();
  }
}
