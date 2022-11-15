
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author WINDOWS
 */
public class Tugas1b {
    public static void main(String[] args) {
        int n1;
        int n2;
        int n3;
        n1= Integer.parseInt (JOptionPane.showInputDialog("Enter Nilai 1:"));
        n2= Integer.parseInt(JOptionPane.showInputDialog("Enter Nilai 2:"));
        n3= Integer.parseInt(JOptionPane.showInputDialog("Enter Nilai 3:"));
        int hasil=(n1+n2+n3)/3;
        if(hasil>60){
            JOptionPane.showMessageDialog(null,"Nilai Rata-rata : " + hasil + ":-)");
        }
        else {
            JOptionPane.showMessageDialog(null,"Nilai Rata-rata : " + hasil + ":-(");
        }
    } 
}
