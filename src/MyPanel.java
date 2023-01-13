
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;

public class MyPanel extends JPanel {
    SomeText stext = new SomeText();
    String sometext = stext.sometext();

    private JButton b1;
    private JButton b8;
    private JButton b9;
    private JButton b0;
    private JButton b7;
    private JButton b6;
    private JButton b5;
    private JButton b4;
    private JButton b3;
    private JButton b2;
    private JButton b_enter;
    //private JTextArea main_text;
    private JLabel mini_text;

    public MyPanel() {
        //construct components
        b1 = new JButton ("1");
        b8 = new JButton ("8");
        b9 = new JButton ("9");
        b0 = new JButton ("0");
        b7 = new JButton ("7");
        b6 = new JButton ("6");
        b5 = new JButton ("5");
        b4 = new JButton ("4");
        b3 = new JButton ("3");
        b2 = new JButton ("2");
        b_enter = new JButton ("Enter");
        //main_text = new JTextArea (5, 5);
        mini_text = new JLabel ("MiniText" + sometext);

        //Логика цифровых кнопок
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mini_text.setText("Second text");
            }
        });

        //set components properties
        //main_text.setToolTipText ("Welcome");


        //adjust size and set layout
        setPreferredSize (new Dimension (911, 601));
        setLayout (null);

        //add components
        add (b1);
        add (b8);
        add (b9);
        add (b0);
        add (b7);
        add (b6);
        add (b5);
        add (b4);
        add (b3);
        add (b2);
        add (b_enter);
        //add (main_text);
        add (mini_text);

        //set component bounds (only needed by Absolute Positioning)
        b1.setBounds (300, 430, 50, 50);
        b8.setBounds (355, 320, 50, 50);
        b9.setBounds (410, 320, 50, 50);
        b0.setBounds (300, 485, 50, 50);
        b7.setBounds (300, 320, 50, 50);
        b6.setBounds (410, 375, 50, 50);
        b5.setBounds (355, 375, 50, 50);
        b4.setBounds (300, 375, 50, 50);
        b3.setBounds (410, 430, 50, 50);
        b2.setBounds (355, 430, 50, 50);
        b_enter.setBounds (355, 485, 105, 50);
        //main_text.setBounds (190, 5, 545, 180);
        mini_text.setBounds (190, 5, 545, 180);
    }
}
