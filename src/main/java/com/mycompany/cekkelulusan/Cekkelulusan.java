/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.cekkelulusan;

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class Cekkelulusan {

    public static void main(String[] args) {
        //membuat variabel
        int nilai;
        String nama;
        Scanner kelulusan = new Scanner(System.in);
        
        //mengambil input
        System.out.println("Siapa namamu? ");
        nama = kelulusan.nextLine();
        System.out.println("Berapa nilamu? ");
        nilai = kelulusan.nextInt();
        
        //cek apakah dia lulus
        if(nilai > 70){
            System.out.println("Selamat " + nama + " anda lulus");
        }else {
        System.out.println("Maaf " + nama + " tidak lulus");
    }
    }
}
