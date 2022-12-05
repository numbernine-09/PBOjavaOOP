/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.PBO.w03;

/**
 *
 * @author infin
 */
public class Exponential {
    public double hasil;
//konstruktor = nama file sama seperti nama class
    public Exponential() {
    }

    public Exponential(double inputX) {
        this.hasil = Math.pow(inputX, 2);
    }
    
    public Exponential(double inputX, double inputY) {
        this.hasil = Math.pow(inputX, inputY);
    }
    
    
    public static void main(String[] args) {
        //inisiasi objek
//        Exponential exponential = new Exponential();
//        exponential.pangkat();
//        exponential.showHasil();
//        
//        exponential.pangkat(4, 5);
//        exponential.showHasil();

        Exponential exp1 = new Exponential(3);
        exp1.showHasil();
        Exponential exp2 = new Exponential(5, 3);
        exp2.showHasil();   
    }
    
//   overload terjadi apabila memiliki jumlah parameter dan type data yang berbeda pada konstruktor dan class

    private double pangkat(double inputY) {
        return hasil = Math.pow(inputY, 2);
    }
    
    private void showHasil() {
        System.out.println("Hasil exponential : "+hasil);
    }

    private double pangkat(int inputX, int inputY) {
         return hasil = Math.pow(inputX, inputY);
    }
}

