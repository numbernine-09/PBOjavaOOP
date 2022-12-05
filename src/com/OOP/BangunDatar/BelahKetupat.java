/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.OOP.BangunDatar;

/**
 *
 * @author infin
 */
public class BelahKetupat {
    double luas,keliling,sisiMiring;
    
    public double getLuas() {
        return luas;
    }

    public void setLuas(double d1, double d2) {
        this.luas = d1*d2/2;
    }

    public double getKeliling() {
        return keliling;
    }

    public void setKeliling(double d1, double d2) {
        this.keliling = 4* sisiMiring(d1,d2);
    }

    public double sisiMiring(double d1, double d2) {
       return sisiMiring = Math.sqrt(d1 / 2 * d1 / 2 + d2 / 2 * d2 / 2);
    }
}
