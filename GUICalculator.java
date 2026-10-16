import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUICalculator extends JFrame implements ActionListener
{
    JTextField t1,t2,t3;
    JButton b1,b2;

    GUICalculator()
    {
        setTitle("Simple Calculator");
        setSize(400,250);
        setLayout(new GridLayout(4,2));

        add(new JLabel("First Number:"));
        t1=new JTextField();
        add(t1);

        add(new JLabel("Second Number:"));
        t2=new JTextField();
        add(t2);

        b1=new JButton("Add");
        b2=new JButton("Subtract");

        add(b1);
        add(b2);

        add(new JLabel("Result:"));
        t3=new JTextField();
        add(t3);

        b1.addActionListener(this);
        b2.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        double a=Double.parseDouble(t1.getText());
        double b=Double.parseDouble(t2.getText());

        if(e.getSource()==b1)
            t3.setText("" + (a+b));

        if(e.getSource()==b2)
            t3.setText("" + (a-b));
    }

    public static void main(String args[])
    {
        new GUICalculator();
    }
}