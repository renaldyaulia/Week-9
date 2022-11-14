/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package week.pkg9;

/**
 *
 * @author RIVANDY
 */
public class LatSol3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ClassLatSol3 brg = new ClassLatSol3();
    brg.inputKodeBarang("B001");
    brg.inputNamaBarang("BUKU GAMBAR");
    brg.inputHPP(2500);
    brg.inputHargaJual(3000);
    brg.inputStok(5);
    brg.inputJumlahJual(2);
    brg.inputStokSekarang (3);
    brg.inputTotalBayar(6000);
    brg.inputLaba(1000);
    System.out.println("INPUT : ");
    System.out.println("Kode Barang : " + brg.tampilKodeBarang());
    System.out.println("Nama Barang : " + brg.tampilNamaBarang());
    System.out.println("HPP : " + brg.tampilHPP());
    System.out.println("Harga Jual : " + brg.tampilHargaJual());
    System.out.println("Stok : " + brg.tampilStok());
    System.out.println("Jumlah Jual : " + brg.tampilJumlahJual());
    System.out.println("OUTPUT : ");
    System.out.println("Stok Sekarang : " + brg.tampilStokSekarang());
    System.out.println("Total Bayar : " + brg.tampilTotalBayar());
    System.out.println("Laba : " + brg.tampilLaba());
    }
    
}
