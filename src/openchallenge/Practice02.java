package openchallenge;

import java.awt.*;
import java.awt.Container;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.event.MouseInputListener;

public class Practice02 extends JFrame {

  public Practice02() {
    this.setTitle("드래깅동안 YELLOW");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container contentPane = this.getContentPane();
    contentPane.setBackground(Color.green);
    contentPane.addMouseMotionListener(
      new MouseMotionListener() {
        @Override
        public void mouseDragged(MouseEvent e) {
          Container contentPane = (Container) e.getSource();
          contentPane.setBackground(Color.yellow);
        }

        @Override
        public void mouseMoved(MouseEvent e) {}
      }
    );
    contentPane.addMouseListener(
      new MouseAdapter() {
        @Override
        public void mouseReleased(MouseEvent e) {
          Container contentPane = (Container) e.getSource();
          contentPane.setBackground(Color.green);
        }
      }
    );

    this.setSize(300, 300);
    this.setVisible(true);
  }

  public static void main(String[] args) {
    new Practice02();
  }
}
