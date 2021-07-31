/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamer;

/**
 *
 * @author MOKLET-2
 */
public class Enemy extends GameObject{
    public String getName (){
        return name;
    }
    public void setHP (int HP) {
        super.HP = HP;
    }
    public int getHP (){
       return HP;
    }
    public void setDamage (int Damage) {
        super.Damage = Damage;
    }
    public int getDamage (){
        return Damage;
    }
    @Override
    public void Display() {
        System.out.println("Name= "+ getName());
        System.out.println("Damage= "+ getDamage());
        System.out.println("HP = "+ getHP());
    }
    }