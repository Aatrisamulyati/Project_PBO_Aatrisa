/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tisa30112022;

/**
 *
 * @author hp
 */
public class MyDouble implements Relation {
    public boolean isGreater( Object a, Object b){
        //int angka1 = (double)a;
        //int angka2 = (double)b;
        //return angka1>angka2;
        return(double)a>(double)b;
    } 
    
    public boolean isLess( Object a, Object b){
        return(double)a<(double)b;
    }
            
    public boolean isEqual( Object a, Object b){
          return(double)a==(double)b;
    }
}
    
