import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EmployeeRegistration extends JFrame implements ActionListener
{
    JLabel l1, l2, l3, l4;
    JTextField t1, t2, t3, t4;
    JButton b1;

    EmployeeRegistration()
    {
        setTitle("Employee Registration Form");
        setSize(400, 300);
        setLayout(new GridLayout(5, 2));

        l1 = new JLabel("Employee ID:");
        l2 = new JLabel("Name:");
        l3 = new JLabel("Department:");
        l4 = new JLabel("Salary:");

        t1 = new JTextField();
        t2 = new JTextField();
        t3 = new JTextField();
        t4 = new JTextField();

        b1 = new JButton("Register");

        add(l1);
        add(t1);

        add(l2);
        add(t2);

        add(l3);
        add(t3);

        add(l4);
        add(t4);

        add(b1);

        b1.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        String id = t1.getText();
        String name = t2.getText();
        String dept = t3.getText();
        String salary = t4.getText();

        JOptionPane.showMessageDialog(
            this,
            "Employee ID: " + id +
            "\nName: " + name +
            "\nDepartment: " + dept +
            "\nSalary: " + salary
        );
    }

    public static void main(String args[])
    {
        new EmployeeRegistration();
    }
}