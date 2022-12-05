/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.PBO.w06;

/**
 *
 * @author infin
 */
public class PenggunaanArray {
    public static void main(String[] args) {
        String cobaArray[][] = new String[2][3];
        int counter = 0;
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                cobaArray[i][j] = String.valueOf(counter);
                counter++;
            }
        }
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                System.out.print(cobaArray[i][j]);
            }
            System.out.print("\n");
        }
    }
}
