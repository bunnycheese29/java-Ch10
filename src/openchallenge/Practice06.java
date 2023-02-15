package openchallenge;

// import java.awt.*;
import java.awt.Container;
import java.awt.event.*;
import java.awt.event.MouseAdapter;
import javax.swing.*;
import javax.swing.JFrame;

public class Practice06 extends JFrame {

  public Practice06() {
    this.setTitle("클릭 연습 용 응용프로그램");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container contentPane = this.getContentPane();
    contentPane.setLayout(null);

    JLabel label = new JLabel("c");
    label.setLocation(100, 100);

    label.addMouseListener(
      new MouseAdapter() {
        public void mouseClicked(MouseEvent e) {
          int x = (int) (Math.random() * 250);
          int y = (int) (Math.random() * 250);
          label.setLocation(x, y);
        }
      }
    );
    contentPane.add(label);
    label.setSize(50, 20);
    this.setSize(300, 300);
    this.setVisible(true);
  }

  public static void main(String[] args) {
    new Practice06();
  }
}
