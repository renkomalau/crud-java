/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Barang.Entity;

/**
 *
 * @author Renko Malau
 */
public class Entity_Pembelian {
    String Nobeli,idbrg,tanggal;
    int jumlah;
    
    
    public void setnobeli(String Nobeli){
        this.Nobeli=Nobeli;
    } 
    public void setidbrg(String idbrg){
        this.idbrg=idbrg;
    }
    public void setjumlah(int jumlah){
        this.jumlah=jumlah;
    }
    public void settanggal(String tanggal){
        this.tanggal=tanggal;
    }
    
    
    
    public String getNoBeli(){
        return Nobeli;
    }
    public String getidbrg(){
        return idbrg;
    }
    public int getjumlah(){
        return jumlah;
    }
    public String gettanggal(){
        return tanggal;
    }
    
    
    
    
    
}
