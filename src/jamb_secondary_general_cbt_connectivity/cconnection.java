/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jamb_secondary_general_cbt_connectivity;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author LADYT
 */
public class cconnection {
    public Connection connection;
    public Connection getConnection() throws SQLException{
       String url = "jdbc:mysql://127.0.0.1:3306/dcuf_exam_app";
       String userName = "root";
       String password = "";


                     try{
                         
                         
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        connection = DriverManager.getConnection(url, userName, password);
      
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
      return connection;
           
    }
    
}
