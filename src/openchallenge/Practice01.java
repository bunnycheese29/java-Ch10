package openchallenge;

import java.awt.*;
import java.awt.Container;
import java.awt.event.*;
import java.awt.event.MouseAdapter;
import javax.swing.*;
import javax.swing.JFrame;

public class Practice01 extends JFrame {

  public Practice01() {
    this.setTitle("마우스 올리기 내리기");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container contentPane = this.getContentPane();
    contentPane.setLayout(new FlowLayout());
    JLabel label = new JLabel("Love Java");

    label.addMouseListener(
      new MouseAdapter() {
        public void mouseEntered(MouseEvent e) {
          JLabel label = (JLabel) e.getSource();
          label.setText("Love Java");
        }

        public void mouseExited(MouseEvent e) {
          JLabel label = (JLabel) e.getSource();
          label.setText("사랑해");
        }
      }
    );

    contentPane.add(label);
    label.setSize(50, 20);

    this.setSize(300, 300);
    this.setVisible(true);
  }

  public static void main(String[] args) {
    new Practice01();
  }
}
