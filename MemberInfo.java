import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class MemberInfo extends JFrame {
    MemberInfo(){
        JTable table = new JTable();

        table.setForeground(Color.white);
        table.setFont(new Font("System",Font.PLAIN,18));
        table.setBackground(new Color(78, 56, 204));
        table.setBounds(5,40,1350,500);
        //table.setForeground(Color.black);
        add(table);
        try {
            Con c = new Con();
            String q ="select * from Addmemberss";
            ResultSet resultSet = c.statement.executeQuery(q);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));

        }catch (Exception E){
            E.printStackTrace();
        }

        JButton back = new JButton("BACK");
        back.setBackground(Color.black);
        back.setForeground(Color.white);
        back.setBounds(400,600,100,40);
        add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource()==back){
                    setVisible(false);
                }
            }
        });

        JButton backm = new JButton("Edit-Data");
        backm.setBackground(new Color(23, 96, 96));
        backm.setForeground(Color.white);
        backm.setBounds(800,600,100,40);
        add(backm);
        backm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new UpdatePanel();
            }
        });

        JLabel Name = new JLabel("Name");
        Name.setBounds(15,10,90,30);
        Name.setForeground(Color.black);
        Name.setFont(new Font("Tahoma",Font.BOLD,15));
        add(Name);
        JLabel Namep = new JLabel("Profile");
        Namep.setBounds(110,10,90,30);
        Namep.setForeground(Color.black);
        Namep.setFont(new Font("Tahoma",Font.BOLD,15));
        add(Namep);
        JLabel Namee = new JLabel("Total-Exp");
        Namee.setBounds(195,10,120,30);
        Namee.setForeground(Color.black);
        Namee.setFont(new Font("Tahoma",Font.BOLD,15));
        add(Namee);
        JLabel Nameec = new JLabel("Crt-CTC");
        Nameec.setBounds(295,10,120,30);
        Nameec.setForeground(Color.black);
        Nameec.setFont(new Font("Tahoma",Font.BOLD,15));
        add(Nameec);
        JLabel Nameece = new JLabel("Expt-CTC");
        Nameece.setBounds(392,10,120,30);
        Nameece.setForeground(Color.black);
        Nameece.setFont(new Font("Tahoma",Font.BOLD,15));
        add(Nameece);
        JLabel Nameecel = new JLabel("C-Location");
        Nameecel.setBounds(492,10,120,30);
        Nameecel.setForeground(Color.black);
        Nameecel.setFont(new Font("Tahoma",Font.BOLD,15));
        add(Nameecel);
        JLabel pLocation = new JLabel("P-Location");
        pLocation .setBounds(592,10,120,30);
        pLocation .setForeground(Color.black);
        pLocation .setFont(new Font("Tahoma",Font.BOLD,15));
        add(pLocation );
        JLabel pLocationa = new JLabel("Any-offer");
        pLocationa .setBounds(692,10,120,30);
        pLocationa .setForeground(Color.black);
        pLocationa .setFont(new Font("Tahoma",Font.BOLD,15));
        add(pLocationa );
        JLabel pLocationaq = new JLabel("Notice-Period");
        pLocationaq .setBounds(770,10,120,30);
        pLocationaq .setForeground(Color.black);
        pLocationaq .setFont(new Font("Tahoma",Font.BOLD,15));
        add(pLocationaq );
        JLabel pLocationaqw = new JLabel("R-F-J-C");
        pLocationaqw .setBounds(885,10,120,30);
        pLocationaqw .setForeground(Color.black);
        pLocationaqw .setFont(new Font("Tahoma",Font.BOLD,15));
        add(pLocationaqw );
        JLabel Locationaqw = new JLabel("DOB");
        Locationaqw .setBounds(985,10,120,30);
        Locationaqw .setForeground(Color.black);
        Locationaqw .setFont(new Font("Tahoma",Font.BOLD,15));
        add(Locationaqw );
        JLabel Locationaqwa = new JLabel("Mobile-No");
        Locationaqwa .setBounds(1065,10,120,30);
        Locationaqwa .setForeground(Color.black);
        Locationaqwa .setFont(new Font("Tahoma",Font.BOLD,15));
        add(Locationaqwa );
        JLabel ocationaqwa = new JLabel("Email");
        ocationaqwa .setBounds(1185,10,120,30);
        ocationaqwa .setForeground(Color.black);
        ocationaqwa .setFont(new Font("Tahoma",Font.BOLD,15));
        add(ocationaqwa );
        JLabel cationaqwa = new JLabel("Date");
        cationaqwa .setBounds(1285,10,120,30);
        cationaqwa .setForeground(Color.black);
        cationaqwa .setFont(new Font("Tahoma",Font.BOLD,15));
        add(cationaqwa );



        setSize(1350,750);
        setUndecorated(true);
        setLocation(5,5);
        getContentPane().setBackground(new Color(153, 153, 255));
        setLayout(null);
        setVisible(true);
    }
    public static void main(String[] args) {
        new MemberInfo();
    }
}
