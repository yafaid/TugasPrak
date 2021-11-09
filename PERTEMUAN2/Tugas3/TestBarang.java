/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas3;

/**
 *
 * @author hp
 */
public class TestBarang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        cBarang br = new cBarang();
        br.kode = "101";
        br.namaBarang = "Rokok";
        br.hargaDasar = 20000;
        br.diskon = (float) 0.15;
        
        br.tampilData();                        
        System.out.println("Harga Diskon : "+br.hitungHargaJual());
    }

}
