/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data_base_managment;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author bandara
 */
public class Agendata {
    public static Connection getagenf() throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/agency","root","123");
        return c;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
}
