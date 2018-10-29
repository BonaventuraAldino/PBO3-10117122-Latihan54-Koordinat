/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117122.latihan54.koordinat;

/**
 *
 * @author Aldy Senda
 * Nama  : Bonaventura Aldino Senda Seni
 * NIM   : 10117122
 * Kelas : IF-3
 * Deskripsi Program : Program ini dibuat untuk menentukan koordinat sumbu 
 *                     berasarkan warna koordinat, dengan menggunkan pendekatan 
 *                     berbasis objek
 */
public class PBO310117122Latihan54Koordinat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Koordinat koordinat = new Koordinat(0,0);
        WarnaKoordinat warna = new WarnaKoordinat(0, 0, "");
        
        System.out.println("Warna Koordinat   : " + warna.getWarnaKoordinat());
        System.out.println("Koordinat Sumbu x : " + koordinat.getX() 
                + ", y : " + koordinat.getY());
        System.out.println("\n(Developed By : Bonaventura Aldino Senda Seni)");
    }
    
}
