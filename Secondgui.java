package SE360;



import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.util.ArrayList;


public class Secondgui implements ActionListener  {

    JFrame frame = new JFrame();
    static ArrayList <ImageIcon> arrayList = new ArrayList<>();

    static int cost = 0;
    static String money = "";
    JButton button = new JButton("Payment");

    JButton box = new JButton("150");
    JButton box2 = new JButton("250");
    JButton box3 = new JButton("350");
    JButton box4 = new JButton("150");
    JButton box5 = new JButton("250");
    JButton box6 = new JButton("350");
    JButton box7 = new JButton("150");
    JButton box8 = new JButton("250");
    JButton box9 = new JButton("350");
    JLabel costwriting = new JLabel("TOTAL COST: "+cost);
    JLabel amountmoney = new JLabel("AMOUNT OF MONEY "+money);

    ImageIcon buttonicon = new ImageIcon("C:\\Users\\Ege\\IdeaProjects\\untitled1\\src\\SE360\\Images\\indir.png");
    ImageIcon icon = new ImageIcon("C:\\Users\\Ege\\IdeaProjects\\untitled1\\src\\SE360\\Images\\shoes.jpg");
    ImageIcon icon2 = new ImageIcon("C:\\Users\\Ege\\IdeaProjects\\untitled1\\src\\SE360\\Images\\shoes2.jpg");
    ImageIcon icon3 = new ImageIcon("C:\\Users\\Ege\\IdeaProjects\\untitled1\\src\\SE360\\Images\\shoes3.jpg");

    ImageIcon icon4 = new ImageIcon("C:\\Users\\Ege\\IdeaProjects\\untitled1\\src\\SE360\\Images\\pants.png");
    ImageIcon icon5 = new ImageIcon("C:\\Users\\Ege\\IdeaProjects\\untitled1\\src\\SE360\\Images\\pants2.png");
    ImageIcon icon6 = new ImageIcon("C:\\Users\\Ege\\IdeaProjects\\untitled1\\src\\SE360\\Images\\3.jpg");

    ImageIcon icon7 = new ImageIcon("C:\\Users\\Ege\\IdeaProjects\\untitled1\\src\\SE360\\Images\\q.png");
    ImageIcon icon8 = new ImageIcon("C:\\Users\\Ege\\IdeaProjects\\untitled1\\src\\SE360\\Images\\tshirt.jpg");
    ImageIcon icon9 = new ImageIcon("C:\\Users\\Ege\\IdeaProjects\\untitled1\\src\\SE360\\Images\\tshirt2.jpg");


