/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author hp
 */
public class JumpingZombie extends Zombie {

    public JumpingZombie(int health, int level) {
        this.health = health;
        this.level = level;
    }

    public void heal() {
        switch (level) {
            case 1:
                health += health * 0.3;
                break;
            case 2:
                health += health * 0.4;
                break;
            case 3:
                health += health * 0.5;
                break;
        }
    }

    @Override
    public void destroyed() {
        health -= 0.1;
    }

    @Override
    public String getZombieInfo() {
        System.out.println("Walking Zombie : ");
        System.out.println("Health : " + health);
        System.out.println("Level : " + level);
        return "Walking Zombie Data = \n"
                + "Health = " + health + "\n"
                + "Level = " + level + "\n";
    }
}
