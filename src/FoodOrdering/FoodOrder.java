package FoodOrdering;

import LeapYear.LeapYear;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class FoodOrder extends JFrame{
    private JPanel panel1;
    private JCheckBox cPizza;
    private JRadioButton noneRadioButton;
    private JButton btnOrder;
    private JCheckBox cBurger;
    private JCheckBox cSoftDrinks;
    private JCheckBox cTea;
    private JCheckBox cSundae;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;
    private JCheckBox cFries;

    public FoodOrder(){
        btnOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                double cost = Calculate();
                JOptionPane.showMessageDialog(null, "The total price is Php "+cost);

            }
        });
    }

    private double Calculate(){
        double total = 0;
        if(cPizza.isSelected()){
            total += 100;
        }
        if(cBurger.isSelected()){
            total += 80;
        }
        if(cFries.isSelected()){
            total += 65;
        }
        if(cSoftDrinks.isSelected()){
            total += 55;
        }
        if(cTea.isSelected()){
            total += 50;
        }
        if(cSundae.isSelected()){
            total += 40;
        }

        double discount = 0;
        if(rb5.isSelected()){
            discount = 0.05;
        }
        else if (rb10.isSelected()){
            discount = 0.1;
        }
        else if (rb15.isSelected()){
            discount = 0.15;
        }

        return total-(total*discount);
    }

    public static void main(String[] args) {
        FoodOrder food = new FoodOrder();
        food.setTitle("Leap Year Checker");
        food.setContentPane(food.panel1);
        food.setSize(500, 500);
        food.setDefaultCloseOperation(EXIT_ON_CLOSE);
        food.setVisible(true);
    }
}
