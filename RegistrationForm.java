import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RegistrationForm extends JFrame implements ActionListener
{
    JLabel l1,l2,l3,l4;
    JTextField t1,t2,t3,t4;
    JButton b1;

    RegistrationForm()
    {
        setTitle("Registration Form");
        setSize(400,300);
        setLayout(new GridLayout(5,2));

        l1=new JLabel("ID:");
        l2=new JLabel("Name:");
        l3=new JLabel("Department:");
        l4=new JLabel("Salary:");

        t1=new JTextField();
        t2=new JTextField();
        t3=new JTextField();
        t4=new JTextField();

        b1=new JButton("Submit");

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

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        String id=t1.getText();
        String name=t2.getText();
        String dept=t3.getText();
        String salary=t4.getText();

        JOptionPane.showMessageDialog(this,
            "ID: "+id+
            "\nName: "+name+
            "\nDepartment: "+dept+
            "\nSalary: "+salary);
    }

    public static void main(String args[])
    {
        new RegistrationForm();
    }
}