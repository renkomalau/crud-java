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
public class EntityBarang {
    String IDBarang, NamaBarang, MerkBarang;
    
    public String GetIDbarang(){
        return IDBarang;
    }
    public String GetNAMAbarang(){
        return NamaBarang;
    }
    public String GetMERKbarang(){
        return MerkBarang;
    }
    
    public void setIDbarang(String idbarang){
        this.IDBarang = idbarang;
    }
    public void setNAMAbarang(String nmbarang){
        this.NamaBarang = nmbarang;
    }
    public void setMERKbarang(String merkbarang){
        this.MerkBarang = merkbarang;
    }
}
