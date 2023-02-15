package openchallenge;

import java.awt.*;
import java.awt.Container;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JFrame;

public class Practice04 extends JFrame {

  public Practice04() {
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
            label.setText(text.substring(1) + text.substring(0, 1));
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
    new Practice04();
  }
}
