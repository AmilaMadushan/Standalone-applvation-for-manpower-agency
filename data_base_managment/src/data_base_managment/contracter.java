/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data_base_managment;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Tharindu
 */
public class contracter {
    public static Connection getmainConnection() throws Exception{
    Class.forName("com.mysql.jdbc.Driver");
    Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/final_db","root","123");
    return c;
    
    }
    
}
