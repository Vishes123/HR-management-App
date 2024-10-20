import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Loging extends JFrame {
    Loging(){
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setLayout(null);
        panel.setBounds(370,110,500,300);
        // panel.setBackground(new Color(3, 45, 48))
        panel.setBackground(new Color(0,0,0,100));
        add(panel);

        JLabel a = new JLabel("Login From");
        a.setFont(new Font("Tahoma",Font.BOLD,20));
        a.setForeground(Color.white);
        a.setBounds(200,10,130,23);
        panel.add (a);

        JLabel l1 = new JLabel("Username");
        l1.setFont(new Font("Tahoma",Font.BOLD,17));
        l1.setForeground(Color.white);
        l1.setBounds(185,66,90,14);
        panel.add(l1);

        JTextField t1 = new JTextField();
        t1.setFont(new Font("Tahoma",Font.BOLD,17));
        t1.setForeground(Color.white);
        t1.setBackground(new Color(16,108,115));
        t1.setBounds(185,85,160,23);
        panel.add(t1);

        JLabel l2 = new JLabel("Password");
        l2.setFont(new Font("Tahoma",Font.BOLD,17));
        l2.setForeground(Color.white);
        l2.setBounds(185,130,90,13);
        panel.add(l2);



        JPasswordField p =new JPasswordField();
        p.setBackground(new Color(16,108,115));
        p.setBounds(185,150,160,23);
        p.setForeground(Color.white);
        panel.add(p);

        JButton b1 = new JButton("Login");
        b1.setFont(new Font("Tahoma",Font.BOLD,12));
        b1.setBackground(new Color(15, 29, 31));
        b1.setForeground(Color.white);
        b1.setBounds(285,220,70,30);
        panel.add(b1);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (e.getSource() == b1) {

                        Con c = new Con();
                        String user = t1.getText();
                        String pass = p.getText();

                        String q = "select * from  Ragister where UserName = '" + user + "' and  Password = '" + pass + "'  ";
                        // ResultSet resultSet= c.statement.executeQuery(q);
                        ResultSet resultSet = c.statement.executeQuery(q);
                        if (resultSet.next()) {
                            new DeskClass();
                            setVisible(false);

                        } else {
                            JOptionPane.showMessageDialog(null, "Incorrect User name or password");

                        }
                    }

                } catch(Exception E){
                    E.printStackTrace();
                }




            }

        });

        JButton b2 = new JButton("Forget/New Register");
        b2.setFont(new Font("Tahoma",Font.BOLD,12));
        b2.setBackground(new Color(5, 45, 48));
        b2.setForeground(Color.white);
        b2.setBounds(95,220,165,30);
        panel.add(b2);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource()==b2){
                    new Ragisster();
                    setVisible(false);
                }
            }
        });

        ImageIcon img1 = new ImageIcon(ClassLoader.getSystemResource("icon/7df7c475521507.5c4f4a6978056.gif"));
        Image i = img1.getImage().getScaledInstance(1190,650 , Image.SCALE_DEFAULT) ;
        ImageIcon  imageIcon = new ImageIcon(i);
        JLabel label = new JLabel(imageIcon);
        label.setBounds(0,0,1190,650);
        add(label);



        getContentPane().setBackground(new Color(3,45,48));
        //  setSize(400,400);
        setSize(1190,650);
        setLocation(100,40);
        setLayout(null);
        setUndecorated(true);
        setVisible(true);

    }
    public static void main(String[] args) {
new Loging();
    }
}
