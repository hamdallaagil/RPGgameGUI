/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studikasus3;

/**
 *
 * @author ASUS
 */
public abstract class Character implements IInfo {    
    private String name;
    private int hp;
    private int def;
    private Weapon weapon;
    private int level;
    protected int temp;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
    
    public Character(String name) {
        def = 0;
        level = 1;
        this.name = name;
    }
    
    public Character(String name, int level, int hp) {
        this.name = name;
        this.level = level;
        this.hp = hp;
    }
    
    public abstract void attack(Character characer);
                                
    public abstract void defense();
    
     public String info(Character ch){
        return name + " menyerang " + ch.getName() + " dengan Attack sebesar " + temp;
    }
    
}
