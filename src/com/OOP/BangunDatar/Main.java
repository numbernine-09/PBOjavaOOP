/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.OOP.BangunDatar;

import java.util.Scanner;

/**
 *
 * @author infin
 */
public class Main {
//  inisialisasi type data 
    private static char pilihan;
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
//      inisialisasi object
        Lingkaran lingkaran = new Lingkaran();
        persegi persegi = new persegi();
        PersegiPanjang persegiPanjang = new PersegiPanjang();
        BelahKetupat belahKetupat = new BelahKetupat();
        
//      inisialisasi type data pada setiap object
        double r,s,p,l,d1,d2;
        
//      panggil methode
        mainMenu();
        
//      kondisional untuk pilihan menu yang dimasukkan
        switch(pilihan){
            case '1' -> {
                char coba;
                do {
                System.out.println("Menghitung Luas Persegi");
                System.out.print("sisi: ");
                s = scanner.nextDouble();
                persegi.setResult(s);
                System.out.println("Luas persegi adalah "+ persegi.getResult());
                System.out.print("\nIngin mencoba lagi? (y/t) : ");
                coba = scanner.next().charAt(0);
                System.out.print("\n");
                } while (coba == 'Y' || coba == 'y');
                System.out.print("\n");
                mainMenu();
            }

            case '2' -> {
                char coba;
                do {
                System.out.println("Menghitung Luas Persegi Panjang");
                System.out.print("panjang: ");
                p = scanner.nextDouble();
                System.out.print("lebar: ");
                l = scanner.nextDouble();
                persegiPanjang.setResult(p, l);
                System.out.println("Luas Persegi Panjang adalah "+persegiPanjang.getResult());
                System.out.println("\nIngin mencoba lagi? (y/t) : ");
                coba = scanner.next().charAt(0);
                } while (coba == 'Y' || coba == 'y');
                System.out.println("\n");
                mainMenu();
            }
            case '3' -> {
                char coba;
                do {
                System.out.println("Menghitung luas dan keliling belah ketupat");
                System.out.print("diameter 1: ");
                d1 = scanner.nextDouble();
                System.out.print("diameter 2: ");
                d2 = scanner.nextDouble();
                belahKetupat.setLuas(d1, d2);
                belahKetupat.setKeliling(d1, d2);
                belahKetupat.sisiMiring(d1, d2);
                System.out.println("sisi miring adalah: "+belahKetupat.sisiMiring(d1, d2));
                System.out.println("luas belah ketupat adalah: "+belahKetupat.getLuas());
                System.out.println("keliling belah ketupat adalah: "+belahKetupat.getKeliling());
                System.out.println("\nIngin mencoba lagi? (y/t) : ");
                coba = scanner.next().charAt(0);
                } while (coba == 'Y' || coba == 'y');
                System.out.println("\n");
                mainMenu();
            }
            case '4' -> {
                char coba;
                do {
                System.out.println("Menghitung Luas Lingkaran");
                System.out.print("Jari-jari: ");
                r = scanner.nextDouble();
                lingkaran.setR(r);
                System.out.println("Luas: " + lingkaran.getR());
                System.out.println("\nIngin mencoba lagi? (y/t) : ");
                coba = scanner.next().charAt(0);
                } while (coba == 'Y' || coba == 'y');
                System.out.println("\n");
                mainMenu();
            }
            case '5' -> {
                System.out.println("terimakasih telah mencoba, jangan lupa makan :)");
            }
        }
        
  
    }

    public static void mainMenu(){
//    pilihan menu
        System.out.println("=========================================");
        System.out.println("| Hitung Luas dan Keliling Bangun Datar |");
        System.out.println("=========================================");
        System.out.println("1. Persegi");
        System.out.println("2. Persegi Panjang");
        System.out.println("3. Belah Ketupat");
        System.out.println("4. Lingkaran");
        System.out.println("5. Keluar\n");
        System.out.print("Masukan Menu : ");
        pilihan = scanner.next().charAt(0);
}
}
