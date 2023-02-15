package openchallenge;

import java.awt.*;
import java.awt.Container;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JFrame;

public class Practice05 extends JFrame {

  int size = 10;

  public Practice05() {
    this.setTitle("+,- 키로 폰트 크기 조절");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container contentPane = this.getContentPane();
    contentPane.setLayout(new FlowLayout(FlowLayout.CENTER));
    JLabel label = new JLabel("Love Java");

    label.setFont(new Font("Arial", Font.PLAIN, 10));
    contentPane.addKeyListener(
      new KeyAdapter() {
        public void keyPressed(KeyEvent e) {
          if (
            e.getKeyCode() == KeyEvent.VK_PLUS ||
            e.getKeyCode() == KeyEvent.VK_EQUALS
          ) {
            size += 5;
            label.setFont(new Font("Arial", Font.PLAIN, size));
          } else if (e.getKeyCode() == KeyEvent.VK_MINUS) {
            size -= 5;
            label.setFont(new Font("Arial", Font.PLAIN, size));
          }
        }
      }
    );

    contentPane.add(label);
    contentPane.setFocusable(true);
    contentPane.requestFocus();
    label.setSize(50, 20);
    this.setSize(300, 300);
    this.setVisible(true);
  }

  public static void main(String[] args) {
    new Practice05();
  }
}
