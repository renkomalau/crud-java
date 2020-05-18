/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Barang.Entity;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Renko Malau
 */
public class koneksi_Database {
    private static Connection conn;
    
    public static Connection getConnection(){
        if (conn==null){
            try {
                String url ="jdbc:mysql://localhost:3306/crud_java_rengko";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                conn = (com.mysql.jdbc.Connection) DriverManager.getConnection(url,"root","");
                System.out.println("KONEKSI SUKSES");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Koneksi Gagal");
            }
            
        }
        return conn;
    }
    
    //testing koenksi
    /*public static void main(String []args){
        getConnection();
    }*/
    
    
}
