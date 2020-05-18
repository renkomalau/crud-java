/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Barang.Control;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import Barang.Entity.Entity_Stok;
/**
 *
 * @author Renko Malau
 */
public class Control_Stok {
    Connection koneksi=null;
    Statement stat=null;
    ResultSet result=null;
    String query=null;
    
    public Control_Stok(){
        try {
            koneksi = DriverManager.getConnection("jdbc:mysql://localhost:3306/crud_java_rengko","root","");
            stat = koneksi.createStatement();
            System.out.println("Koneksi Berhasil Ke Database");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Koneksi ke Database Gagal");
        }
    }
    
    public void tbhStok(Entity_Stok stk){
        String query="INSERT INTO t_stok VALUES('"
                +stk.gettanggal()+"','"
                +stk.getidbrg()+ "','"
                +stk.getjml_terbeli()+"','"
                +stk.getjml_terjual()+ "','"
                +stk.getstk_awal()+ "','"
                +stk.getstk_akhir()+ "')";
        try {
            stat.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Data Berhasil Di Simpan ");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Di Simpan");
        }
        
        
    }
    
    
    public void ubahStok(Entity_Stok stk){
        String query="UPDATE t_stok SET tgl_stok='"+stk.gettanggal()+"',stok_awal='"+stk.getstk_awal()+"',jml_terjual='"+stk.getjml_terjual()+"',jml_terbeli='"+stk.getjml_terbeli()+"',stok_akhir='"+stk.getstk_akhir()+"' WHERE id_barang='"+stk.getidbrg()+"'";
        
        try {
            stat.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Data Barang Berhasil Diupdate");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Di Update");
        }
        
        
        
    }
    
    
}
