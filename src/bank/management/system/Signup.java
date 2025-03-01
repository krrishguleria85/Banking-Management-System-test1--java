package bank.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup extends JFrame implements ActionListener {
    JButton next;
    JRadioButton r1,r2, ms1,ms2;
    JTextField textName, textName2, textEmail, textaddr, textcity, textpin, textst; //name
    JDateChooser dateChooser;


    Random ran = new Random();
    long first4 = (ran.nextLong() % 9000L) + 1000L;

    String first = " "+Math.abs(first4);

    Signup(){
        super("APPLICATION FORM");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25,10,100,100);
        add(image);


        JLabel label1 = new JLabel("APPLICATION FORM NO.:"+ first);
        label1.setFont(new Font("Arial",Font.BOLD,38));
        label1.setBounds(165,40,600,40);
        add(label1);


        JLabel label2 = new JLabel("Page 1 ");
        label2.setFont(new Font("Railway", Font.BOLD,21));
        label2.setBounds(375,95,580,30);
        add(label2);


        JLabel label3 = new JLabel("Personal Details.");
        label3.setFont(new Font("Arial",Font.BOLD,21));
        label3.setBounds(330,125,600,35);
        add(label3);



        JLabel labelName = new JLabel("Name:");
        labelName.setFont(new Font("Arial",Font.BOLD,21));
        labelName.setBounds(60,200,100,40);
        add(labelName);

        textName = new JTextField();
        textName.setFont(new Font("Railway",Font.BOLD,14));
        textName.setBounds(260,203,450,30);
        add(textName);



        JLabel labelName2 = new JLabel("Father's Name:");
        labelName2.setFont(new Font("Arial",Font.BOLD,21));
        labelName2.setBounds(60,250,200,40);
        add(labelName2);

        textName2 = new JTextField();
        textName2.setFont(new Font("Railway",Font.BOLD,14));
        textName2.setBounds(260,253,450,30);
        add(textName2);



        JLabel labelGender = new JLabel("Gender");
        labelGender.setFont(new Font("Arial",Font.BOLD,21));
        labelGender.setBounds(60,300,200,40);
        add(labelGender);

        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Arial",Font.BOLD,14));
        r1.setBackground(new Color(222,255,228));
        r1.setBounds(258,300,60,30);
        add(r1);

        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Arial",Font.BOLD,14));
        r2.setBackground(new Color(222,255,228));
        r2.setBounds(420,300,90,30);
        add(r2);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);



        JLabel DOB = new JLabel("Date of Birth");
        DOB.setFont(new Font("Arial",Font.BOLD,21));
        DOB.setBounds(60,350,200,40);
        add(DOB);

        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setBounds(260,353,450,30);
        add(dateChooser);



        JLabel labelMS = new JLabel("Marital Status :");
        labelMS.setFont(new Font("Arial",Font.BOLD,21));
        labelMS.setBounds(60,400,200,40);
        add(labelMS);

        ms1 = new JRadioButton("Married");
        ms1.setFont(new Font("Arial",Font.BOLD,14));
        ms1.setBackground(new Color(222,255,228));
        ms1.setBounds(258,400,80,40);
        add(ms1);

        ms2 = new JRadioButton("Unmarried");
        ms2.setFont(new Font("Arial",Font.BOLD,14));
        ms2.setBackground(new Color(222,255,228));
        ms2.setBounds(420,400,100,40);
        add(ms2);

        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(ms1);
        buttonGroup1.add(ms2);


        JLabel labelEmail = new JLabel("Email Address :");
        labelEmail.setFont(new Font("Arial",Font.BOLD,21));
        labelEmail.setBounds(60,450,200,40);
        add(labelEmail);

        textEmail = new JTextField();
        textEmail.setFont(new Font("Railway",Font.BOLD,14));
        textEmail.setBounds(260,453,450,30);
        add(textEmail);



        JLabel labeladdress = new JLabel("Address:");
        labeladdress.setFont(new Font("Arial",Font.BOLD,21));
        labeladdress.setBounds(60,500,200,40);
        add(labeladdress);

        textaddr = new JTextField();
        textaddr.setFont(new Font("Railway",Font.BOLD, 14));
        textaddr.setBounds(260,503,450,30);
        add(textaddr);



        JLabel labelcity = new JLabel("City:");
        labelcity.setFont(new Font("Arial",Font.BOLD,21));
        labelcity.setBounds(60,550,200,40);
        add(labelcity);

        textcity = new JTextField();
        textcity.setFont(new Font("Railway",Font.BOLD, 14));
        textcity.setBounds(260,553,450,30);
        add(textcity);


        JLabel labelpin = new JLabel("PIN:");
        labelpin.setFont(new Font("Arial",Font.BOLD,21));
        labelpin.setBounds(60,600,200,40);
        add(labelpin);

        textpin = new JTextField();
        textpin.setFont(new Font("Railway",Font.BOLD, 14));
        textpin.setBounds(260,603,450,30);
        add(textpin);



        JLabel labelst = new JLabel("State:");
        labelst.setFont(new Font("Arial",Font.BOLD,21));
        labelst.setBounds(60,650,200,40);
        add(labelst);

        textst = new JTextField();
        textst.setFont(new Font("Railway",Font.BOLD, 14));
        textst.setBounds(260,653,450,30);
        add(textst);



        next = new JButton("NEXT");
        next.setFont(new Font("Arial",Font.BOLD,14));
        next.setForeground(Color.WHITE);
        next.setBackground(Color.BLACK);
        next.setBounds(610,705,100,30);
        next.addActionListener(this);
        add(next);



        getContentPane().setBackground(new Color(222,255,228));
        setLayout(null);
        setSize(850,800);
        setLocation(360,40);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String formno = first;
        String name = textName.getText();
        String fname = textName2.getText();

        String gender = null;
        if(r1.isSelected()){
            gender = "Male";
        }else if (r2.isSelected()){
            gender = "Female";
        }

        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();

        String maritials = null;
        if(ms1.isSelected()){
            maritials = "Married";
        } else if (ms2.isSelected()) {
            maritials = "Unmarried";

        }
        String email = textEmail.getText();
        String address = textaddr.getText();
        String city = textcity.getText();
        String PIN = textpin.getText();
        String state = textst.getText();

        try {
            if (textName.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Fill all the Fields");
            } else {
                Conn conn1 = new Conn();
                String q = "insert into signup values('"+formno+"', '"+name+"', '"+fname+"', '"+gender+"', '"+dob+"', '"+maritials+"', '"+email+"', '"+address+"', '"+city+"', '"+PIN+"', '"+state+"')";
                conn1.statement.executeUpdate(q);
                new Signup2(formno);
                setVisible(false);
            }

        } catch (Exception E) {
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Signup();
    }
}

