/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.PBO.w05;

import java.util.Scanner;

/**
 *
 * @author infin
 */
public class MainLaptop {
    public static void main(String[] args) {
        Laptop[] laptops = new Laptop[1];
        
        for(int i=0;i<laptops.length;i++){
            laptops[i] = new Laptop();
//            pengisian array of object
            Scanner scanner = new Scanner(System.in);
            laptops[i].setBrand(scanner.next());
            
            Scanner scanner2 = new Scanner(System.in);
            laptops[i].setHarga(scanner2.nextLong());
        }
        for(int i=0;i<laptops.length;i++){
            System.out.println("Merk :"+laptops[i].getBrand());
             System.out.println("Harga :"+laptops[i].getHarga());
        }
    }
}
