/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.PBO.w04;

/**
 *
 * @author infin
 */
public class Warung {
//   variabel global
    public String makan, minum;

    public String getMakan() {
        return makan;
    }
//  this = membuat variabel lokal menjadi global
    public void setMakan(String makan) {
        this.makan = makan;
    }

    public String getMinum() {
        return minum;
    }

    public void setMinum(String minum) {
        this.minum = minum;
    }


    
    public static void main(String[] args) {
        Warung warung = new Warung();
        warung.setMakan("bakso beranakan");
        warung.setMinum("vodka");
        
        System.out.println("makannya tono adalah "+warung.getMakan());
        System.out.println("minumnya tono adalah "+warung.getMinum());
    }
}
