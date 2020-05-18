/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;
import Entity.EntityBarang;
import Entity.EntityStock;
import Entity.EntityBeli;
import Entity.EntityJual;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 
 */
public class ControlBarang {
    public Connection con=null;
    public Statement stat=null;
    public ResultSet res=null;
    
    public ControlBarang(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/crud_java_rengko","root","");
            stat=con.createStatement();
            System.out.println("Koneksi Berhasil");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
   
    public void TambahBarang(EntityBarang barang) {
        String sqlbarang = "INSERT INTO t_barang VALUES('"
                +barang.GetIDbarang()+"','"
                +barang.GetNAMAbarang()+"','"
                +barang.GetMERKbarang()+"')";
        try {
            stat.executeUpdate(sqlbarang);
            JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Disimpan");
        }
    }
    
    public void UbahBarang(EntityBarang barang) {
        try {
            stat.executeUpdate("UPDATE t_barang SET nm_barang='"+barang.GetNAMAbarang()+
                              "',merk_barang='"+barang.GetMERKbarang()+
                              "' WHERE id_barang='"+barang.GetIDbarang()+"'");
            JOptionPane.showMessageDialog(null, "Data Telah Diubah");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Diubah");
        }
    }
    
    public void HapusBarang(EntityBarang barang){
        try {
            stat.executeUpdate("DELETE FROM t_barang WHERE id_barang='"+barang.GetIDbarang()+"';");
            JOptionPane.showMessageDialog(null, "Data Telah Dihapus");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Dihapus");
        }
    }
    
    public void TambahStock(EntityStock stock) {
        String sqlstock = "INSERT INTO t_stok VALUES('"
                +stock.GETTanggalStock()+"','"
                +stock.GetIDbarang()+"','"
                +stock.GETStockAwal()+"','"
                +stock.GETJmlTerjual()+"','"
                +stock.GETJmlTerbeli()+"','"
                +stock.GETStockAkhir()+"')";
        try {
            stat.executeUpdate(sqlstock);
            JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Disimpan");
        }
    }
    
    public void TambahBeli(EntityBeli beli) {
        String sqlbeli = "INSERT INTO t_beli VALUES('"
                +beli.GetNoBeli()+"','"
                +beli.GetIDBarang()+"','"
                +beli.GetJml()+"','"
                +beli.GetTanggal()+"')";
        try {
            stat.executeUpdate(sqlbeli);
            JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Disimpan");
        }
    }
    
    public void UbahBeli(EntityBeli beli) {
        try {
            stat.executeUpdate("UPDATE t_beli SET id_barang='"+beli.GetIDBarang()+
                              "',jml='"+beli.GetJml()+
                              "',tgl='"+beli.GetTanggal()+
                              "' WHERE no_beli='"+beli.GetNoBeli()+"'");
            JOptionPane.showMessageDialog(null, "Data Telah Diubah");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Diubah");
        }
    }
    
    public void HapusBeli(EntityBeli beli){
        try {
            stat.executeUpdate("DELETE FROM t_beli WHERE no_beli='"+beli.GetNoBeli()+"';");
            JOptionPane.showMessageDialog(null, "Data Telah Dihapus");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Dihapus");
        }
    }
    
    public void TambahJual(EntityJual jual) {
        String sqlbeli = "INSERT INTO t_jual VALUES('"
                +jual.GetNoJual()+"','"
                +jual.GetIDBarang()+"','"
                +jual.GetJml()+"','"
                +jual.GetTanggal()+"')";
        try {
            stat.executeUpdate(sqlbeli);
            JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Disimpan");
        }
    }
    
    public void UbahJual(EntityJual jual) {
        try {
            stat.executeUpdate("UPDATE t_jual SET id_barang='"+jual.GetIDBarang()+
                              "',jml='"+jual.GetJml()+
                              "',tgl='"+jual.GetTanggal()+
                              "' WHERE no_jual='"+jual.GetNoJual()+"'");
            JOptionPane.showMessageDialog(null, "Data Telah Diubah");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Diubah");
        }
    }
    
    public void HapusJual(EntityJual jual){
        try {
            stat.executeUpdate("DELETE FROM t_jual WHERE no_jual='"+jual.GetNoJual()+"';");
            JOptionPane.showMessageDialog(null, "Data Telah Dihapus");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Dihapus");
        }
    }
    
    
}
