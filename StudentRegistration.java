import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StudentRegistration extends JFrame implements ActionListener
{
    JLabel l1, l2, l3;
    JTextField t1, t2, t3;
    JButton b1;

    StudentRegistration()
    {
        setTitle("Student Registration Form");
        setSize(400,250);
        setLayout(new GridLayout(4,2));

        l1 = new JLabel("Student Name:");
        l2 = new JLabel("Roll Number:");
        l3 = new JLabel("Course:");

        t1 = new JTextField();
        t2 = new JTextField();
        t3 = new JTextField();

        b1 = new JButton("Register");

        add(l1);
        add(t1);

        add(l2);
        add(t2);

        add(l3);
        add(t3);

        add(b1);

        b1.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        String name = t1.getText();
        String roll = t2.getText();
        String course = t3.getText();

        JOptionPane.showMessageDialog(
            this,
            "Student Name: " + name +
            "\nRoll Number: " + roll +
            "\nCourse: " + course
        );
    }

    public static void main(String args[])
    {
        new StudentRegistration();
    }
}