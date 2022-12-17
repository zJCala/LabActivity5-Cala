package SimpleCalc;

import LeapYear.LeapYear;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class SimpleCalc extends JFrame{
    private JPanel panel1;
    private JTextField tfNumber1;
    private JComboBox cbOperations;
    private JButton btnCompute;
    private JTextField tfNumber2;
    private JTextField lblResult;

    public SimpleCalc(){
        btnCompute.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(tfNumber1.getText());
                    double num2 = Double.parseDouble(tfNumber2.getText());
                    double result = 0;

                    if(cbOperations.getSelectedItem().equals("-")){
                        result = num1-num2;
                    }
                    if(cbOperations.getSelectedItem().equals("+")){
                        result = num1+num2;
                    }
                    if(cbOperations.getSelectedItem().equals("/")){
                        result = num1/num2;
                    }
                    if(cbOperations.getSelectedItem().equals("*")){
                        result = num1*num2;
                    }
                    String str = String.valueOf(result);
                    lblResult.setText(str);
                } catch(NumberFormatException a){
                    JOptionPane.showMessageDialog(null, "INVALID");
                }
            }
        });
    }

    public static void main(String[] args) {
        SimpleCalc calcu = new SimpleCalc();
        calcu.setTitle("Simple Calculator");
        calcu.setContentPane(calcu.panel1);
        calcu.setSize(500, 400);
        calcu.setDefaultCloseOperation(EXIT_ON_CLOSE);
        calcu.setVisible(true);
    }
}
