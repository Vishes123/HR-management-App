import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Con {
    String url= "jdbc:mysql://localhost:3306/Addmember"; 
    String user= "root";
    String pass= "Vishesh@123";
    static Connection connection;
    static Statement statement;
    public Con(){
        try{
            connection= DriverManager.getConnection(url,user,pass);
            statement=connection.createStatement();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
