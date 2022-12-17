package FoodOrdering;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class SelectException extends Exception {
    public SelectException(String s){
        super(s);
    }
}

public class FoodOrder extends JFrame{
    private JPanel panel1;
    private JCheckBox cPizza;
    private JRadioButton rbNone;
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
        ButtonGroup disc = new ButtonGroup();
        disc.add(rbNone);
        disc.add(rb5);
        disc.add(rb10);
        disc.add(rb15);
        btnOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    if(!cPizza.isSelected() && !cBurger.isSelected() && !cFries.isSelected() && !cSoftDrinks.isSelected() && !cTea.isSelected() && !cSundae.isSelected()){
                        throw (new SelectException("Must pick 1 item"));
                    }
                    double cost = Calculate();
                    JOptionPane.showMessageDialog(null, "The total price is Php " + cost);
                }
                catch (SelectException a){
                    JOptionPane.showMessageDialog(null, "" +a.getMessage());
                }
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
        food.setTitle("Food Ordering System");
        food.setContentPane(food.panel1);
        food.setSize(500, 500);
        food.setDefaultCloseOperation(EXIT_ON_CLOSE);
        food.setVisible(true);
    }
}
