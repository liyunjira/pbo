/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menusalon;

/**
 *
 * @author ASUS
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class db_salon {
    private static Connection conn;
    public static Statement stm;
        public static Connection getKoneksi(){
            String host = "jdbc:mysql://localhost/db_salon";
            String user = "root";
            String pass = "";
            try{
                conn = (Connection)DriverManager.getConnection(host, user, pass);
                stm = conn.createStatement();
                System.out.println("koneksi ok");
            }catch (SQLException err){
                JOptionPane.showMessageDialog(null, err.getMessage());
            }
            return conn;
        }
    public static void main(String[] args) {
        getKoneksi();
    }
}
