/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tisa07122022;

/**
 *
 * @author hp
 */
public class ExampleException {
    public static void main( String[] args ){
        try{
            System.out.println( args[0] );
        }catch( ArrayIndexOutOfBoundsException ex ){
            System.out.println("index ke " +ex.getMessage()+ " Tidak ada");
        }
    }    
}
