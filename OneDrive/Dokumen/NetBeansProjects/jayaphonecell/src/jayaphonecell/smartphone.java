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
public class smartphone extends Toko{
    
    int jmlkamera;
    
    public void setMerk(String Merk){
        super.Merk=Merk;
    }
    public String getMerk(){
        return Merk;
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
    public void setjmlkamera(int kamera){
        this.jmlkamera=kamera;
    }
    public int getKamera(){
        return jmlkamera;
    }
    @Override
    public void display(){
        System.out.println("smartphone terbaik: ");
    }

    public void setadmin(String admin){
        this.admin=admin;
    }
    public String getAdmin(){
        return admin;
    }
    
}

    

