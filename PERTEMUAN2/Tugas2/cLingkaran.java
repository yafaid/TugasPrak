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
public class cLingkaran {

    public double phi;
    public double r;

    public void hitungLuas() {
        double Luas = phi * r * r;
        System.out.println("Luas dari Lingkaran adalah : " + Luas);
    }

    public void hitungKeliling() {
        double Keliling = 2 * phi * r;
        System.out.println("Keliling dari Lingkaran adalah : " + Keliling);
    }
}
