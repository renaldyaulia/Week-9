/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week.pkg9;

/**
 *
 * @author hp
 */
public class LatSol5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ClassLatSol5BukuGambar bg = new ClassLatSol5BukuGambar ("B001","BUKU GAMBAR",2500,3000,5,2);
        ClassLatSol5BukuGambar pn = new ClassLatSol5BukuGambar("P002","PENSIL 2B",1500,1750,10,1);
        System.out.println(bg.tampilBarang());
        System.out.println("----------------------------------");
        System.out.println(pn.TampilBuku());
    }
    
}
