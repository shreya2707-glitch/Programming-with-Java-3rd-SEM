import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ColorChanger extends JFrame implements ActionListener
{
    JLabel l1;
    JButton b1,b2,b3;

    ColorChanger()
    {
        setTitle("Color Changer");
        setSize(400,200);
        setLayout(new FlowLayout());

        l1=new JLabel("Click a button");
        
        b1=new JButton("Red");
        b2=new JButton("Green");
        b3=new JButton("Blue");

        add(l1);
        add(b1);
        add(b2);
        add(b3);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
        {
            l1.setForeground(Color.RED);
            l1.setText("Red Button Clicked");
        }

        if(e.getSource()==b2)
        {
            l1.setForeground(Color.GREEN);
            l1.setText("Green Button Clicked");
        }

        if(e.getSource()==b3)
        {
            l1.setForeground(Color.BLUE);
            l1.setText("Blue Button Clicked");
        }
    }

    public static void main(String args[])
    {
        new ColorChanger();
    }
}