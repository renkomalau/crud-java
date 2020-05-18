/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Barang.Control;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import Barang.Entity.Entity_brg;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Renko Malau
 */
public class Control_brg {
    Connection koneksi=null;
    Statement stat=null;
    ResultSet result=null;
    String query=null;
    
    public Control_brg(){
        try {
            
            koneksi = DriverManager.getConnection("jdbc:mysql://localhost:3306/crud_java_rengko","root","");
            stat = koneksi.createStatement();
            System.out.println("Koneksi Berhasil Ke Database");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Koneksi ke Database Gagal");
        }
    }
    
    
    public void tambahDataBrg(Entity_brg brg){
        String query = "INSERT INTO t_barang VALUES('"
                +brg.idbrg()+ "','"
                +brg.nmbrg()+ "','"
                +brg.merkbrg()+ "')"; 
        
        try {
            stat.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Data berhasil Di Simpan");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Di Simpan");
        }   
    }
    
    
    public void lihatbarang(){
        String query = "SELECT*FROM t_barang";
        try {
            stat.executeQuery(query);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Database Tidak Ditemukan");
        }
    }
    
    
    public void ubahDataBrg(Entity_brg brg){
        String query="UPDATE t_barang SET nm_barang='"+brg.nmbrg()+"',merk_barang='"+brg.merkbrg()+"' WHERE id_barang='"+brg.idbrg()+"'";
        
        
        try {
            stat.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Data Barang Berhasil Diupdate");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Di Update");
        }
        
    }
    
    public void hapusdataBrg(Entity_brg brg){
        String query="DELETE FROM t_barang WHERE id_barang='"+brg.idbrg()+"';";
        try {
            stat.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Data Berhasil Di Hapus");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data Berhasil Di Hapus");
        }
    }
}
