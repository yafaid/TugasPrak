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
public class Barrier implements Destroyable{

    private int strength;

    public Barrier(int strength) {
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void destroy() {
    }

    @Override
    public void destroyed() {
        strength -= strength * 0.5;
    }

    public String getBarrierinfo() {
        return "Barrier Strength = " + strength + " \n";
    }
}
