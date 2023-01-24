# Argumen dari Command-line - Modul 8

##### 8.1 Tujuan.
####
Pada bagian ini, kita akan mempelajari bagaimana untuk memproses sebuah input dari command-line dengan menggunakan argumen yang diberikan kepada program Java. Pada akhir pelajaran, siswa diharapkan dapat: 

* Mengetahui dan menjelaskan mengenai argumen command-line 
* Mendapatkan input dari user dengan menggunakan argumen command-line 
* Mempelajari bagaimana memberikan argumen kedalam program pada NetBeans

##### 7.2 Argumen Command-line 
####
Sebuah aplikasi Java dapat menerima berbagai argumen dari command-line. Argumen dari command line memberikan kesempatan bagi user untuk mempengaruhi operasi dari sebuah aplikasi dalam sekali invokasi. User memasukkan argumen command line pada saat meng-invoke aplikasi dan memberikan spesifikasi kepada aplikasi tersebut setelah nama kelas untuk dijalankan. Sebagai contoh, apabila Anda memiliki sebuah aplikasi Java dengan nama Sort, yang akan mengurutkan lima nomor, Anda dapat menjalankannya seperti berikut ini:

Perhatikan bahwa sebuah argumen akan dipisahkan oleh spasi. Di bahasa Java, apabila Anda akan memanggil sebuah aplikasi, sebuah runtime system akan memberikan argumen command-line ke main method lewat array dari String, dimana tiap String dalam array terdiri dari sebuah argumen commmand-line. Perhatikan deklarasi dari main method, 

       public static void main( String[] args ) 
       
Argumen yang diberikan kepada program Anda akan disimpan kedalam sebuah array String dengan identifier args. Pada contoh sebelumnya, argumen dari command-line yang akan diberikan kepada plikasi sort command adalah lima buah String yaitu “5”,”4”,”3”,”2”, dan “1”. Anda dapat mengetahaui berapa banyak argumen dari command-line dengan cara melihat panjang dari attribute array. Sebagai contoh, 

       int numberOfArgs = args.length; 
       
Jika program Anda membutuhkan support sebuah argumen command-line yang numeric. Anda harus mengkonversi String argumen tersebut untuk merepresantasikan sebuah nomor, misalnya “34” menjadi sebuah nomor. Kode dibawah ini adalah sebuah  potongan untuk mengkonversi sebuah argumen command-line menjadi integer. 
       
       int firstArg = 0; 
       if (args.length > 0){
            firstArg = Integer.parseInt(args[0]); 
        } 
        
parseInt akan mendapatkan NumberFormatException (ERROR) jika format args[0] tidak valid (bukan sebuah nomor).

##### 8.3 Argument Command-line di NetBeans
####
Untuk menggambarkan bagaimana sebuah argumen diberikan pada program di NetBeans, marilah kita membuat sebuah program Java yang akan mencetak jumlah argumen dimana argumen pertama yang telah diberikan pada program tersebut. 

        public class CommandLineExample 
        { 
            public static void main( String[] args ){ 
 
                 System.out.println("Number of arguments=" + args.length); 
                 
                 System.out.println("First Argument="+ args[0]); 
            } 
        } 
    
Sekarang, jalankan NetBeans, buat sebuah project yang baru, dan beri nama project ini CommanLineExample. Copy kode yang telah dituliskan diatas, kemudian compile. Setelah itu, ikutilah langkah-langkan berikut ini untuk memberikan argumen kepada program Anda dengan menggunakan NetBeans. 
* Klik di Projects 
* Klik kanan icon CommanLineExample dan akan keluar sebuah pop-up menu.
* Klik pada properties-nya.
* Dialog mengenai project properties akan tampil 
* Kemudian, klik Run -> Running Project

Pada argument textbox, tuliskan tipe argumen yang Anda ingin masukkan kedalam  program. Dalam kasus ini kita akan mengetikkan 5 4 3 2 1. Kemudian, klik pada tombol OK
* Kemudian, cobalah untuk menjalankan (RUN) progam Anda

##### 8.4 Latihan
####
###### 8.4.1 Mencetak Argument 
Dapatkan input dari user dengan menggunakan argument command line dan cetak semua argumen ke layar. Sebagai contoh, jika user memasukkan 

        java Hello world that is all 

program Anda haruslah mencetak 

        Hello 
        world 
        that 
        is 
        all 
        
###### 8.4.2 Operasi Aritmatik 
Dapatkan dua buah bilangan yang diinputkan user dari command line dengan argumen command line,kemudian cetak hasil penjumlahannya, hasil pengurangannya, hasil perkalian, dan juga hasil pembagiannya. 

        java ArithmeticOperation 20 4 

program anda akan mencetak 

        sum = 24 
        difference = 16 
        product = 80 
        quotient = 5
 
Thank you !

Pembuat
> Aatrisa Mulyati