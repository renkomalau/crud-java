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
public class EntityStock {
    String TanggalStock, IDBarang, StockAwal, JumlahTerjual, JumlahTerbeli, StockAkhir;
    
    public String GetIDbarang(){
        return IDBarang;
    }
    public String GETTanggalStock(){
        return TanggalStock;
    }
    public String GETStockAwal(){
        return StockAwal;
    }
    public String GETJmlTerjual(){
        return JumlahTerjual;
    }
    public String GETJmlTerbeli(){
        return JumlahTerbeli;
    }
    public String GETStockAkhir(){
        return StockAkhir;
    }
    
    public void setIDbarang(String idbarang){
        this.IDBarang = idbarang;
    }
    public void setTglStock(String TglStock){
        this.TanggalStock = TglStock;
    }
    public void setStockAwal(String StockAwal){
        this.StockAwal = StockAwal;
    }
    public void setJmlTerjual(String JmlTerjual){
        this.JumlahTerjual = JmlTerjual;
    }
    public void setJmlTerbeli(String JmlTerbeli){
        this.JumlahTerbeli = JmlTerbeli;
    }
    public void setStockAkhir(String StockAkhir){
        this.StockAkhir = StockAkhir;
    }
}
