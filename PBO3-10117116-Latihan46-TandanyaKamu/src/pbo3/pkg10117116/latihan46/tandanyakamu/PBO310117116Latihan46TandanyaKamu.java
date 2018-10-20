/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117116.latihan46.tandanyakamu;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA  : Muhammad Fitrayana
 * Kelas : PBO3
 * NIM   : 10117116
 * Deskripsi Tugas : Membuat Program Menetukan jumlah umur dan statusnya
 *  
 */
public class PBO310117116Latihan46TandanyaKamu {

    /**
     * @param args the command line arguments
     */
    private static int yearBirth;
    static int umur;   
    
    public static void main(String[] args) {
       
        
       Scanner baca = new Scanner(System.in);
       
       Age objAge = new Age(2018);
       System.out.print("Masukan Tahun Lahir Anda : ");
       yearBirth = baca.nextInt();
       objAge.setYearBirth(yearBirth);
      
       System.out.println("");
       System.out.println("");
       System.out.println("=====HASIL PERHITUNGAN UMUR====");
       System.out.println("Tahun Lahir Anda : " + objAge.getYearBirth());
       System.out.println("Hari ini Tahun : " + objAge.getYearNow());
       System.out.println("Umur kamu sampai hari ini adalah " + objAge.hitungUmur() + " tahun");
       System.out.println("Tandanya Kamu " + objAge.tandanyaKamu(umur));
       
       
    }
    
}
