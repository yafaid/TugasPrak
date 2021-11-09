/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas2;

/**
 *
 * @author hp
 */
public class TestLingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        cLingkaran lk = new cLingkaran();
        lk.phi=3;
        lk.r=4;
        
        lk.hitungKeliling();
        lk.hitungLuas();
    }

}
