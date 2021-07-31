/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamer;
import java.util.Scanner;
/**
 *
 * @author MOKLET-2
 */
public class Play {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        GameObject run = new GameObject();
        Hero fighter = new Hero();
        Enemy minion = new Enemy ();   
        
        run.Display();
        System.out.println("masukan nama hero: ");
        fighter.setname(input.next());
        
        System.out.println("masukan ID: ");
        fighter.setID(input.nextInt ());
        
        System.out.println("masukan damage hero : ");
        fighter.setDamage(input.nextInt());
        
        System.out.println("masukan HP: ");
        fighter.setHP (input.nextInt());
        
        System.out.println("<<<<<>>>>>>");
        
        System.out.println("masukan nama enemy: ");
        minion.setname (input.next());
        
        System.out.println("masukan HP enemy: ");
        minion.setHP (input.nextInt());
        
        System.out.println("Masukan damage enemy: ");
        minion.setDamage (input.nextInt());
                
        if (fighter.getHP() > minion.getHP()) {
            System.out.println(fighter.getName(); "winner from " + minion.getName());
        }  
    }
    
}
