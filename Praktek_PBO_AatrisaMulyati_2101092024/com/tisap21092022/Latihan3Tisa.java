/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tisap21092022;

/**
 *
 * @author hp
 */
public class Latihan3Tisa {
    public static void main(String[] args) {
         int x = 10, y = 23, z = 5;
	 int max;
	 System.out.println("number 1 = "+x);
	 System.out.println("number 2 = "+y);
	 System.out.println("number 3 = "+z);
	 
	 max=(y>=x)? y: x;
	 max=(z>=max)? z: max;
	 System.out.println("Nilai tertingginya adalah angka = "+max);
    }
}
