/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 */
package Entity;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author 
 */
public class EntityJual {
    String NoJual, Jml, IDBarang, Tanggal;
    
    public String GetNoJual(){
        return NoJual;
    }
    public String GetIDBarang(){
        return IDBarang;
    }
    public String GetJml(){
        return Jml;
    }
    public String GetTanggal(){
        return Tanggal;
    }
    
    public void setNoJual(String nojual){
        this.NoJual = nojual;
    }
    public void setIDBarang(String idbarang){
        this.IDBarang = idbarang;
    }
    public void setJml(String jumlah){
        this.Jml = jumlah;
    }
    public void setTanggal(String tanggal){
        this.Tanggal = tanggal;
    }
}
