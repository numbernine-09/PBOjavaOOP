/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.OOP.BangunDatar;

/**
 *
 * @author infin
 */
public class Lingkaran {
   final double phi = 3.14;
   double result;

    public double getR() {
        return result;
    }

    public void setR(double r) {
        this.result = phi * Math.pow(r, 2);
    }
}
