/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.PBO.w05;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 *
 * @author infin
 */
public class PenggunaanArrayList {
    public static void main(String[] args) {
        ArrayList<String> klasemenLaliga = new ArrayList<>();
        klasemenLaliga.add("Real Madrid");
        klasemenLaliga.add("Barcelona");
        klasemenLaliga.add("Atletico Madrid");
        
//      menampilkan isi array list menggunakan list iterator        
        ListIterator<String> iter = klasemenLaliga.listIterator();
        while(iter.hasNext()){
            System.out.println(iter.next());  
        }

//       menampilkan isi array list menggunakan for-loop
//       for(String klasemen : klasemenLaliga){
//           System.out.println(klasemen);
//       }

//      menghapus salah satu isi array list
        klasemenLaliga.remove(1);
        ListIterator<String> iter2 = klasemenLaliga.listIterator();
        while(iter2.hasNext()){
            System.out.println(iter2.next());  
        }
        
//      mengahapus semua isi array list
//        klasemenLaliga.clear();
//        ListIterator<String> iter3 = klasemenLaliga.listIterator();
//        while(iter3.hasNext()){
//            System.out.println(iter3.next());  
//        }
        
        klasemenLaliga.set(0, "Villareal");
        ListIterator<String> iter4 = klasemenLaliga.listIterator();
        while(iter4.hasNext()){
            System.out.println(iter4.next());  
        }
    }
}
