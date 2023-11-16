package FoodOrder;

import javax.swing.*;
import java.awt.*;

public class FoodOrderingSystem extends JFrame {
    private JCheckBox cPizza;
    private JCheckBox cBurger;
    private JCheckBox cFries;
    private JCheckBox cSoftDrinks;
    private JCheckBox cTea;
    private JCheckBox cSundae;
    private JButton btnOrder;
    private JRadioButton rbNone;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;
    private JPanel jpanel;

    public FoodOrderingSystem(){
        FoodOrderingSystem a = this;
        boolean isTrue;

        btnOrder.addActionListener(e -> {
            float tot = 0;

            if (cPizza.isSelected()) {
                tot = tot + 100;
            }
            if (cBurger.isSelected()) {
                tot = tot + 80;
            }
            if (cFries.isSelected()) {
                tot = tot + 65;
            }
            if (cSoftDrinks.isSelected()) {
                tot = tot + 55;
            }
            if (cTea.isSelected()) {
                tot = tot + 50;
            }
            if (cSundae.isSelected()) {
                tot = tot + 40;
            }

            if(rbNone.isSelected()){
                tot = tot;
            }
            if(rb5.isSelected()){
                tot = (float) (tot - (tot * 0.05));
            }
            if(rb10.isSelected()){
                tot = (float) (tot - (tot * 0.10));
            }
            if(rb15.isSelected()){
                tot = (float) (tot - (tot * 0.15));
            }

            JOptionPane.showMessageDialog(a, "Total price is Php " + String.format("%.2f", tot));
        });
    }

    public static void main(String[] args) {
        FoodOrderingSystem app = new FoodOrderingSystem();
        app.setContentPane(app.jpanel);
        app.setSize(500,350);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
        app.setTitle("Food Ordering System");
    }
}
