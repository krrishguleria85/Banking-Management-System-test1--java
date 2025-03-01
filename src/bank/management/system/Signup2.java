package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Signup2 extends JFrame implements ActionListener {
    JComboBox comboBox, comboBox2, comboBox3, comboBox4, comboBox5;
    JTextField textPan, textAadhar;
    JRadioButton r1,r2,e1,e2;
    JButton next;


    String formno;

    Signup2(String formno){
        super("APPLICATION FORM");


        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(130,20,110,100);
        add(image);

        this.formno = formno;

        JLabel l1 = new JLabel("Page 2: -");
        l1.setFont(new Font("Railway",Font.BOLD,25));
        l1.setBounds(300,40,600,40);
        add(l1);

        JLabel l2 = new JLabel("Additional Details");
        l2.setFont(new Font("Arial",Font.BOLD,25));
        l2.setBounds(300,79,600,40);
        add(l2);


        JLabel l3 = new JLabel("Religion: ");
        l3.setFont(new Font("Arial",Font.BOLD,20));
        l3.setBounds(80,150,600,40);
        add(l3);

        String religion[] = {"Hindu","Muslim","Sikh","Christian","Other"};
        comboBox = new JComboBox(religion);
        comboBox.setBackground(new Color(252,208,76));
        comboBox.setFont(new Font("Railway",Font.BOLD,14));
        comboBox.setBounds(320,153,350,30);
        add(comboBox);


        JLabel l4 = new JLabel("Category: ");
        l4.setFont(new Font("Arial",Font.BOLD,20));
        l4.setBounds(80,200,600,40);
        add(l4);

        String Category [] = {"General","OBC","SC","ST","Other"};
        comboBox2 = new JComboBox(Category);
        comboBox2.setBackground(new Color(252,208,76));
        comboBox2.setFont(new Font("Railway",Font.BOLD,14));
        comboBox2.setBounds(320,203,350,30);
        add(comboBox2);



        JLabel l5 = new JLabel("Income: ");
        l5.setFont(new Font("Arial",Font.BOLD,20));
        l5.setBounds(80,250,600,40);
        add(l5);

        String Income [] = {"Null","<1,50,000", "<2,50,500","5,00,000","Upto 10,00,000","Above 10,00,000"};
        comboBox3 = new JComboBox(Income);
        comboBox3.setBackground(new Color(252,208,76));
        comboBox3.setFont(new Font("Railway",Font.BOLD,14));
        comboBox3.setBounds(320,253,350,30);
        add(comboBox3);



        JLabel l6 = new JLabel("Educational: ");
        l6.setFont(new Font("Arial",Font.BOLD,20));
        l6.setBounds(80,300,600,40);
        add(l6);

        String educational [] = {"Non-Graduate","Graduate","Post-Graduate","X","XII","Others"};
        comboBox4 = new JComboBox(educational);
        comboBox4.setBackground(new Color(252,208,76));
        comboBox4.setFont(new Font("Railway",Font.BOLD,14));
        comboBox4.setBounds(320,303,350,30);
        add(comboBox4);



        JLabel l7 = new JLabel("Occupation: ");
        l7.setFont(new Font("Arial",Font.BOLD,20));
        l7.setBounds(80,350,600,40);
        add(l7);

        String Occupation [] = {"Salaried","Self-Employed","Business","Student","Retired","Others"};
        comboBox5 = new JComboBox(Occupation);
        comboBox5.setBackground(new Color(252,208,76));
        comboBox5.setFont(new Font("Railway",Font.BOLD,14));
        comboBox5.setBounds(320,353,350,30);
        add(comboBox5);


        JLabel l8 = new JLabel("PAN Number:");
        l8.setFont(new Font("Arial",Font.BOLD,20));
        l8.setBounds(80,400,600,40);
        add(l8);

        textPan = new JTextField();
        textPan.setFont(new Font("Railway",Font.BOLD, 14));
        textPan.setBounds(320,403,350,30);
        add(textPan);


        JLabel l9 = new JLabel("Aadhar Number:");
        l9.setFont(new Font("Arial",Font.BOLD,20));
        l9.setBounds(80,450,590,40);
        add(l9);

        textAadhar = new JTextField();
        textAadhar.setFont(new Font("Railway",Font.BOLD, 14));
        textAadhar.setBounds(320,453,350,30);
        add(textAadhar);



        JLabel l10 = new JLabel("Senior Citizen :");
        l10.setFont(new Font("Arial",Font.BOLD,20));
        l10.setBounds(80,500,590,40);
        add(l10);

        r1 = new JRadioButton("Yes");
        r1.setFont(new Font("Railway",Font.BOLD,14));
        r1.setBackground(new Color(252,208,76));
        r1.setBounds(320,501,100,30);
        add(r1);

        r2 = new JRadioButton("No");
        r2.setFont(new Font("Railway",Font.BOLD,14));
        r2.setBackground(new Color(252,208,76));
        r2.setBounds(540,501,100,30);
        add(r2);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);


        JLabel l11 = new JLabel("Existing Account:");
        l11.setFont(new Font("Arial",Font.BOLD,20));
        l11.setBounds(80,550,590,40);
        add(l11);

        e1 = new JRadioButton("Yes");
        e1.setFont(new Font("Railway",Font.BOLD,14));
        e1.setBackground(new Color(252,208,76));
        e1.setBounds(320,551,100,30);
        add(e1);

        e2 = new JRadioButton("No");
        e2.setFont(new Font("Railway",Font.BOLD,14));
        e2.setBackground(new Color(252,208,76));
        e2.setBounds(540,551,100,30);
        add(e2);

        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(e1);
        buttonGroup1.add(e2);



        JLabel l12 = new JLabel("Form No :");
        l12.setFont(new Font("Arial",Font.BOLD,20));
        l12.setBounds(620,10,120,25);
        add(l12);

        JLabel l13 = new JLabel(formno);
        l13.setFont(new Font("Arial",Font.BOLD,19));
        l13.setBounds(718,8,60,30);
        add(l13);


        next = new JButton("Next");
        next.setFont(new Font("Arial",Font.BOLD,16));
        next.setBackground(Color.WHITE);
        next.setForeground(Color.BLACK);
        next.setBounds(570,640,100,30);
        next.addActionListener(this);
        add(next);



        setLayout(null);
        setSize(850,750);
        setLocation(450,80);
        getContentPane().setBackground(new Color(252,208,76));
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String rel = (String) comboBox.getSelectedItem();
        String categ = (String) comboBox2.getSelectedItem();
        String inc = (String) comboBox3.getSelectedItem();
        String edu = (String) comboBox4.getSelectedItem();
        String occ = (String) comboBox5.getSelectedItem();

        String pan = (String) textPan.getText();
        String aadhar= (String) textAadhar.getText();

        String scitizen = " ";
        if ((r1.isSelected())){
            scitizen = "Yes";
        } else if (r2.isSelected()){
            scitizen = "No";
        }

        String eAccount = " ";
        if ((r1.isSelected())){
            eAccount = "Yes";
        } else if (r2.isSelected()){
            eAccount = "No";
        }

        try{
            if (textPan.getText().equals("") || textAadhar.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Fill all the Fields");
            } else{
                Conn c1 = new Conn();
                String q = "insert into signuptwo values('"+formno+"','"+rel+"','"+categ+"','"+inc+"','"+edu+"','"+occ+"','"+pan+"','"+aadhar+"','"+scitizen+"','"+eAccount+"')";
                c1.statement.executeUpdate(q);

                new Signup3(formno);
                setVisible(false);
            }

        } catch (Exception E) {
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Signup2("");
    }
}
