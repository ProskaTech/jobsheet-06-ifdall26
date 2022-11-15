
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
public class Tugas2a {
    public static void main(String[] args) {
        int angka;        
        Scanner dataMasuk = new Scanner (System.in);
        System.out.println("Masukkan Angka : ");
        angka = dataMasuk.nextInt();
        if(angka == 1){
            System.out.println("Satu");
        }
        else if(angka == 2){
            System.out.println("Dua");
        }
        else if(angka == 3){
            System.out.println("Tiga");
        }
        else if(angka == 4){
            System.out.println("Empat");
        }
        else if(angka == 5){
            System.out.println("Lima");
        }
        else if(angka == 6){
            System.out.println("Enam");
        }
        else if(angka == 7){
            System.out.println("Tujuh");
        }
        else if(angka == 8){
            System.out.println("Delapan");
        }
        else if(angka == 9){
            System.out.println("Sembilan");
        }
        else if(angka == 10){
            System.out.println("Sepuluh");
        }
        else {
            System.out.println("Invalid Number");
        }
    }
}
