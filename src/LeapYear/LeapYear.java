package LeapYear;

import javax.swing.*;

public class LeapYear extends JFrame{
    private JPanel panel1;
    private JTextField textField1;
    private JButton checkButton;

    public static void main(String[] args) {
        LeapYear year = new LeapYear();
        year.setTitle("Leap Year Checker");
        year.setContentPane(year.panel1);
        year.setSize(400, 300);
        year.setDefaultCloseOperation(EXIT_ON_CLOSE);
        year.setVisible(true);
    }
}
