/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119083.latihan41.massajenis;

/**
 * @Nama     : Rafsan Zen Mustaofa
 * NIM       : 10119083
 * Kelas     : IF2
 * Deskripsi : Menampilkan program untuk mencari massa jenis kubus
 */
public class PBOIF210119083Latihan41MassaJenis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Kubus kubus = new Kubus();
        System.out.println("=====Hitung Masa Jenis Kubus=====");
        kubus.setSisi(5);
        System.out.println("Sisi = " + kubus.getSisi());
        kubus.setMassa(250);
        System.out.print("Massa = " + kubus.getMassa());
        
        //output
        System.out.println("\n=====Hasil Perhitungan=====");
        System.out.println("Volume = " + kubus.hitungVolume(kubus.getSisi()));
        System.out.println("Massa Jenis = " + kubus.hitungMassaJenis(kubus.getMassa(),
                            kubus.hitungVolume(kubus.getSisi())));
        System.out.println("==========================================");
        System.out.println("Developed by : Rafsan Zen Mustaofa");
    }
    
    
}
