import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class MyActionListener implements ActionListener {

  @Override
  public void actionPerformed(ActionEvent e) {
    JButton btn = (JButton) e.getSource(); //object
    //System.out.println(btn.getText()); //action
    if (btn.getText().equals("Action")) {
      btn.setText("액션");
    } else {
      btn.setText("Action");
    }
  }
}

public class IndependentClassListener extends JFrame {

  public IndependentClassListener() {
    this.setTitle("Action Event");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container contentPane = this.getContentPane();
    contentPane.setLayout(new FlowLayout());

    JButton btn = new JButton("Action");
    btn.addActionListener(new MyActionListener());
    contentPane.add(btn);
    this.setSize(400, 300);
    this.setVisible(true);
  }

  public static void main(String[] args) {
    new IndependentClassListener();
  }
}
