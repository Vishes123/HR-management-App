import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class DeskClass extends JFrame {
    DeskClass(){
        JPanel panel = new JPanel();
        panel.setBounds(280,5,1238,820);
        panel.setBackground(new Color(78, 56, 204));
        panel.setLayout(null);
        add(panel);

        JPanel panel1 = new JPanel();
        panel1.setBackground(new Color(78, 56, 204));
        //panel1.setBounds(3,4,1500,700);
        panel1.setBounds(5,5,270,820);
        panel1.setLayout(null);
        add(panel1);

        ImageIcon img1 = new ImageIcon(ClassLoader.getSystemResource("icon/Beige Border High School Diploma Certificate.gif"));
        Image i = img1.getImage().getScaledInstance(1100,600 , Image.SCALE_DEFAULT) ;
        ImageIcon  imageIcon = new ImageIcon(i);
        JLabel label = new JLabel(imageIcon);
        label.setBounds(-10,50,1100,600);
        panel.add(label);

        ImageIcon img2 = new ImageIcon(ClassLoader.getSystemResource("icon/Untitled design (1).png"));
        Image i2 = img2.getImage().getScaledInstance(55,50 , Image.SCALE_DEFAULT) ;
        ImageIcon  imageIcon2 = new ImageIcon(i2);
        JLabel label2 = new JLabel(imageIcon2);
        label2.setBounds(10,5,55,50);
        panel.add(label2);

        ImageIcon img3 = new ImageIcon(ClassLoader.getSystemResource("icon/downloadok.gif"));
        Image i3 = img3.getImage().getScaledInstance(180,180 , Image.SCALE_DEFAULT) ;
        ImageIcon  imageIcon3 = new ImageIcon(i3);
        JLabel label3 = new JLabel(imageIcon3);
        label3.setBounds(25,400,180,180);
        panel1.add(label3);



       // JLabel h = new JLabel("HR-Mrs-Smrity-Srivastav");
        JLabel h = new JLabel("HR-Mrs-Smrity-Srivastav");
        h.setFont(new Font("Tahoma",Font.BOLD,25));
        h.setForeground(Color.white);
        h.setBounds(375,5,450,50);
        panel.add(h);



        JLabel h1 = new JLabel("* * * * TaskBar * * * *");
        h1.setFont(new Font("Tahoma",Font.BOLD,20));
        h1.setForeground(Color.white);
        h1.setBounds(10,0,300,50);
        panel1.add(h1);

        JButton submit = new JButton("ADD-MEMBER");
        submit.setFont(new Font("System",Font.BOLD,12));
        submit.setForeground(Color.white);
        submit.setBackground(Color.black);
        submit.setBounds(40,60,170,40);
        panel1.add(submit);
        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (e.getSource()==submit){
                        new AddMamber();
                    }
                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });


        JButton Cheack = new JButton("MEMBER-INFO");
        Cheack.setFont(new Font("System",Font.BOLD,12));
        Cheack.setForeground(Color.white);
        Cheack.setBackground(Color.black);
        Cheack.setBounds(40,120,170,40);
        panel1.add(Cheack);
        Cheack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (e.getSource()==Cheack){
                        new MemberInfo();
                    }
                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });

        JButton update = new JButton("UPDATE-MEMBER");
        update.setFont(new Font("System",Font.BOLD,12));
        update.setForeground(Color.white);
        update.setBackground(Color.black);
        update.setBounds(40,180,170,40);
        panel1.add( update);
        update.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource()==update){
                    new UpdatePanel();
                }
            }
        });

        JButton call = new JButton("ADD-CALLING-DETAILS");
        call.setFont(new Font("System",Font.BOLD,12));
        call.setForeground(Color.white);
        call.setBackground(Color.black);
        call.setBounds(40,240,170,40);
        panel1.add( call);
        call.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource()==call){
                      new callDetails();
                }
            }
        });

        JButton Callinfo = new JButton("CHECK-CALL-DETAILS");
        Callinfo.setFont(new Font("System",Font.BOLD,12));
        Callinfo.setForeground(Color.white);
        Callinfo.setBackground(Color.black);
        Callinfo.setBounds(40,300,170,40);
        panel1.add(Callinfo);
       Callinfo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               /* if (e.getSource()==update){
                    //  new Update();
                }*/
            }
        });

        JButton back = new JButton("Exit");
        back.setFont(new Font("System",Font.BOLD,12));
        back.setForeground(Color.white);
        back.setBackground(Color.black);
        back.setBounds(70,600,100,40);
        panel1.add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource()==back){
                    System.exit(85);
                }
            }
        });

        JButton rg = new JButton("Register");
        rg.setFont(new Font("System",Font.BOLD,12));
        rg.setForeground(Color.white);
        rg.setBackground(new Color(20, 52, 121));
       rg.setBounds(920,10,110,30);
        panel.add(rg);
        rg.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource()==rg){
                    new Ragisster();
                }
            }
        });

        Date date1 = new Date();
        JLabel date = new JLabel("" + date1);
        date.setForeground(Color.white);
        date.setBounds(70,5,350,50);
        date.setFont(new Font("Tahoma",Font.BOLD,17));
        //date.setForeground(Color.white);
        panel.add(date);





        setSize(1800,700);
        setUndecorated(false);
        setLocation(0,0);
        setLayout(null);
        setVisible(true);

    }

    public static void main(String[] args) {
         new DeskClass();
    }
}
