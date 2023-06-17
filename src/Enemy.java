/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studikasus3;

/**
 *
 * @author ASUS
 */
public class Enemy extends Character {
    private static int baseAtk;
    
    public static int getBaseAtk() {
        return baseAtk;
    }

    public static void setBaseAtk(int baseAtk) {
        Enemy.baseAtk = baseAtk;
    }

    public Enemy(String name, int level, int hp) {
        super(name, level, hp);               
        this.baseAtk = 11                                                                                                                           ;

    }
    
    public void attack(Character h) {
        int atk = getLevel() * baseAtk + getWeapon().getAtk() - h.getDef() + Weapon.randomAtk(getWeapon());
        
        // jika atk negatif, maka hp lawan tidak bertambah/berkurang
        if (atk < 0)
            atk = 0;
        temp = atk;
        
        // en.hp = en.hp - atk;
        h.setHp(getHp() - atk);
        h.setDef(0);

        System.out.println("ENEMY attack " + getBaseAtk());
    }
    
    @Override
    public void defense(){
        setDef(getDef() + baseAtk * getLevel() / 2);
        System.out.println("ENEMY defense " + getDef());
    }
    
    public void remedy(){
        setHp(getHp() + 100);
        System.out.println("ENEMY hp " + getHp());
    }    
    
    public String info(Character ch){
        return super.getName() + " mengigit " + ch.getName() + " dengan Attack sebesar " + temp;
    }
}

