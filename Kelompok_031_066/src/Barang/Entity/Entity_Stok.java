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
public class Entity_Stok {
    
    String idbrg,tgl;
    int stk_awal,jml_terjual,jml_terbeli,stk_akhir;
    
    
    public void setidbrg(String idbrg){
        this.idbrg=idbrg;
    }
    public void setstk_awal(int stk_awal){
        this.stk_awal=stk_awal;
    }
    public void setjml_terjual(int jml_terjual){
        this.jml_terjual=jml_terjual;
    }
    public void setjml_terbeli(int jml_terbeli){
        this.jml_terbeli=jml_terbeli;
    }
    public void setstk_akhir(int stk_akhir){
        this.stk_akhir= stk_akhir;
    }
    public void settgl(String tgl){
        this.tgl=tgl;
    }
    
    
    public String getidbrg(){
        return idbrg;
    }
    public int getstk_awal(){
        return stk_awal;
    }
    public int getjml_terjual(){
        return jml_terjual;
    }
    public int getjml_terbeli(){
        return jml_terbeli;
    }
    public int getstk_akhir(){
        return stk_akhir;
    }
    public String gettanggal(){
     return tgl;
    }
}
