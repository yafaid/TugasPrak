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
public class Gorilla extends Binatang implements IKarnivora, IHerbivora {

    private String suara;
    private String warnaBulu;

    public Gorilla(String nama, int jmlKaki, String suara, String warnaBulu) {
        super(nama, jmlKaki);
        this.suara = suara;
        this.warnaBulu = warnaBulu;
    }

    @Override
    public void displayBinatang() {
        System.out.println("Binatang Ganas");
    }

    @Override
    public void displayMakan() {
        System.out.println("Pemakan Daging, sayur dan buah");
    }

    public void displayData() {
        System.out.println("Nama : " + nama);
        System.out.println("Jumlah Kaki : " + jmlKaki);
        System.out.println("Suara : " + suara);
        System.out.println("Warna Bulu : " + warnaBulu);
    }
}
