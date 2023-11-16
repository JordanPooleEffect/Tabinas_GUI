package SimpleCalculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalc extends JFrame{
    private JTextField tfNumber1;
    private JTextField tfNumber2;
    private JPanel jpanel;
    private JComboBox cbOperations;
    private JButton btnCompute;
    private JTextField lblResult;

    public SimpleCalc() {

        setContentPane(jpanel);
        setSize(700, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setTitle("Simple Calculator");
        tfNumber1.setHorizontalAlignment(JTextField.CENTER);
        tfNumber2.setHorizontalAlignment(JTextField.CENTER);
        lblResult.setHorizontalAlignment(JTextField.CENTER);
        btnCompute.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String operation = (String) cbOperations.getSelectedItem();
                    int number1 = Integer.parseInt(tfNumber1.getText());
                    int number2 = Integer.parseInt(tfNumber2.getText());
                    int result = 0;

                    if (operation.equals("+")) {
                        result = number1 + number2;
                    } else if (operation.equals("-")) {
                        result = number1 - number2;
                    } else if (operation.equals("*")) {
                        result = number1 * number2;
                    } else if (operation.equals("/")) {
                        result = number1 / number2;
                    }

                    lblResult.setText(String.valueOf(result));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Invalid input!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }
    public static void main(String[] args) {
        SimpleCalc app = new SimpleCalc();
    }
}