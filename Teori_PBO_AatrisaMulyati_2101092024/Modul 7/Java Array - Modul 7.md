# Java Array - Modul 7

##### 7.1 Tujuan.
####
Dalam bagian ini, kita akan mendiskusikan mengenai array dalam Java. Pertama, kita akan mendefinisikan apa yang dimaksud dengan array, kemudian kita juga akan  mendefinisikan bagaimana mendeklarasikannya dan menggunakannya dalam Java. Pada akhir pelajaran, siswa haruslah mampu untuk : 
- Mendeklarasikan dan membuat array 
- Mengakses elemen-elemen didalam array 
- Menentukan jumlah element didalam sebuah array 
- Mendeklarasikan dan membuat array multidimensi 

##### 7.2 Pengenalan Array
####
Dibagian sebelumnya, kita telah mendiskusikan bagaimana cara pendeklarasian berbagai macam variabel dengan menggunakan tipe data primitif. Dalam pendeklarasian variabel, kita sering menggunakan sebuah tipe data beserta nama variabel atau identifier yang unik, dimana untuk menggunakan variabel tersebut, kita akan memanggil dengan nama identifier-nya. 
 
Sebagai contoh, kita memiliki tiga variabel dengan tipe data int yang memiliki identifier yang berbeda untuk tiap variabel. 

       int number1; 
       int number2; 
       int number3; 
       number1 = 1; 
       number2 = 2; 
       number3 = 3; 
       
Seperti yang dapat Anda perhatikan pada contoh diatas, hanya untuk menginisialisasi dan menggunakan variabel terutama pada saat variabel-variabel tersebut memiliki tujuan yang sama, dirasa sangat membingungkan. Di Java maupun di bahasa pemrograman yang lain, mereka memiliki kemampuan untuk menggunakan satu variabel yang dapat menyimpan sebuah data list dan kemudian memanipulasinya dengan lebih efektif. Tipe variabel inilah yang disebut sebagai array. 

##### 7.3 Pendeklarasian Array 
####
Array harus dideklarasikan seperti layaknya sebuah variabel. Apabila Anda  mendeklarasikan array, Anda harus membuat sebuah list dari tipe data, yang diikuti oleh tanda kurung buka dan kurung tutup, yang diikuti oleh nama identifier. Sebagai contoh, 

       int []ages; 

atau Anda dapat menempatkan kurung buka dan kurung tutupnya setelah identifier. Sebagai contoh, 

       int ages[];

Setelah pendeklarasian, kita harus membuat array dan menentukan berapa panjangnya dengan sebuah konstruktor. Proses ini di Java disebut sebagai instantiation ( Kata dalam Java yang berarti membuat ). Untuk meng-instantiate sebuah obyek, kita  membutuhkan sebuah konstruktor. Kita akan membicarakan lagi mengenai instantiate obyek dan pembuatan konstruktor pada bagian selanjutnya. Perlu dicatat, bahwa ukuran dari array tidak dapat diubah setelah Anda menginisialisasinya

##### 7.4 Pengaksesan sebuah elemen array 
####
Untuk mengakses sebuah elemen dalam array, atau mengakses sebagian dari array,  Anda harus menggunakan sebuah nomor atau yang disebut sebagai index atau subscript. Sebuah nomor index atau subscript telah diberikan kepada tiap anggota array, sehingga program dan programmer dapat mengakses setiap value apabila dibutuhkan. Index selalu dalam integer. Dimulai dari nol, kemudian akan terus bertambah sampai list value dari array tersebut berakhir. Perlu dicatat, bahwa elemen-elemen didalam array dimulai dari 0 sampai dengan (ukuranArray-1).

       public class ArraySample{ 
            public static void main( String[] args ){ 
                 int[] ages = new int[100]; 
 
                 for( int i=0; i<100; i++ ){ 
                    System.out.print( ages[i] ); 
                 } 
            } 
        } 
        
##### 7.5 Panjang Array 
Untuk mengetahui berapa banyak element didalam sebuah array, Anda dapat  menggunakan length (panjang) field dalam array. Panjang field dalam array akan mengembalikan ukuran dari array itu sendiri. Sebagai contoh, arrayName.length Pada contoh sebelumnya, kita dapat menuliskannya kembali seperti berikut ini, 

        public class ArraySample 
        { 
            public static void main( String[] args ){ 
                 int[] ages = new int[100]; 
 
                 for( int i=0; i<ages.length; i++ ){ 
                    System.out.print( ages[i] ); 
                 } 
            } 
        }

##### 7.6 Array Multidimensi 
Array multidimensi diimplementasikan sebagai array didalam array. Array multidimensi dideklarasikan dengan menambahkan jumlah tanda kurung setelah nama array. Sebagai contoh, 
 
        // Elemen 512 x 128 dari integer array 
        int[][] twoD = new int[512][128]; 

        // karakter array 8 x 16 x 24 
        char[][][] threeD = new char[8][16][24]; 

        // String array 4 baris x 2 kolom 
        String[][] dogs = {{ "terry", "brown" }, 
                          { "Kristin", "white" }, 
                          { "toby", "gray"}, 
                          { "fido", "black"} 
                          }; 
                          
Untuk mengakses sebuah elemen didalam array multidimensi, sama saja dengan mengakses array satu dimensi. Misalnya saja, untuk mengakses element pertama dari baris pertama didalam array dogs, kita akan menulis, 

        System.out.print( dogs[0][0] ); 
        
Kode diatas akan mencetak String “terry” di layar. 

Thank you !

Pembuat
> Aatrisa Mulyati