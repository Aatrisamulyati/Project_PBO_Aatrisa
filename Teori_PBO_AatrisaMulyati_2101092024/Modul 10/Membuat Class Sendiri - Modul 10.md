# Membuat Class Sendiri - Modul 10

##### 10.1 Tujuan.
####
Setelah kita mempelajari penggunaan class dari Java Class Library, kita akan mempelajari bagaimana menuliskan sebuah class sendiri. Pada bagian ini, untuk mempermudah pemahaman pembuatan class, kita akan membuat contoh class dimana akan ditambahkan beberapa data dan fungsi – fungsi lain. Kita akan membuat class yang mengandung informasi dari Siswa dan operasi – operasi yang dibutuhkan pada record siswa. Beberapa hal yang perlu diperhatikan pada syntax yang digunakan pada bab ini dan bagian lainnya : 
* (*) Menandakan bahwa terjadi lebih dari satu kejadian dimana elemen tersebut
diimplementasikan 
* <description> - Menandakan bahwa Anda harus memberikan nilai pasti pada bagian ini 
* [] - Indikasi bagian optional 

Pada akhir pembahasan, diharapkan siswa dapat : 
* Membuat kelas mereka sendiri 
* Mendeklarasikan atribut dan method pada class 
* Menggunakan referensi this untuk mengakses instance data 
* Membuat dan memanggil overloaded method 
* Mengimport dan membuat package 
* Menggunakan access modifiers untuk mengendalikan akses terhadap class member

##### 10.2 Mendefinisikan Class Anda 
####
Sebelum menulis class Anda, pertama pertimbangkan dimana Anda akan menggunakan class dan bagaimana class tersebut akan digunakan. Pertimbangkan pula nama yang tepat dan tuliskan seluruh informasi atau properti yang ingin Anda isi pada class. Jangan sampai terlupa untuk menuliskan secara urut method yang akan Anda gunakan dalam class. Dalam pendefinisian class, dituliskan : 

       <modifier> class <name> { 
           <attributeDeclaration>* 
           <constructorDeclaration>* 
           <methodDeclaration>* 
       }
       
##### 10.3 Deklarasi Atribut 
####
Dalam pendeklarasian atribut, kita tuliskan : 

       <modifier> <type> <name> [= <default_value>]; 
       
Langkah selanjutnya adalah mengurutkan atribut yang akan diisikan pada class. Untuk setiap informasi, urutkan juga tipe data yang yang tepat untuk digunakan. Contohnya, Anda tidak mungkin menginginkan untuk menggunakan tipe data integer untuk nama siswa, atau tipe data string pada nilai siswa. Berikut ini adalah contoh informasi yang akan diisikan pada class StudentRecord : 

       public class StudentRecord 
       { 
            private String name; 
            private String address; 
            private int age; 
            private double mathGrade; 
            private double englishGrade; 
            private double scienceGrade; 
            private double average; 
            //area penulisan kode selanjutnya 
       }
       
##### 10.4. Deklarasi Methods 
####
Sebelum kita membahas method apa yang akan dipakai pada class, mari kita perhatikan penulisan method secara umum. Dalam pendeklarasian method, kita tuliskan : 

       public class StudentRecord 
       { 
            private String name; 
            : 
            : 
            public double getAverage(){ 
                double result = 0; 
                result = ( mathGrade+englishGrade+scienceGrade )/3; 

                return result; 
            } 
        } 
        
##### 10.5. Referensi this 
####
Referensi this digunakan untuk mengakses instance variable yang dibiaskan oleh parameter. Untuk pemahaman lebih lanjut, mari kita perhatikan contoh pada method setAge. Asumsikan kita mempunyai kode deklarasi berikut pada method setAge. 

        public void setAge( int age ){ 
                age = age; //SALAH!!! 
        } 
        
##### 10.6. Overloading Methods 
Dalam class yang kita buat, kadangkala kita menginginkan untuk membuat method dengan nama yang sama namun mempunyai fungsi yang berbeda menurut parameter yang 
digunakan. Kemampuan ini dimungkinkan dalam pemrograman Java, dan dikenal sebagai overloading method. 

Overloading method mengijinkan sebuah method dengan nama yang sama namun memiliki parameter yang berbeda sehingga mempunyai implementasi dan return value yang berbeda pula. Daripada memberikan nama yang berbeda pada setiap pembuatan method, overloading method dapat digunakan pada operasi yang sama namun berbeda dalam implementasinya

        public static void main( String[] args ) 
        { 
                StudentRecord annaRecord = new StudentRecord(); 

                annaRecord.setName("Anna"); 
                annaRecord.setAddress("Philippines"); 
                annaRecord.setAge(15); 
                annaRecord.setMathGrade(80); 
                annaRecord.setEnglishGrade(95.5); 
                annaRecord.setScienceGrade(100); 

                //overloaded methods 
                annaRecord.print( annaRecord.getName() ); 
                annaRecord.print( annaRecord.getEnglishGrade(),             
                                  annaRecord.getMathGrade(), 
                                  annaRecord.getScienceGrade()); 
        } 
        
###### 10.7. Latihan
####
###### 10.7.1 Entry Buku Alamat 
Tugas Anda adalah membuat sebuah class yang memuat data-data pada buku alamat. 
Tabel berikut mendefinisikan informasi yang dimiliki oleh buku alamat.

Buat implementasi dari method sebagai berikut : 
1. Menyediakan accessor dan mutator method terhadap seluruh atribut 
2. Constructor 

###### 10.7.2 Buku Alamat 
Buat sebuah class buku alamat yang dapat menampung 100 data. Gunakan class yang telah dibuat pada nomor pertama. Anda harus mengimplementasikan method berikut pada buku alamat : 
1. Memasukkan data 
2. Menghapus data 
3. Menampilkan seluruh data 
4. Update data

Thank you !

Pembuat
> Aatrisa Mulyati