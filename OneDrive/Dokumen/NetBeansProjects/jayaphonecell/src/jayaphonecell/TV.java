/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jayaphonecell;

/**
 *
 * @author MOKLET-2
 */
public class TV extends Toko {
    String Tipe;
    
    public void setMerk(String Merk){
        super.Merk=Merk;        
    }
    public String getMerk(){
        return Merk;
    }
    public void setTipel(String Tipe){
        this.Tipe=Tipe;
    }
    public String getTipe(){
        return Tipe;
    }
    public void setTotal(int total){
        super.total=total;
    }
    public int gettotal(){
        return total;
    }
    public void setHarga(float harga){
        super.harga=harga;
    }
    public float getHarga(){
        return harga;
    }
    
}
