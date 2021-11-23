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
public class MainTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Singa sg = new Singa("Simba", 4, "Rawr", "Cokelat");
        sg.displayBinatang();
        sg.displayData();
        sg.displayMakan();

        Keledai kl = new Keledai("Shaun", 4, "mbeek", "Abu-Abu");
        kl.displayBinatang();
        kl.displayData();
        kl.displayMakan();

        Gorilla gr = new Gorilla("Giant", 2, "huhah", "Hitam");
        gr.displayBinatang();
        gr.displayData();
        gr.displayMakan();        
}
