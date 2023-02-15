import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class AnonymousClassListener extends JFrame {

  public AnonymousClassListener() {
    this.setTitle("Action Event");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container contentPane = this.getContentPane();
    contentPane.setLayout(new FlowLayout());

    JButton btn = new JButton("Action");

    btn.addActionListener(
      new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          JButton btn = (JButton) e.getSource(); //object
          //System.out.println(btn.getText()); //action
          if (btn.getText().equals("Action")) {
            btn.setText("액션");
          } else {
            btn.setText("Action");
          }
          setTitle("바껴라");
        }
      }
    );
    contentPane.add(btn);
    this.setSize(400, 300);
    this.setVisible(true);
  }

  public static void main(String[] args) {
    new AnonymousClassListener();
  }
}
