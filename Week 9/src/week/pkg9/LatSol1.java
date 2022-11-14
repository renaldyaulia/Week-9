/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package week.pkg9;
import static java.lang.Integer.parseInt;
import javax.swing.*;
/**
 *
 * @author RIVANDY
 */
public class LatSol1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String angka1, angka2;
        angka1 = JOptionPane.showInputDialog("Masukan Angka Kesatu : ");
        angka2 = JOptionPane.showInputDialog("Masukan Angka Kedua : ");
        JOptionPane.showMessageDialog(null, parseInt(angka1) + parseInt (angka2));
    }
    
}
