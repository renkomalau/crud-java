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
public class Entity_brg {
    
    String idbrg,nmbrg,merkbrg;
    
    public void setidbrg(String idbrg){
        this.idbrg=idbrg;
    }
    public void setnmbrg(String nmbrg){
        this.nmbrg=nmbrg;
    }
    public void setmerkbrg(String merkbrg){
        this.merkbrg=merkbrg;
    }
    
    public String idbrg(){
       return idbrg;
    }    
    public String nmbrg(){
        return nmbrg;
    }
    public String merkbrg(){
        return merkbrg;
    }
}
