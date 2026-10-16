import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BankBalance extends JFrame implements ActionListener
{
    JTextField t1,t2,t3;
    JButton b1,b2;

    BankBalance()
    {
        setTitle("Bank Balance Calculator");
        setSize(400,250);
        setLayout(new GridLayout(4,2));

        add(new JLabel("Initial Balance:"));
        t1=new JTextField();
        add(t1);

        add(new JLabel("Transaction Amount:"));
        t2=new JTextField();
        add(t2);

        b1=new JButton("Deposit");
        b2=new JButton("Withdraw");

        add(b1);
        add(b2);

        add(new JLabel("Updated Balance:"));
        t3=new JTextField();
        add(t3);

        b1.addActionListener(this);
        b2.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        double balance=Double.parseDouble(t1.getText());
        double amount=Double.parseDouble(t2.getText());

        if(e.getSource()==b1)
        {
            balance=balance+amount;
        }

        if(e.getSource()==b2)
        {
            balance=balance-amount;
        }

        t3.setText("" + balance);
    }

    public static void main(String args[])
    {
        new BankBalance();
    }
}