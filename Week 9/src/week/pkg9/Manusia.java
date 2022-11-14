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
class Manusia {
    public String nama, hobby, pekerjaan;
    public Manusia (String nm, String hobby, String kerja) {
        this.nama = nm;
        this.hobby = hobby;
        this.pekerjaan = kerja;
    }
    public String tampilManusia() {
        return ("Nama\t\t: " + nama + "\n" + "Hobby\t\t: " + hobby + "\n" + "Pekerjaan\t\t: " + pekerjaan + "\n");
    }
}
class programmer extends Manusia {
    public programmer(String nm, String hobby, String kerja) {
        super(nm, hobby, kerja);
    }
    
}
class polisi extends Manusia {
    public polisi(String nm, String hobby, String kerja) {
        super(nm, hobby, kerja);
    }
    
}