    public Secondgui() {
        frame.setResizable(false);
        box.setBounds(140,190,75,25);
        box2.setBounds(340,190,75,25);
        box3.setBounds(540,190,75,25);

        box4.setBounds(140,380,75,25);
        box5.setBounds(340,380,75,25);
        box6.setBounds(540,380,75,25);

        box7.setBounds(140,570,75,25);
        box8.setBounds(340,570,75,25);
        box9.setBounds(540,570,75,25);




        JLabel label = new JLabel("Virtual Boutique");
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setFont(new Font("MV Boli",Font.PLAIN,30));

        JLabel label1 = new JLabel();
        JLabel label2 = new JLabel();
        JLabel label3 = new JLabel();

        JLabel label4 = new JLabel();
        JLabel label5 = new JLabel();
        JLabel label6 = new JLabel();

        JLabel label7 = new JLabel();
        JLabel label8 = new JLabel();
        JLabel label9 = new JLabel();


        button.setBounds(20,630,90,80);
        button.setBackground(Color.orange);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setIcon(buttonicon);
        button.setBorder(BorderFactory.createEtchedBorder());



        label2.setIcon(icon);
        label3.setIcon(icon2);
        label1.setIcon(icon3);

        label4.setIcon(icon4);
        label5.setIcon(icon5);
        label6.setIcon(icon6);

        label7.setIcon(icon7);
        label8.setIcon(icon8);
        label9.setIcon(icon9);

        JPanel panel = new JPanel();

        panel.setBackground(Color.CYAN);
        panel.setBounds(0,0,750,50);
        panel.add(label);

        JPanel panel2 = new JPanel();
        panel2.setLayout(new FlowLayout(FlowLayout.CENTER,100,10));
        panel2.setBounds(0,50,750,130);

        panel2.add(label1);
        panel2.add(label2);
        panel2.add(label3);
       //**********************************************************************************
        JPanel panel3 = new JPanel();
        panel3.setLayout(new FlowLayout(FlowLayout.CENTER,100,10));
        panel3.setBounds(0,250,750,130);

        panel3.add(label4);
        panel3.add(label5);
        panel3.add(label6);

        JPanel panel4 = new JPanel();
        panel4.setLayout(new FlowLayout(FlowLayout.CENTER,100,10));
        panel4.setBounds(0,430,750,130);

        panel4.add(label7);
        panel4.add(label8);
        panel4.add(label9);


        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(750,750);
        frame.setVisible(true);

        frame.add(panel);
        frame.add(panel2);
        frame.add(panel3);
        frame.add(panel4);

        frame.add(button);
        frame.add(box);
        frame.add(box2);
        frame.add(box3);

        frame.add(box4);
        frame.add(box5);
        frame.add(box6);

        frame.add(box7);
        frame.add(box8);
        frame.add(box9);

        costwriting.setHorizontalTextPosition(JLabel.CENTER);
        costwriting.setFont(new Font("MV Boli",Font.PLAIN,30));
        costwriting.setBounds(120,630,370,80);

        amountmoney.setHorizontalTextPosition(JLabel.CENTER);
        amountmoney.setFont(new Font("MV Boli",Font.BOLD,20));
        amountmoney.setForeground(Color.PINK);
        amountmoney.setBounds(400,630,350,80);

        frame.add(costwriting);
        frame.add(amountmoney);
        button.addActionListener(this);
        box.addActionListener(this);
        box2.addActionListener(this);
        box3.addActionListener(this);
        box4.addActionListener(this);
        box5.addActionListener(this);
        box6.addActionListener(this);
        box7.addActionListener(this);
        box8.addActionListener(this);
        box9.addActionListener(this);
        System.out.println(cost);


    }
   /* public void run(){

            if (box.isSelected())
                System.out.println("AAAAAAAAAAAAAAAAAAAAAAAA");
                 cost += Integer.parseInt(box.getText());
            if (box2.isSelected())
                cost += Integer.parseInt(box2.getText());
            if (box3.isSelected())
                 cost += Integer.parseInt(box3.getText());
            if (box4.isSelected())
                 cost += Integer.parseInt(box4.getText());
            if (box5.isSelected())
                cost += Integer.parseInt(box5.getText());
            if (box6.isSelected())
                cost += Integer.parseInt(box6.getText());
            if (box7.isSelected())
                 cost += Integer.parseInt(box7.getText());
            if (box8.isSelected())
             cost += Integer.parseInt(box8.getText());
            if (box9.isSelected())
                cost += Integer.parseInt(box9.getText());



    }*/
    public void checkmoney(JButton button){
        cost += Integer.parseInt(button.getText());
        if (cost>Integer.parseInt(money)){
            JOptionPane.showMessageDialog(null,"You cant buy more product.");
            button.setBackground(Color.gray);
            button.setEnabled(false);}
        else{

            costwriting.setText("TOTAL COST: "+cost);
            button.setBackground(Color.CYAN);
            button.setEnabled(false);

        }


    }
    public static void main(String[] args) {
        System.out.println(Signup.b);
        Secondgui secondgui = new Secondgui();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==box){
            checkmoney(box);
            arrayList.add(icon);
        }
        if (e.getSource()==box2){
            checkmoney(box2);
            arrayList.add(icon2);
        }
        if (e.getSource()==box3){
            checkmoney(box3);
            arrayList.add(icon3);
        }
        if (e.getSource()==box4){
            checkmoney(box4);
            arrayList.add(icon4);
        }
        if (e.getSource()==box5){
            checkmoney(box5);
            arrayList.add(icon5);
        }

        if ((e.getSource()==box6)){
            checkmoney(box6);
            arrayList.add(icon6);
        }

        if ((e.getSource()==box7)){
            checkmoney(box7);
            arrayList.add(icon7);
        }

        if ((e.getSource()==box8)){
            checkmoney(box8);
            arrayList.add(icon8);
        }

        if ((e.getSource()==box9)){
            checkmoney(box9);
            arrayList.add(icon9);
        }
        else if(e.getSource()==button){
            frame.setVisible(false);
            frame.dispose();
            new Payment();
        }
    }
}
