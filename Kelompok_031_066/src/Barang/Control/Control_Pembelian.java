/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Barang.Control;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import Barang.Entity.Entity_Pembelian;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Renko Malau
 */
public class Control_Pembelian {
    Connection koneksi=null;
    Statement stat=null;
    ResultSet result=null;
    String query=null;
    
    public Control_Pembelian(){
        try {
            koneksi = DriverManager.getConnection("jdbc:mysql://localhost:3306/crud_java_rengko","root","");
            stat = koneksi.createStatement();
            System.out.println("Koneksi Berhasil Ke Database");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Koneksi ke Database Gagal");
        }   
    }
    
    public void tbhpembelian(Entity_Pembelian beli){
        String query = "INSERT INTO t_beli VALUES('"
                +beli.getNoBeli()+"','"
                +beli.getidbrg()+"','"
                +beli.getjumlah()+"','"
                +beli.gettanggal()+"')";
        
        
        try {
            stat.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Data berhasil Di Simpan");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Di Simpan");
        }
    }
    
    
    public void ubhpembelian(Entity_Pembelian beli){
        String query="UPDATE t_beli SET id_barang='"+beli.getidbrg()+"',jml='"+beli.getjumlah()+"',tgl='"+beli.gettanggal()+"' WHERE no_beli='"+beli.getNoBeli()+"'";
        
        try {
            stat.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Data berhasil Di Ubah");
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Data Gagal Di Ubah");
        }
    }
    
    public void hapuspembelian(Entity_Pembelian beli){
        String query="DELETE FROM t_beli WHERE no_beli='"+beli.getNoBeli()+"';";
        
        try {
            stat.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Data Berhasil Di Hapus");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Di Hapus");
        }
        
    }
    
    
    
    
    
}
