/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tisa19102022;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author hp
 */
public class Latihan3 {
     public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader (new InputStreamReader (System.in));
        
        String nama = "";
        
        System.out.println("==Program Menginput Nama==\n");
        
        try {
            System.out.print("Masukkan Nama Anda : ");
            nama = dataIn.readLine();
        }
        catch (IOException e){
            System.out.println("Error!");
        }
        
        System.out.println("\n");
        
        int x = 1;
        do{
            System.out.println(nama);
            x++;
        } while(x<=100);
    }
}

