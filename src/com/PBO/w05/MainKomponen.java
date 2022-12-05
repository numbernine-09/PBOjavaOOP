/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.PBO.w05;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author infin
 */
public class MainKomponen {
    List<Komponen> listData;
    
    public static void main(String[] args) {
        new MainKomponen().tambahData();
    }
    
    private void tambahData() {
        listData = new ArrayList<>();
        listData.add(new Komponen("Mouse Razer", 985000));
        listData.add(new Komponen("Headset SteelSeries", 1328000));
        
        for(int i=0;i<listData.size();i++){
            System.out.println(listData.get(i).namaKomponen+" "+"harganya: "+listData.get(i).harga);
        }
    }
}
