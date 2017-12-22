/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MonkeyTree;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author michael.craig
 */
public class MonkeyTree {

    public static void main(String[] args) {
        try {
        Class.forName("com.mysql.jdbc.Driver");  

        Connection conn=DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/strathcarron_master","root","");  
        

        } catch (SQLException ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MonkeyTree.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
}
