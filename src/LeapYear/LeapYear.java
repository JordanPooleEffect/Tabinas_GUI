package LeapYear;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class LeapYear extends JFrame{
    private JPanel jpanel;
    private JTextField tfYear;
    private JButton btnCheckYear;

    public LeapYear() {
        btnCheckYear.addActionListener(e -> {
            int year = Integer.parseInt(tfYear.getText());
            if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                JOptionPane.showMessageDialog(this, "Leap year");
            } else {
                JOptionPane.showMessageDialog(this, "Not a leap year");
            }
        });
    }

    public static void main(String[] args) {
        LeapYear app = new LeapYear();
        app.setContentPane(app.jpanel);
        app.setSize(500,200);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
        app.setTitle("Leap Year Checker");
    }
}
