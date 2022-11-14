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
public class MainMotor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Motor mtr = new Motor();
    mtr.inputMerk("Yamaha");
    mtr.inputTipe("Mx - 125cc");
    mtr.inputTangki(4);
    mtr.inputHarga(15000000);
    System.out.println("Rincian Motor : ");
    System.out.println("Merk : " + mtr.tampilMerk());
    System.out.println("Tipe : " + mtr.tampilTipe());
    System.out.println("Tangki : " + mtr.tampilTangki());
    System.out.println("Harga : " + mtr.tampilHarga());
    }
    
}
