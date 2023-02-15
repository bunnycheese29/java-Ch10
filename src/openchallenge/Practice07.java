package openchallenge;

import java.awt.*;
import java.awt.Container;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JFrame;

public class Practice07 extends JFrame {

  int size = 10;

  public Practice07() {
    this.setTitle("마우스 휠을 굴려 폰트 크기 조절");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container contentPane = this.getContentPane();
    contentPane.setLayout(new FlowLayout(FlowLayout.CENTER));
    JLabel label = new JLabel("Love Java");
    label.setFont(new Font("Arial", Font.PLAIN, 18));
    label.addMouseWheelListener(
      new MouseWheelListener() {
        @Override
        public void mouseWheelMoved(MouseWheelEvent e) {
          int n = e.getWheelRotation();
          if (n < 0) {
            size += 5;
            label.setFont(new Font("Arial", Font.PLAIN, size));
          } else {
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
    new Practice07();
  }
}
