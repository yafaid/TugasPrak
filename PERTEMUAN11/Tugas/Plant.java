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
public class Plant {

    public void doDestroy(Destroyable d) {
        if (d instanceof JumpingZombie) {
            ((JumpingZombie) d).destroyed();
            ((JumpingZombie) d).heal();
        } else if (d instanceof WalkingZombie) {
            ((WalkingZombie) d).destroyed();
            ((WalkingZombie) d).heal();
        }
    }
}
