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
public class Entity_Penjualan {
    String Nojual,idbrg,tanggal;
    int jumlah;
            
    public void setnojual(String Nojual){
        this.Nojual=Nojual;
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
    
    
    public String getNojual(){
        return Nojual;
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
