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
class Motor {
    private String merk, tipe;
    private int tangki;
    private long harga;
    void inputMerk (String merk) {
        this.merk = merk;
    }
    void inputTipe (String tipe) {
        this.tipe = tipe;
    }
    void inputTangki(int tangki) {
        this.tangki = tangki;
    }
    void inputHarga(long harga) {
        this.harga = harga;
    }
    public String tampilMerk(){
        return merk;
    }
    public String tampilTipe(){
        return tipe;
    }
    public int tampilTangki(){
        return tangki;
    }
    public long tampilHarga(){
        return harga;
    }
}
