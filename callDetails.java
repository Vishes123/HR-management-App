import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class callDetails  extends JFrame {
    callDetails(){
        JPanel p1 = new JPanel();
        p1.setBounds(5,5,550,900);
        p1.setBackground(new Color(39, 24, 149));
        p1.setLayout(null);
        add(p1);

        JPanel p2 = new JPanel();
        p2.setBounds(5,5,900,900);
        p2.setLocation(560,5);
        p2.setBackground(new Color(78, 56, 204));
        p2.setLayout(null);
        add(p2);
        JTable table = new JTable();
        table.setFont(new Font("System",Font.BOLD,15));
        table.setForeground(new Color(0, 0, 0));
        table.setBackground(new Color(108, 122, 228, 255));
        table.setBounds(5,60,900,900);
        //table.setForeground(Color.black);
        p2.add(table);
        try {
            Con c = new Con();
            String q ="select * from calling";
            ResultSet resultSet = c.statement.executeQuery(q);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));

        }catch (Exception E){
            E.printStackTrace();
        }



        JLabel h = new JLabel("** Add/Check/Update Calling Details **");
        h.setBounds(40,5,500,30);
        h.setFont(new Font("System",Font.BOLD,30));
        h.setForeground(new Color(196, 206, 242, 255));
        h.setFont(new Font("Tahoma",Font.BOLD,23));
        p1.add(h);

        JLabel h1 = new JLabel("** All Calling Details in Table **");
        h1.setBounds(190,5,430,30);
        h1.setFont(new Font("System",Font.BOLD,30));
        h1.setForeground(new Color(187, 198, 242, 255));
        h1.setFont(new Font("Tahoma",Font.BOLD,23));
        p2.add(h1);

        JLabel id = new JLabel("Profile Name");
        id.setBounds(90,80,170,30);
        id.setForeground(Color.black);
        id.setFont(new Font("Tahoma",Font.BOLD,23));
        p1.add(id);

        Choice cs = new Choice();
        cs.setBounds(260,80,180,30);
        cs.setForeground(Color.black);
        cs.setFont(new Font("Tahoma",Font.BOLD,23));
        p1.add(cs);
        try {
            Con c = new Con();
            ResultSet resultSet = c.statement.executeQuery("select * From calling");
            while (resultSet.next()){
                cs.add(resultSet.getString("Profile"));
            }

        }catch (Exception e ){
            e.printStackTrace();
        }

        JLabel Name = new JLabel("Name");
        Name.setBounds(90,160,90,30);
        Name.setForeground(Color.black);
        Name.setFont(new Font("Tahoma",Font.BOLD,23));
        p1.add(Name);
        JTextField N = new JTextField();
        N.setBounds(260,160,180,30);
        N.setForeground(Color.black);
        N.setFont(new Font("Tahoma",Font.BOLD,23));
        p1.add(N);

        JLabel sub = new JLabel("Profile");
        sub.setBounds(90,240,90,30);
        sub.setForeground(Color.black);
        sub.setFont(new Font("Tahoma",Font.BOLD,23));
        p1.add(sub);
        JTextField sub1 = new JTextField();
        sub1.setBounds(260,240,180,30);
        sub1.setForeground(Color.black);
        sub1.setFont(new Font("Tahoma",Font.BOLD,23));
        p1.add(sub1);

        JLabel m = new JLabel("Contact No");
        m.setBounds(90,320,130,30);
        m.setForeground(Color.black);
        m.setFont(new Font("Tahoma",Font.BOLD,23));
        p1.add(m);
        JTextField mob = new JTextField();
        mob.setBounds(260,320,180,30);
        mob.setForeground(Color.black);
        mob.setFont(new Font("Tahoma",Font.BOLD,23));
        p1.add(mob);

        JLabel m2 = new JLabel("Email");
        m2.setBounds(90,400,120,30);
        m2.setForeground(Color.black);
        m2.setFont(new Font("Tahoma",Font.BOLD,23));
        p1.add(m2);
        JTextField mob2 = new JTextField();
        mob2.setBounds(260,400,180,30);
        mob2.setForeground(Color.black);
        mob2.setFont(new Font("Tahoma",Font.BOLD,23));
        p1.add(mob2);

        JButton sll = new JButton("Add");
        sll.setBounds(100,520,110,40);
        sll.setBackground(new Color(23, 217, 23, 255));
        sll.setForeground(Color.white);
        p1.add(sll);
        sll.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource()==sll){
                    String Name = N.getText();
                    String Profile =sub1.getText();
                    String CountactNo=mob.getText();
                    String Email =mob2.getText();
                    try{
                        Con c = new Con();
                        String q ="insert into calling values( '"+Name+"' , '"+Profile+"' , '"+CountactNo+"' , '"+Email+"') ";
                        c.statement.executeUpdate(q);
                        JOptionPane.showMessageDialog(null,"Data Successfully Add");
                        setVisible(false);
                    }catch (Exception e1 ){
                        e1.printStackTrace();
                    }
                }
            }
        });

        JButton sl = new JButton("Check");
        sl.setBounds(450,80,80,30);
        sl.setBackground(new Color(23, 217, 23, 255));
        sl.setForeground(Color.white);
        p1.add(sl);
        sl.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource()==sl){
                    String Profile = cs.getSelectedItem();
                    String q = "select * From calling where Profile = '"+Profile+"'";

                    try {
                        Con c = new Con();
                        ResultSet resultSet = c.statement.executeQuery(q);
                        while (resultSet.next()){
                            N.setText(resultSet.getString("Name"));
                            sub1.setText(resultSet.getString("Profile"));
                            mob.setText(resultSet.getString("ContactNo"));
                            mob2.setText(resultSet.getString("Email"));
                        }

                    }catch (Exception E){
                        E.printStackTrace();
                    }
                }
            }
        });

        JButton sl1 = new JButton("Update");
        sl1.setBounds(260,520,110,40);
        sl1.setBackground(new Color(0, 150, 165, 255));
        sl1.setForeground(Color.white);
        p1.add(sl1);
        sl1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource()==sl1){
                    if (mob2.getText().equals("")){
                        JOptionPane.showMessageDialog(null,"Fill the all Boxes");
                    }else {
                        try {
                            String Name = N.getText();
                            String Profile = sub1.getText();
                            String ContactNo = mob.getText();
                            String Email = mob2.getText();
                            Con c = new Con();
                            c.statement.executeUpdate("Update  calling set Name = '"+Name+"' , Profile='"+Profile+"' ,ContactNo = '"+ContactNo+"',Email= '"+Email+"' where Profile = '"+Profile+"'");
                            JOptionPane.showMessageDialog(null , "Update Successfully");
                            //new Bill_Resipt();
                            // setVisible(false);
                        }catch (Exception E){
                            E.printStackTrace();
                        }
                    }
                }
            }
        });

        JButton sl12 = new JButton("Delete");
        sl12.setBounds(410,520,110,40);
        sl12.setBackground(new Color(252, 27, 27, 254));
        sl12.setForeground(Color.white);
        p1.add(sl12);
        sl12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource()==sl12){
                    if (mob2.getText().equals("")){
                        JOptionPane.showMessageDialog(null,"Fill the Box First");
                    }else {
                        try {
                            Con c = new Con();
                            c.statement.executeUpdate("delete  from calling where Profile = '"+cs.getSelectedItem()+"' ");
                            JOptionPane.showMessageDialog(null, "Remove Successfully");
                            setVisible(false);

                        }catch (Exception E){
                            E.printStackTrace();
                        }
                    }
                }
            }
        });

        JButton sl122 = new JButton("Back");
        sl122.setBounds(240,600,160,40);
        sl122.setBackground(new Color(15, 29, 31, 255));
        sl122.setForeground(Color.white);
        p1.add(sl122);
        sl122.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource()==sl122){
                    setVisible(false);
                }
            }
        });







        getContentPane().setBackground(Color.white);
        setLayout(null);
        setSize(1500,900);
        setUndecorated(true);
        setLocation(0,0);
        setVisible(true);

    }
    public static void main(String[] args) {
        new callDetails();
    }
}
