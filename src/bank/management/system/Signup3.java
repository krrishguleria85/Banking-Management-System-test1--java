package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup3 extends JFrame implements ActionListener {
    JButton s,c;
    JRadioButton s1,ca1,fd1,rd1;
    JCheckBox c1,c2,c3,c4,c5,c6;
    String formno;

    Signup3(String formno){
        this.formno = formno;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(130,20,110,100);
        add(image);


        JLabel l1 = new JLabel("Page 3:");
        l1.setFont(new Font("Railway",Font.BOLD,25));
        l1.setBounds(285,40,600,30);
        add(l1);

        JLabel l2 = new JLabel("Account Details");
        l2.setFont(new Font("Arial",Font.BOLD,25));
        l2.setBounds(285,79,600,30);
        add(l2);



        JLabel l3 = new JLabel("Account Type:");
        l3.setFont(new Font("Arial",Font.BOLD,21));
        l3.setBounds(80,150,400,30);
        add(l3);

        s1 = new JRadioButton("Saving Account");
        s1.setFont(new Font("Railway",Font.BOLD,14));
        s1.setBounds(120,200,250,30);
        s1.setBackground(new Color(215,252,252));
        add(s1);

        fd1 = new JRadioButton("Fixed Deposit Account");
        fd1.setFont(new Font("Railway",Font.BOLD,14));
        fd1.setBounds(410,200,250,30);
        fd1.setBackground(new Color(215,252,252));
        add(fd1);

        ca1 = new JRadioButton("Current Account");
        ca1.setFont(new Font("Railway",Font.BOLD,14));
        ca1.setBounds(120,230,250,30);
        ca1.setBackground(new Color(215,252,252));
        add(ca1);

        rd1 = new JRadioButton("Recurring Deposit Account");
        rd1.setFont(new Font("Railway",Font.BOLD,14));
        rd1.setBounds(410,230,250,30);
        rd1.setBackground(new Color(215,252,252));
        add(rd1);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(s1);
        buttonGroup.add(ca1);
        buttonGroup.add(fd1);
        buttonGroup.add(rd1);



        JLabel l4 = new JLabel("Card Number:");
        l4.setFont(new Font("Arial",Font.BOLD,21));
        l4.setBounds(80,300,200,30);
        add(l4);

        JLabel l5 = new JLabel("(Your 16-digit Card Number)");
        l5.setFont(new Font("Arial",Font.BOLD,14));
        l5.setBounds(80,330,300,20);
        add(l5);



        JLabel l6 = new JLabel("XXXX-XXXX-XXXX-4841");
        l6.setFont(new Font("Arial",Font.BOLD,21));
        l6.setBounds(330,304,250,20);
        add(l6);


        JLabel l7 = new JLabel("(It would appear on atm card/cheque book and Statements)");
        l7.setFont(new Font("Arial",Font.BOLD,14));
        l7.setBounds(330,330,380,20);
        add(l7);


        JLabel l8 = new JLabel("PIN:");
        l8.setFont(new Font("Arial",Font.BOLD,21));
        l8.setBounds(80,385,380,20);
        add(l8);

        JLabel l9 = new JLabel("XXXX");
        l9.setFont(new Font("Arial",Font.BOLD,21));
        l9.setBounds(330,385,380,20);
        add(l9);

        JLabel l10 = new JLabel("(4-digit Password)");
        l10.setFont(new Font("Railway",Font.BOLD,14));
        l10.setBounds(80,405,380,20);
        add(l10);



        JLabel l11 = new JLabel("Services Required:");
        l11.setFont(new Font("Arial",Font.BOLD,21));
        l11.setBounds(80,465,380,20);
        add(l11);

        c1 = new JCheckBox("ATM CARD");
        c1.setBackground(new Color(215,252,252));
        c1.setFont(new Font("Railway",Font.BOLD,14));
        c1.setBounds(130,520,100,20);
        add(c1);

        c2 = new JCheckBox("Internet Banking");
        c2.setBackground(new Color(215,252,252));
        c2.setFont(new Font("Railway",Font.BOLD,14));
        c2.setBounds(410,520,190,20);
        add(c2);

        c3 = new JCheckBox("Mobile Banking");
        c3.setBackground(new Color(215,252,252));
        c3.setFont(new Font("Railway",Font.BOLD,14));
        c3.setBounds(130,560,200,20);
        add(c3);

        c4 = new JCheckBox("Email Alerts");
        c4.setBackground(new Color(215,252,252));
        c4.setFont(new Font("Railway",Font.BOLD,14));
        c4.setBounds(410,560,200,20);
        add(c4);

        c5 = new JCheckBox("Cheque Book");
        c5.setBackground(new Color(215,252,252));
        c5.setFont(new Font("Railway",Font.BOLD,14));
        c5.setBounds(130,600,200,20);
        add(c5);

        c6 = new JCheckBox("E-Statement");
        c6.setBackground(new Color(215,252,252));
        c6.setFont(new Font("Railway",Font.BOLD,14));
        c6.setBounds(410,600,200,20);
        add(c6);


        JCheckBox c7 = new JCheckBox(" I here by declares that the above details entered is correct that to the best of my knowledge.");
        c7.setBackground(new Color(215,252,252));
        c7.setFont(new Font("Arial",Font.BOLD,13));
        c7.setBounds(91,680,650,20);
        add(c7);


        JLabel l12 = new JLabel("Form No :");
        l12.setFont(new Font("Arial",Font.BOLD,20));
        l12.setBounds(610,10,100,25);
        add(l12);

        JLabel l13 = new JLabel(formno);
        l13.setFont(new Font("Arial",Font.BOLD,19));
        l13.setBounds(718,8,60,30);
        add(l13);


        s = new JButton("Submit");
        s.setFont(new Font("Arial",Font.BOLD,16));
        s.setBackground(Color.BLACK);
        s.setForeground(Color.WHITE);
        s.setBounds(230,730,100,30);
        s.addActionListener(this);
        add(s);

        c = new JButton("Cancel");
        c.setFont(new Font("Arial",Font.BOLD,16));
        c.setBackground(Color.BLACK);
        c.setForeground(Color.WHITE);
        c.setBounds(450,730,100,30);
        c.addActionListener(this);
        add(c);




        setLayout(null);
        setSize(830,840);
        setLocation(400,20);
        getContentPane().setBackground(new Color(215,252,252));
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String atype = null;
        if (s1.isSelected()){
            atype = "Saving Account";
        } else if (fd1.isSelected()) {
            atype = "Fixed Deposit Account";
        } else if (ca1.isSelected()) {
            atype = "Current Account";
        } else if (rd1.isSelected()){
            atype = "Recurring Deposit Account";
        }

        Random ran = new Random();
        long first7 = (ran.nextLong() % 90000000L) + 1409963000000000L;
        String cardno = "" + Math.abs(first7);

        long first3 = (ran.nextLong()% 9000L) + 1000L;
        String pin = "" + Math.abs(first3);


        String fac = "";
        if(c1.isSelected()){
            fac = "ATM CARD";
        } else if (c2.isSelected()) {
            fac = "Internet Banking";
            
        } else if (c3.isSelected()) {
            fac = "Mobile Banking";
        } else if (c4.isSelected()){
            fac = "Email Alerts";

        } else if (c5.isSelected()) {
            fac = "Cheque Book";
        } else if (c6.isSelected()) {
            fac = "E-Statement";
        }

        try{
            if (e.getSource() ==s){
                if(atype.equals("")){
                    JOptionPane.showMessageDialog(null,"Fill all the fields");
                } else{
                    Conn c1 = new Conn();
                    String q1 = "insert into signupthree values('"+formno+"','"+atype+"','"+cardno+"','"+pin+"','"+fac+"')";
                    String q2 = "insert into login values('"+formno+"','"+cardno+"','"+pin+"')";
                    c1.statement.executeUpdate(q1);
                    c1.statement.executeUpdate(q2);
                    JOptionPane.showMessageDialog(null,"Card Number : "+cardno+"\n Pin : "+pin);
                    new Deposit(pin);
                    setVisible(false);
                }
            } else if (e.getSource()==c) {
                System.exit(0);
            }

        } catch (Exception E) {
            E.printStackTrace();
        }



    }

    public static void main(String[] args) {
        new Signup3(" ");
    }
}
