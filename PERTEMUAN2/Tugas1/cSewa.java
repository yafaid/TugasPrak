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
public class cSewa {
    public String id;
    public String namaGame;
    public String namaMember;
    public int harga;
    
    public void tampilData(){
        System.out.println("ID : "+id);
        System.out.println("Member : "+namaMember);
        System.out.println("Game : "+namaGame);
        System.out.println("Harga : "+harga);
    }
    
    public int tampilHarga(int durasi){
        int total = durasi * harga;
        return total;
    }
}
