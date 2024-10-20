import javax.swing.*;
import java.awt.*;

public class Splesh extends JFrame {
    Splesh(){
        ImageIcon img2 = new ImageIcon(ClassLoader.getSystemResource("icon/giphy (1).gif"));
        Image i2 = img2.getImage().getScaledInstance(800,500 , Image.SCALE_DEFAULT) ;
        ImageIcon  imageIcon2 = new ImageIcon(i2);
        JLabel label2 = new JLabel(imageIcon2);
        label2.setBounds(0,0,800,500);
       // JLabel label2 =new JLabel(img2);
        //label.setBounds(0,0,1208,750);
        add(label2);


        setLayout(null);
        setLocation(300,120);
        setSize(800,500);
        setUndecorated(true);
        setVisible(true);
        try{
            Thread.sleep(5000);
            new Loging();
            setVisible(false);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new Splesh();
    }
}
