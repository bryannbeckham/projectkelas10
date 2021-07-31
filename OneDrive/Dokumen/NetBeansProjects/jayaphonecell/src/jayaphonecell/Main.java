/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jayaphonecell;
import java.util.Scanner;
/**
 *
 * @author MOKLET-2
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Toko jaya=new Toko();
        smartphone hp=new smartphone();
        TV tipi=new TV();
        Adaptor charger=new Adaptor();
        Scanner input=new Scanner(System.in);
        
        jaya.display();
        System.out.println("masukan nama admin: ");
        jaya.setadmin(input.next());
        
        System.out.println("MASUKAN MERK SMARTPHONE: ");
        hp.setMerk(input.next());
        
        System.out.print("MASUKAN HARGA SMARTPHONE: ");
        hp.setHarga(input.nextFloat());
        
        System.out.println("MASUKAN TOTAL SMARTPHONE:");
        hp.setTotal(input.nextInt());
        
        System.out.println("MASUKAN JUMLAH KAMERA: ");
        hp.setjmlkamera(input.nextInt());
        
        System.out.println("SMARTPHONE MERK"+hp.getMerk()+"dengan harga" +hp.getHarga() +"berjumlah"+hp.gettotal()+"serta jumlah kamera" +hp.getKamera());
        
        hp.display();
        System.out.println("MASUKAN MERK TV: ");
        tipi.setMerk(input.next());
        
        System.out.println("MASUKAN HARGA TV: ");
        tipi.setHarga(input.nextFloat());
        
        System.out.println("MASUKAN TOTAL TV: ");
        tipi.setTotal(input.nextInt());
        
        System.out.println("MASUKAN TIPE TV: ");
        tipi.setTipel(input.next());
        
        System.out.println("TV MERK"+tipi.getMerk()+"dengan harga"+tipi.getHarga() +"berjumlah" +tipi.gettotal() +"serta tipe TV"+tipi.getTipe());
        
        System.out.println("MASUKAN MERK ADAPTOR: ");
        charger.setMerk(input.next());
        
        System.out.println("MASUKAN HARGA ADAPTOR: ");
        charger.setHarga(input.nextFloat());
        
        System.out.println("MASUKAN TOTAL ADAPTOR: ");
        charger.setTotal(input.nextInt());
        
        System.out.println("MASUKAN JENIS ADAPTOR: ");
        charger.setJenis(input.next());
        
        System.out.println("ADAPTOR MERK"+charger.getMerk()+"dengan harga" +charger.getHarga() +"berjumlah"+charger.gettotal()+"serta jenis adaptor"+charger.getJenis());
       
        
        
        
        
        
    }
    
}
