/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Barang.Control;
import Barang.Entity.Entity_Penjualan;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Renko Malau
 */
public class Control_Penjualan {
    Connection koneksi=null;
    Statement stat=null;
    ResultSet result=null;
    String query=null;
    
    public Control_Penjualan(){
        try {
            koneksi = DriverManager.getConnection("jdbc:mysql://localhost:3306/crud_java_rengko","root","");
            stat = koneksi.createStatement();
            System.out.println("Koneksi Berhasil Ke Database");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Koneksi ke Database Gagal");
        }
    }
    
    
    public void tbhpenjualan(Entity_Penjualan jual){
        String query = "INSERT INTO t_jual VALUES('"
                +jual.getNojual()+"','"
                +jual.getidbrg()+"','"
                +jual.getjumlah()+"','"
                +jual.gettanggal()+"')";
        
        
        try {
            stat.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Data berhasil Di Simpan");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Di Simpan");
        }
    }
    
    
    public void ubahpenjualan(Entity_Penjualan jual){
        String query="UPDATE t_jual SET id_barang='"+jual.getidbrg()+"',jml='"+jual.getjumlah()+"',tgl='"+jual.gettanggal()+"' WHERE no_jual='"+jual.getNojual()+"'";
        
        try {
            stat.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Data berhasil Di Ubah");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Di Ubah");
        }
    }  
       
    
    public void hpspenjualan(Entity_Penjualan jual){
        String query="DELETE FROM t_jual WHERE no_jual='"+jual.getNojual()+"';";
        
        try {
            stat.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Data Berhasil Di Hapus");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Di Hapus");
        }
    
        
        
    }
        
    
    
    
    
    
}
