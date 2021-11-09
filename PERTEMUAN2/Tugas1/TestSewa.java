/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1;

/**
 *
 * @author hp
 */
public class TestSewa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        cSewa sw = new cSewa();
        
        sw.id = "101";        
        sw.namaMember = "Yanu";
        sw.namaGame = "Dota 2";
        sw.harga = 3000;
        
        sw.tampilData();
        System.out.println("Stok baru adalah " + sw.tampilHarga(3));
    }
    
}
