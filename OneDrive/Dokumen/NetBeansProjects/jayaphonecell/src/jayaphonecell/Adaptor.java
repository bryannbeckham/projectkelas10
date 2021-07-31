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
public class Adaptor extends Toko{
    String jenis;
    public void setJenis(String jenis){
        this.jenis=jenis;
    }
    public String getJenis (){
        return jenis;
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
     public void setMerk(String Merk){
        super.Merk=Merk;        
    }
    public String getMerk(){
        return Merk;
    }
}
