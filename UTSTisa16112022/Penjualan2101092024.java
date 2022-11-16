/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTSTisa16112022;


/**
 *
 * @author hp
 */
public class Penjualan2101092024 {
    public static void main (String[] args) {
          Penjualan penjualan = new Penjualan();

         penjualan.setFaktur("001");
         penjualan.setPelanggan("Atrisa");
         penjualan.setKode("2101092024");
         penjualan.setHarga(20000);
         penjualan.setJumlah(5);
         
         //System.out.println("Nama        :"+student1.getName());
         System.out.println("No Faktur = "+penjualan.getFaktur());
         System.out.println("Nama Pelanggan = "+penjualan.getPelanggan());
         System.out.println("Kode Penjualan = "+penjualan.getKode());
         System.out.println("Harga = "+penjualan.getHarga());
         System.out.println("Jumlah Barang = "+penjualan.getJumlah());
         System.out.println("Total Harga = "+penjualan.getTotal());
         System.out.println("Diskon = "+penjualan.getDiskon());
         System.out.println("Total Bayar = "+penjualan.getBayar());
     }
    
}
