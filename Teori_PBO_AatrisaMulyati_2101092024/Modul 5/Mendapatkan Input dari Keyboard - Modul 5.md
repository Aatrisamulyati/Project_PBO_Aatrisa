# Mendapatkan Input dari Keyboard - Modul 5

##### 5.1 Tujuan.
####
Kita sudah mempelajari konsep mendasar pada Java dan menulis beberapa program sederhana. Sekarang kita akan mencoba membuat program kita lebih interaktif dengan menggunakan input dari keyboard. Pada bab ini, kita akan mempelajari dua cara memberikan input, yang pertama adalah menggunakan kelas BufferedReader dan melalui GUI (Graphical User Interface) dengan menggunakan kelas JOptionPane. Pada akhir bab ini, para siswa diharapkan mampu: 
* Membuat program Java yang interaktif yang bisa mendapatkan input dari keyboard 
* Menggunakan kelas BufferedReader untuk mendapatkan input dari keyboard 
melalui layar console  
* Menggunakan kelas JOptionPane untuk mendapatkan input dari keyboard melalui 
GUI 

##### 5.2 Menggunakan BufferedReader untuk  mendapatkan input 
####
Pada bagian ini, kita akan menggunakan kelas BufferedReader yang berada di java.iopackage untuk mendapatkan input dari keyboard. 
Berikut ini adalah langkah-langkah yang diperlukan untuk mendapatkan input dari  keyboard: 
1. Tambahkan di bagian paling atas code anda: 
       
       import java.io.*; 

2. Tambahkan statement ini: 

       BufferedReader dataIn = new BufferedReader(new InputStreamReader
       ( System.in) ); 
       
       
3. Deklarasikan variabel String temporer untuk mendapatkan input, dan gunakan fungsi 
readLine() untuk mendapatkan input dari keyboard. Anda harus mengetikkannya di 
dalam blok try-catch: 

       try{ 
            String temp = dataIn.readLine(); 
       } 
            catch( IOException e ){ 
                System.out.println(“Error in getting input”); 
            }
                import java.io.BufferedReader; 
                import java.io.InputStreamReader; 
                import java.io.IOException; 
                
                public class GetInputFromKeyboard 
                { 
                    public static void main( String[] args ){ 
                        BufferedReader dataIn = new BufferedReader(new 
                                    InputStreamReader( System.in) ); 
                                    
                        String name = ""; 
                        
                        System.out.print("Please Enter Your Name:"); 
                        
                        try{ 
                            name = dataIn.readLine(); 
                        }catch( IOException e ){ 
                            System.out.println("Error!"); 
                        } 
                            System.out.println("Hello " + name +"!"); 
                } 
       }

##### 5.3 Menggunakan JOptionPane untuk mendapatkan input 
Cara lain untuk mendapatkan input dari user adalah dengan menggunakan kelas  JoptionPane yang didapatkan dari javax.swing package. JoptionPane membuat  kemudahan dengan memunculkan dialog box standar yang memberikan kepada user  sebuah nilai atau menginformasikan sesuatu. 
Berikan kode berikut ini,

       import javax.swing.JOptionPane; 

       public class GetInputFromKeyboard 
       { 
            public static void main( String[] args ){ 
                String name = ""; 
                name = JoptionPane.showInputDialog("Please enter your name"); 
 
                String msg = "Hello " + name + "!"; 
 
                JOptionPane.showMessageDialog(null, msg); 
 
            } 
        } 

##### 5.4 Latihan 
####
###### 5.1.1 Kata Terakhir (versi BufferedReader) 
####
Menggunakan BufferedReader, tanyakan tiga kata dari user dan tampilkan output dari
input user tersebut ke layar. Contoh, 

       Enter word1:Goodbye 
       Enter word2:and 
       Enter word3:Hello 
       Goodbye and Hello 
    
###### 5.1.2 Kata Terakhir (versi JOptionPane) 
Menggunakan JOptionPane, tanyakan tiga kata dari user dan tampilkan output dari input user tersebut ke layar.

Thank you !

Pembuat
> Aatrisa Mulyati