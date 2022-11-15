
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author WINDOWS
 */
public class Latihan2_PercabanganIFELSE {
    public static void main(String[] args) {
        double total_pembelian, diskon = 0;
        
        Scanner dataMasuk = new Scanner(System.in);
        System.out.println("Masukan Total Pembelian: Rp ");
        total_pembelian = dataMasuk.nextDouble();
        
        if (total_pembelian >= 50000)
            diskon = 0.1 * total_pembelian;
        else
            diskon = 0.02 * total_pembelian;
        
        System.out.println("Besarnya diskon : Rp " + diskon);
    }
}
