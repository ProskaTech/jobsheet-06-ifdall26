
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author WINDOWS
 */
public class Tugas1a {
    public static void main(String[] args) throws IOException {
        BufferedReader dataIn = new BufferedReader (new InputStreamReader (System.in));
//        int nilai1, nilai2, nilai3;
        String nilai1 = " ", nilai2 = " ", nilai3 = " ";
        
        
        System.out.print("Enter Nilai 1 : ");
        nilai1 = dataIn.readLine();
        System.out.print("Enter Nilai 2 : ");
        nilai2 = dataIn.readLine();
        System.out.print("Enter Nilai 3 : ");
        nilai3 = dataIn.readLine(); 

        int n1 = Integer.valueOf(nilai1).intValue();
        int n2 = Integer.valueOf(nilai2).intValue();
        int n3 = Integer.valueOf(nilai3).intValue();
        
        int rata=(n1 + n2 + n3)/3;
        if (rata>60) {
            System.out.println("Nilai Rata-rata : " + rata + ":-)");
        }
        else {
            System.out.println("Nilai Rata-rata : " + rata + ":-(");
        }
    } 
}
