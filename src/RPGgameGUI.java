/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.studikasus3;

import java.awt.Image;
import javax.swing.JOptionPane;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author ASUS
 */
public class RPGgameGUI extends javax.swing.JFrame {

    /**
     * Creates new form RPGgameGUI
     */
    private int pilihan;
    private Character hero;
    private Character hero2;
    private Character enemy;
    private BufferedImage image;


    public RPGgameGUI() {
        initComponents();
        hero = new Hero("Gekko", 1, 100);
        hero2 = new Hero("Reyna", 1, 100);
        enemy = new Enemy("Kingdom", 1, 100);
        Weapon weapon = new Weapon("Slingshot", 5);
        hero.setWeapon(weapon);
        hero2.setWeapon(weapon);
        enemy.setWeapon(weapon);
        lbHpGekko.setText("hp : 100");
        lbHpReyna.setText("hp : 100");
        lbHpKingdom.setText("hp : 100");
        lbAtkGekko.setText("BaseAtk : 15");
        lbAtkReyna.setText("BaseAtk : 15");
        lbAtkKingdom.setText("BaseAtk : 11");
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lbGekko = new javax.swing.JLabel();
        lbReyna = new javax.swing.JLabel();
        lbKingdom = new javax.swing.JLabel();
        lbHpGekko = new javax.swing.JLabel();
        lbHpReyna = new javax.swing.JLabel();
        lbAtkGekko = new javax.swing.JLabel();
        lbAtkReyna = new javax.swing.JLabel();
        lbHpKingdom = new javax.swing.JLabel();
        lbAtkKingdom = new javax.swing.JLabel();
        lbDefGekko = new javax.swing.JLabel();
        lbDefReyna = new javax.swing.JLabel();
        lbDefKingdom = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        bAttack = new javax.swing.JButton();
        rbReyna = new javax.swing.JRadioButton();
        rbKingdom = new javax.swing.JRadioButton();
        lbInfoGekko = new javax.swing.JLabel();
        lbInfoReyna = new javax.swing.JLabel();
        lbInfoKingdom = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("LET'S THE GAME BEGINS!");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 17, -1, -1));

        lbGekko.setText("Gekko");
        getContentPane().add(lbGekko, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 51, -1, -1));

        lbReyna.setText("Reyna");
        getContentPane().add(lbReyna, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, -1, -1));

        lbKingdom.setText("Kingdom");
        getContentPane().add(lbKingdom, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, -1, -1));

        lbHpGekko.setText("hp : ");
        getContentPane().add(lbHpGekko, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 79, -1, -1));

        lbHpReyna.setText("hp :");
        getContentPane().add(lbHpReyna, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, -1, -1));

        lbAtkGekko.setText("atk :");
        getContentPane().add(lbAtkGekko, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 101, -1, -1));

        lbAtkReyna.setText("atk :");
        getContentPane().add(lbAtkReyna, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, -1, -1));

        lbHpKingdom.setText("hp :");
        getContentPane().add(lbHpKingdom, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, -1, -1));

        lbAtkKingdom.setText("atk :");
        getContentPane().add(lbAtkKingdom, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, -1, -1));

        lbDefGekko.setText("def :");
        getContentPane().add(lbDefGekko, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 123, -1, -1));

        lbDefReyna.setText("def :");
        getContentPane().add(lbDefReyna, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, -1, -1));

        lbDefKingdom.setText("def :");
        getContentPane().add(lbDefKingdom, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, -1, -1));

        jLabel5.setText("Attack :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 157, -1, -1));

        bAttack.setText("ATTACK");
        bAttack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAttackActionPerformed(evt);
            }
        });
        getContentPane().add(bAttack, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 212, -1, -1));

        rbReyna.setText("REYNA");
        rbReyna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbReynaActionPerformed(evt);
            }
        });
        getContentPane().add(rbReyna, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 179, -1, -1));

        rbKingdom.setText("KINGDOM");
        rbKingdom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbKingdomActionPerformed(evt);
            }
        });
        getContentPane().add(rbKingdom, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 179, -1, -1));

        lbInfoGekko.setText("-");
        getContentPane().add(lbInfoGekko, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 238, 329, -1));

        lbInfoReyna.setText("-");
        getContentPane().add(lbInfoReyna, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 260, 329, -1));

        lbInfoKingdom.setText("-");
        getContentPane().add(lbInfoKingdom, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 282, 329, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bAttackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAttackActionPerformed
        // Hero fight
        if (pilihan == 1) {
            hero.attack(enemy);
            lbInfoGekko.setText(hero.info(enemy));
            NpcFight();
            EnemyFight();
        } else if (pilihan == 2) {
            hero.attack(hero2);
            lbInfoGekko.setText(hero.info(hero2));
            NpcFight();
            EnemyFight();
        }
        updateLabel();
        
        if (hero.getHp() <= 0 || hero2.getHp() <= 0 || enemy.getHp() <= 0) {
            int respone = JOptionPane.showConfirmDialog(this,"GAME OVER, Do you want to continue?", "MESSAGE", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (respone == JOptionPane.OK_OPTION) {
                setFight();
            } else if (respone == JOptionPane.NO_OPTION) {
                System.exit(0); 
            } else if (respone == JOptionPane.CLOSED_OPTION) {
                dispose();
                
            }
            
        }
        
     
    }//GEN-LAST:event_bAttackActionPerformed
    
    public void setFight() {
        hero = new Hero("Gekko", 1, 100);
        hero2 = new Hero("Reyna", 1, 100);
        enemy = new Enemy("Kingdom", 1, 100);
        Weapon weapon = new Weapon("Slingshot", 5);
        hero.setWeapon(weapon);
        hero2.setWeapon(weapon);
        enemy.setWeapon(weapon);
        lbHpGekko.setText("hp : 100");
        lbHpReyna.setText("hp : 100");
        lbHpKingdom.setText("hp : 100");
        lbAtkGekko.setText("BaseAtk : 15");
        lbAtkReyna.setText("BaseAtk : 15");
        lbAtkKingdom.setText("BaseAtk : 11");
        lbInfoGekko.setText(null);
        lbInfoReyna.setText(null);
        lbInfoKingdom.setText(null);
    }
    
    public void updateLabel() {
        lbHpGekko.setText("hp : " + hero.getHp());
        lbHpReyna.setText("hp : " + hero2.getHp());
        lbHpKingdom.setText("hp : " + enemy.getHp());
        lbAtkGekko.setText("BaseAtk : 15");
        lbAtkReyna.setText("BaseAtk : 15");
        lbAtkKingdom.setText("BaseAtk : 11");
    }
    
    public void NpcFight() {
        //NPC fight
        int rand = (int)(Math.random() * 2) + 1;
        if (rand == 1 ) {
            hero2.attack(hero);
            lbInfoReyna.setText(hero2.info(hero));
        } else {
            hero2.attack(enemy);
            lbInfoReyna.setText(hero2.info(enemy));
        }
    }
    
    public void EnemyFight() {
        //NPC fight
        int rand2 = (int)(Math.random() * 2) + 1;
        if (rand2 == 1 ) {
            enemy.attack(hero);
            lbInfoKingdom.setText(enemy.info(hero));
        } else {
            enemy.attack(hero2);
            lbInfoKingdom.setText(enemy.info(hero2));
        }
    }
    
    private void rbReynaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbReynaActionPerformed
        // TODO add your handling code here:
        pilihan = 2;
        rbKingdom.setSelected(false);
    }//GEN-LAST:event_rbReynaActionPerformed

    private void rbKingdomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbKingdomActionPerformed
        // TODO add your handling code here:
        pilihan = 1;
        rbReyna.setSelected(false);
    }//GEN-LAST:event_rbKingdomActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(RPGgameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(RPGgameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(RPGgameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(RPGgameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new RPGgameGUI().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAttack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lbAtkGekko;
    private javax.swing.JLabel lbAtkKingdom;
    private javax.swing.JLabel lbAtkReyna;
    private javax.swing.JLabel lbDefGekko;
    private javax.swing.JLabel lbDefKingdom;
    private javax.swing.JLabel lbDefReyna;
    private javax.swing.JLabel lbGekko;
    private javax.swing.JLabel lbHpGekko;
    private javax.swing.JLabel lbHpKingdom;
    private javax.swing.JLabel lbHpReyna;
    private javax.swing.JLabel lbInfoGekko;
    private javax.swing.JLabel lbInfoKingdom;
    private javax.swing.JLabel lbInfoReyna;
    private javax.swing.JLabel lbKingdom;
    private javax.swing.JLabel lbReyna;
    private javax.swing.JRadioButton rbKingdom;
    private javax.swing.JRadioButton rbReyna;
    // End of variables declaration//GEN-END:variables
}
