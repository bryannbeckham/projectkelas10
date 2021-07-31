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
public class Toko {
    private String admin;
    protected String Merk;
    protected int total;
    public float harga;
    
    public void display(){
        System.out.println("masukan barang: ");
    }
            
    public void setadmin(String admin){
        this.admin=admin;
    }
    
    public String getadmin(){
        return admin;
    }
    
}
