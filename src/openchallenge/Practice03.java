package openchallenge;

import java.awt.*;
import java.awt.Container;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JFrame;

public class Practice03 extends JFrame {

  public Practice03() {
    this.setTitle("Left 키로 문자열 교체");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container contentPane = this.getContentPane();
    contentPane.setLayout(new FlowLayout(FlowLayout.CENTER));
    JLabel label = new JLabel("Love Java");
    contentPane.addKeyListener(
      new KeyAdapter() {
        public void keyPressed(KeyEvent e) {
          int keyCode = e.getKeyCode();
          if (keyCode == KeyEvent.VK_LEFT) {
            String text = label.getText();
            if (text.equals("Love Java")) {
              label.setText("avaJ evoL");
            } else {
              label.setText("Love Java");
            }
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
    new Practice03();
  }
}
