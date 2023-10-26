/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasOverride;

/**
 *
 * @author WINDOWS 10
 */
public class main {
    public static void main(String[] args) {
        Makanan makanan = new Makanan();
        
        makanan.berasa("Ayam");
        Ayam ayam = new Ayam();
        ayam.Rasa();
        
        //Menggunakan override
        Nasgor nasgor = new Nasgor();
        nasgor.berasa("Nasi Goreng\n");
        
        makanan.berasa("Udang");
        Udang udang = new Udang();
        udang.Rasa();
        
        //Menggunakan override
        Bakso bakso = new Bakso();
        bakso.berasa("Bakso\n");
    }
}
