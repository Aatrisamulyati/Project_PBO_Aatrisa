# Dasar Exception Handling  - Modul 12

##### 12.1 Tujuan.
####
Dalam bagian ini, kita akan mempelajari teknik yang dipakai dalam Java dalam menangani kondisiyang tidak biasa dalam menjalankan operasi normal dalam program. Teknik ini dinamakan exception handling.

Pada akhir pembelajaran, siswa mampu untuk:
* Mendefinisikan exception
* Menangani exception menggunakan blok try-catch-finally

##### 12.2 Apa itu Exception?
####
Exception adalah sebuah peristiwa yang menjalankan alur proses normal pada program. Peristiwaini biasanya berupa kesalahan(error) dari beberapa bentuk. Ini disebabkan program kita berakhirtidak normal.

Beberapa contoh dari exception yang Anda mungkin jumpai pada latihan-latihan sebelumnya adalah: exception ArrayIndexOutOfBounds, yang terjadi jika kita mencoba mengakses elemen array yang tidak ada, atau NumberFormatException, yang terjadi ketika kita mencoba melalui parameter bukan angka dalam method Integer.parseInt.

##### 12.3 Menangani Exception
####
Untuk menangani exception dalam Java, kita gunakan blok try-catch-finally. Apa yang kita lakukan dalam program kita adalah kita menempatkan pernyataan yang mungkin menghasilkan exception dalam blok ini. Bentuk umum dari blok try-catch-finally adalah,

       try{ 
              //tulis pernyataan yang dapat mengakibatkan exception
              //dalam blok ini
       }
       catch( <exceptionType1> <varName1> ){ 
              //tulis aksi apa dari program Anda yang dijalankan jika ada 
              //exception tipe tertentu terjadi
       }
       . . .
       catch( <exceptionTypen> <varNamen> ){
              //tulis aksi apa dari program Anda yang dijalankan jika ada 
              //exception tipe tertentu terjadi
       }
       finally{ 
              //tambahkan kode terakhir di sini
       }

##### 12.4 Latihan
####
###### 12.4.1 Menangkap Exception 1
Diberikan kode berikut:

       public class TestExceptions{
              public static void main( String[] args ){
                     for( int i=0; true; i++ ){
                            System.out.println("args["+i+"]="+args[i]); 
                     }
              }
       }
       
Compile dan jalankan program TestExceptions. Keluarannya akan tampak seperti ini:

       javac TestExceptions one two three
       args[0]=one
       args[1]=two
       args[2]=three
       Exception in thread "main"
              java.lang.ArrayIndexOutOfBoundsException: 3
        at TestExceptions.main(1.java:4)
        
Ubah program TestExceptions untuk menangani exception, keluaran program setelah ditangkap exception-nya akan seperti ini:

       javac TestExceptions one two three
       args[0]=one
       args[1]=two
       args[2]=three
       Exception caught:
              java.lang.ArrayIndexOutOfBoundsException: 3
              Quiting...
              
###### 12.4.2 Menangkap Exception 2
Melakukan percobaan pada beberapa program yang telah Anda tulis adalah hal yang baik sebelum menghadapi exception. Karena pada program di atas Anda tidak menangkap exception, maka eksekusi dengan mudahnya berhenti mengeksekusi program Anda. Kembali kepada program diatas dan gunakan penanganan exception.


Thank you !

Pembuat
> Aatrisa Mulyati