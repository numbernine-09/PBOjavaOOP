/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.PBO.w02;

/**
 *
 * @author infin
 */
public class mobil {
    String pabrikan;
    String type;
    String warna;
    
    public static void main(String[] args) {
        mobil toyota = new mobil();
        toyota.warna = "merah";
        toyota.pabrikan = "avanza";
        toyota.type = "TRD";
        System.out.println("Toyota Merk:"+toyota.pabrikan);
        System.out.println("Toyota warna:"+toyota.warna);
        System.out.println("Toyota type:"+toyota.type);
        
               
    }
    
}
