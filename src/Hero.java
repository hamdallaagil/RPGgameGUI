/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studikasus3;

/**
 *
 * @author ASUS
 */
public class Hero extends Character{
    private static int baseAtk;
    
    public Hero(String name, int level, int hp) {
        super(name, level, hp);
        this.baseAtk = 15;
    }
    
    public static int getBaseAtk() {
        return baseAtk;
    }

    public static void setBaseAtk(int baseAtk) {
        Hero.baseAtk = baseAtk;
    }
    
    public void attack(Character en) {
        int atk = getLevel() * baseAtk + getWeapon().getAtk() - en.getDef() + Weapon.randomAtk(getWeapon());
        
        // jika atk negatif, maka hp lawan tidak bertambah/berkurang
        if (atk < 0)
            atk = 0;
        temp = atk;
        //en.hp = en.hp - atk;
        
        en.setHp(en.getHp() - atk);
        en.setDef(0);        
        System.out.println("HERO attack " + atk);
    }
    
    @Override
    public void defense(){
        //def = def + (baseAtk * level / 2);
        setDef(getDef() + baseAtk * getLevel() / 2);
        System.out.println("HERO defense " + getDef());
    }
    
    public void heal(){
        //hp = hp + 100;
        setHp(getHp() + 100);
        System.out.println("HERO hp " + getHp());
    }
    
}
