import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class UpdatePanel extends JFrame{
    UpdatePanel(){

        JLabel Name = new JLabel("Name");
        Name.setBounds(90,50,90,30);
        Name.setForeground(Color.black);
        Name.setFont(new Font("Tahoma",Font.BOLD,23));
        add(Name);


        JLabel Name1 = new JLabel("Mobile No");
        Name1.setBounds(90,15,150,30);
        Name1.setForeground(Color.black);
        Name1.setFont(new Font("Tahoma",Font.BOLD,23));
        add(Name1);

        Choice choice = new Choice();
        choice.setBounds(310,17,180,45);
        choice.setForeground(Color.black);
        add(choice);
        try {
            Con cs = new Con();
            ResultSet resultSet = cs.statement.executeQuery("select * from  Addmemberss");
            while (resultSet.next()){
                choice.add(resultSet.getString("mobileno"));
            }

        }catch (Exception E){
            E.printStackTrace();
        }
        JTextField N = new JTextField();
        N.setBounds(310,50,180,30);
        N.setForeground(Color.black);
        N.setFont(new Font("Tahoma",Font.BOLD,23));
        add(N);

        JLabel sub = new JLabel("Profile For");
        sub.setBounds(90,100,150,30);
        sub.setForeground(Color.black);
        sub.setFont(new Font("Tahoma",Font.BOLD,23));
        add(sub);
        JTextField sub1 = new JTextField();
        sub1.setBounds(310,100,180,30);
        sub1.setForeground(Color.black);
        sub1.setFont(new Font("Tahoma",Font.BOLD,23));
        add(sub1);

        JLabel m = new JLabel("Total Experience");
        m.setBounds(90,150,210,30);
        m.setForeground(Color.black);
        m.setFont(new Font("Tahoma",Font.BOLD,23));
        add(m);
        JTextField mob = new JTextField();
        mob.setBounds(310,150,180,30);
        mob.setForeground(Color.black);
        mob.setFont(new Font("Tahoma",Font.BOLD,23));
        add(mob);

        JLabel m2 = new JLabel("Current CTC");
        m2.setBounds(90,200,160,30);
        m2.setForeground(Color.black);
        m2.setFont(new Font("Tahoma",Font.BOLD,23));
        add(m2);
        JTextField mob22 = new JTextField();
        mob22.setBounds(310,200,180,30);
        mob22.setForeground(Color.black);
        mob22.setFont(new Font("Tahoma",Font.BOLD,23));
        add(mob22);

        JLabel m26 = new JLabel("Expected CTC");
        m26.setBounds(90,250,160,30);
        m26.setForeground(Color.black);
        m26.setFont(new Font("Tahoma",Font.BOLD,23));
        add(m26);
        JTextField mob26 = new JTextField();
        mob26.setBounds(310,250,180,30);
        mob26.setForeground(Color.black);
        mob26.setFont(new Font("Tahoma",Font.BOLD,23));
        add(mob26);

        JLabel m25 = new JLabel("Current Location");
        m25.setBounds(90,300,220,30);
        m25.setForeground(Color.black);
        m25.setFont(new Font("Tahoma",Font.BOLD,23));
        add(m25);
        JTextField mob25 = new JTextField();
        mob25.setBounds(310,300,180,30);
        mob25.setForeground(Color.black);
        mob25.setFont(new Font("Tahoma",Font.BOLD,23));
        add(mob25);

        JLabel m24 = new JLabel("Preferred Location");
        m24.setBounds(90,350,220,30);
        m24.setForeground(Color.black);
        m24.setFont(new Font("Tahoma",Font.BOLD,23));
        add(m24);
        JTextField mob24 = new JTextField();
        mob24.setBounds(310,350,180,30);
        mob24.setForeground(Color.black);
        mob24.setFont(new Font("Tahoma",Font.BOLD,23));
        add(mob24);

        JLabel m23 = new JLabel("Any Offer");
        m23.setBounds(90,400,120,30);
        m23.setForeground(Color.black);
        m23.setFont(new Font("Tahoma",Font.BOLD,23));
        add(m23);
        JComboBox mob23 = new JComboBox(new String[]{"Yes" , "No"});
        mob23.setBounds(310,400,180,30);
        mob23.setForeground(Color.black);
        mob23.setFont(new Font("Tahoma",Font.BOLD,23));
        add(mob23);

        JLabel m22 = new JLabel("Notice Period");
        m22.setBounds(520,50,200,30);
        m22.setForeground(Color.black);
        m22.setFont(new Font("Tahoma",Font.BOLD,23));
        add(m22);
        JTextField mob22c = new JTextField();
        mob22c.setBounds(800,50,180,30);
        mob22c.setForeground(Color.black);
        mob22c.setFont(new Font("Tahoma",Font.BOLD,23));
        add(mob22c);

        JLabel m21 = new JLabel("Reason for Jop Change ");
        m21.setBounds(520,100,300,30);
        m21.setForeground(Color.black);
        m21.setFont(new Font("Tahoma",Font.BOLD,23));
        add(m21);
        JTextField mob21 = new JTextField();
        mob21.setBounds(800,100,180,30);
        mob21.setForeground(Color.black);
        mob21.setFont(new Font("Tahoma",Font.BOLD,23));
        add(mob21);

        JLabel l3 = new JLabel("Date of Birth");
        l3.setBounds(520,150,180,30);
        l3.setForeground(Color.black);
        l3.setFont(new Font("Tahoma",Font.BOLD,20));
        add(l3);
        JDateChooser dob = new JDateChooser();
        dob.setForeground(new Color(0,0,0,90));
        dob.setBackground(new Color(0,0,0,90));
        dob.setBounds(800,150,180,30);
        dob.setFont(new Font("Tahoma",Font.BOLD,20));
        add(dob);


        JLabel l34 = new JLabel("Date");
        l34.setBounds(520,200,180,30);
        l34.setForeground(Color.black);
        l34.setFont(new Font("Tahoma",Font.BOLD,20));
        add(l34);
        Date date1 = new Date();
        JLabel date = new JLabel("" + date1);
        date.setForeground(Color.white);
        date.setBounds(800,200,1180,30);
        date.setFont(new Font("Tahoma",Font.BOLD,17));
        //date.setForeground(Color.white);
        add(date);


        JLabel mail = new JLabel("Mobile No");
        mail.setBounds(520,250,120,30);
        mail.setForeground(Color.black);
        mail.setFont(new Font("Tahoma",Font.BOLD,23));
        add(mail);
        JTextField tmail = new JTextField();
        tmail.setBounds(800,250,180,30);
        tmail.setForeground(Color.black);
        tmail.setFont(new Font("Tahoma",Font.BOLD,23));
        add(tmail);

        JLabel mobileNo = new JLabel("Email Id");
        mobileNo.setBounds(520,300,120,30);
        mobileNo.setForeground(Color.black);
        mobileNo.setFont(new Font("Tahoma",Font.BOLD,23));
        add(mobileNo);
        JTextField mob20 = new JTextField();
        mob20.setBounds(800,300,180,30);
        mob20.setForeground(Color.black);
        mob20.setFont(new Font("Tahoma",Font.BOLD,23));
        add(mob20);

        JButton sl1122 = new JButton("Delete");
        sl1122.setBounds(500,500,160,40);
        sl1122.setBackground(new Color(141, 6, 43, 255));
        sl1122.setForeground(Color.white);
        add(sl1122);
        sl1122.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==sl1122){
                    if (N.getText().equals("")){
                        JOptionPane.showMessageDialog(null,"Fill the Box First");
                    }else {
                        try {
                            Con c = new Con();
                            c.statement.executeUpdate("delete  from Addmemberss where mobileno = '"+choice.getSelectedItem()+"' ");
                            JOptionPane.showMessageDialog(null, "Remove Successfully");
                            setVisible(false);

                        }catch (Exception E){
                            E.printStackTrace();
                        }
                    }
                }
            }
        });

        JButton sl122 = new JButton("Update");
        sl122.setBounds(300,500,160,40);
        sl122.setBackground(new Color(12, 48, 224, 255));
        sl122.setForeground(Color.white);
        add(sl122);
        sl122.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource()==sl122) {
                    if (N.getText().equals("")) {
                        JOptionPane.showMessageDialog(null, "Fill the Name First");
                    }else {
                        try {
                            String q = choice.getSelectedItem();
                            Con c = new Con();
                            String Name = N.getText();
                            String profile = sub1.getText();
                            String TotalExperience = mob.getText();
                            String currentctc = mob22.getText();
                            String ECTC = mob26.getText();
                            String cLocation = mob25.getText();
                            String pLocation = mob24.getText();
                            String anyoffer =(String) mob23.getSelectedItem();
                            String Noticep =mob22c.getText();
                            String RFJC = mob21.getText();
                            String DOB =( (JTextField) dob.getDateEditor().getUiComponent()).getText();
                            //String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
                           // String mobileno = tmail.getText();
                            String MoNo =mob20.getText();
                            String Date = date.getText();
                            c.statement.executeUpdate("Update  Addmemberss  set Name = '"+Name+"' , profile  = '"+profile+"' , TotalExperience= '"+TotalExperience+"', currentctc= '"+currentctc+"' ,ECTC='"+ECTC+"',cLocation= '"+cLocation+"' ,pLocation= '"+pLocation+"',  anyoffer='"+anyoffer+"' , Noticep= '"+Noticep+"', RFJC='"+RFJC+"',DOB='"+DOB+"',MoNo= '"+MoNo+"' ,  Date='"+Date+"' where  mobileno= '"+q+"'");
                            JOptionPane.showMessageDialog(null,"Update Successfully");
                            setVisible(false);




                        }catch (Exception E){
                            E.printStackTrace();
                        }
                    }

                    }
                }
        });

        JButton sl1222 = new JButton("Check");
        sl1222.setBounds(520,15,70,30);
        sl1222.setBackground(new Color(255, 167, 45, 255));
        sl1222.setForeground(Color.white);
        add(sl1222);
        sl1222.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource()==sl1222){

                    String MobileNo =choice.getSelectedItem();
                    String q = "select * from Addmemberss where MobileNo = '"+MobileNo+"'";
                    try {
                        Con c = new Con();
                        ResultSet resultSet = c.statement.executeQuery(q);
                        while (resultSet.next()) {
                            //id.setText(resultSet.getString("Id"));
                            N.setText(resultSet.getString("Name"));
                            sub1.setText(resultSet.getString("Profile"));
                            mob.setText(resultSet.getString("TotalExperience"));
                            mob22.setText(resultSet.getString("currentctc"));
                            mob26.setText(resultSet.getString("ECTC"));
                            mob25.setText(resultSet.getString("cLocation"));
                            mob24.setText(resultSet.getString("pLocation"));
                            mob23.setSelectedItem(resultSet.getString("anyoffer"));
                            mob22c.setText(resultSet.getString("Noticep"));
                            mob21.setText(resultSet.getString("RFJC"));
                           // dob.().setDate(resultSet.getDate("DOB"));
                            tmail.setText(resultSet.getString("mobileno"));
                            mob20.setText(resultSet.getString("MoNo"));
                            date.setText(resultSet.getString("Date"));
                        }

                    } catch (Exception E) {
                        E.printStackTrace();
                    }

                    //String Name = N.getText();
                  /*  String profile = sub1.getText();
                    String TotalExperience = mob.getText();
                    String currentctc = mob22.getText();
                    String ECTC = mob26.getText();
                    String cLocation = mob25.getText();
                    String pLocation = mob24.getText();
                    String anyoffer =(String) mob23.getSelectedItem();
                    String Noticep =mob22c.getText();
                    String RFJC = mob21.getText();
                    String DOB =( (JTextField) dob.getDateEditor().getUiComponent()).getText();
                    String mobileno = tmail.getText();
                    String MoNo =mob20.getText();
                    String Date = date.getText();*/


                   /* try{
                        if(N.getText().equals("")){
                            JOptionPane.showMessageDialog(null, "Fill the Name First");
                        } else if (mob20.getText().equals("")) {
                            JOptionPane.showMessageDialog(null,"Fill the Mobile No");

                        } else if (mob22c.getText().equals("")) {
                            JOptionPane.showMessageDialog(null,"Fill the all First");

                        }else {
                            Con c = new Con();
                            String q = "insert into Addmemberss values ('"+Name+"' , '"+profile+"' , '"+TotalExperience+"', '"+currentctc+"' ,'"+ECTC+"', '"+cLocation+"' , '"+pLocation+"','"+anyoffer+"' , '"+Noticep+"','"+RFJC+"','"+DOB+"','"+mobileno+"' , '"+MoNo+"' , '"+Date+"')";
                            c.statement.executeUpdate(q);
                            JOptionPane.showMessageDialog(null , "Add-Member-Successfully");
                            setVisible(false);
                        }

                    }catch (Exception e1){
                        e1.printStackTrace();
                    }*/
                }
            }
        });


        JButton back = new JButton("Exit");
        back.setFont(new Font("System",Font.BOLD,12));
        back.setForeground(Color.white);
        back.setBackground(Color.black);
        back.setBounds(400,550,160,40);
        add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource()==back){
                    //System.exit(85);
                    setVisible(false);
                }
            }
        });



        ImageIcon img3 = new ImageIcon(ClassLoader.getSystemResource("icon/downloadok.gif"));
        Image i3 = img3.getImage().getScaledInstance(180,180 , Image.SCALE_DEFAULT) ;
        ImageIcon  imageIcon3 = new ImageIcon(i3);
        JLabel label3 = new JLabel(imageIcon3);
        label3.setBounds(770,360,180,180);
        add(label3);



        getContentPane().setBackground(new Color(78, 56, 204));
        setLayout(null);
        setSize(1100,600);
        setUndecorated(true);
        setLocation(262,90);
        setVisible(true);

    }
    public static void main(String[] args) {
new UpdatePanel();
    }
}
