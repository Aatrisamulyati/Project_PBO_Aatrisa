# Bekerja dengan Java Class Library - Modul 9

##### 9.1 Tujuan.
####
Pada sesi ini, kita akan mengantarkan beberapa konsep dasar dari Object-Oriented objcts, dan Programming (OOP). Selanjutnya kita akan membahas konsep dari classes dan bagaimana menggunakan class dan anggotanya. Perubahan dan pemilihan object juga akan dibahas. Sekarang, kita akan focus dalam menggunakan class yang telah dijabarkan dalam Java Class library, kita akan membahas nanti tentang bagaimana membikin class anda sendiri. Pada akhir pelajaran, siswa seharusnya dapat : 
1. menjelaskan OOP dan beberapa konsepnya 
2. perbedaan antara class dan object 
3. pebedaan antara instance variables/method dan class (static) variable/method 
4. menjelaskan method apa dan bagaimana memanggil method parameter 
5. mengidentifikasi beberapa jangkauan dari sebuah variable 
6. memilih tipe data primitive dan object 
7. membandingkan objects dan menjabarkan class dari objects. 

##### 9.2 Pengenalan Pemrograman Berorientasi Object
####
SOOP berputar pada konsep dari object sebagai dasar element dari program anda. Ketika kita membandingkan dengan dunia nyata, kita dapat menemukan beberapa objek disekitar kita, seperti mobil, singa, manusia dan seterusnya. Object ini dikarakterisasi oleh sifat / attributnya dan tingkah lakunya. 

Contohnya, objek sebuah mobil mempunyai sifat tipe transmisi, warna dan manufaktur. Mempunyai kelakuan berbelok, mengerem dan berakselerasi. Dengan cara yang sama pula kita dapat mendefinisikan perbedaan sifat dan tingkah laku dari singa

##### 9.3 Class dan Object 
####
###### 9.3.1 Perbedaan Class dan Object 
####
Pada dunia software, sebuah objek adalah sebuah komponen software yang stukturnya mirip dengan objek pada dunia nyata. Setiap objek dibuat dari satu set data (sifat) dimana variable menjabarkan esensial karakter dari objek, dan juga terdiri dari satu set dari methode (tingkah laku) yang menjabarkan bagaimana tingkah laku dari objek. Jadi objek adalah sebuah berkas software dari variable dan method yg berhubungan. Variable dan methods dalam objek Java scara formal diketahui sebagai instance variable dan instance methods untuk membedakannya dari variable klas dan method klas, dimana akan dibahas kemudian. 

Klas adalah sturktur dasa dari OOP. Dia terdiri dari dua tipe dari anggota dimana disebut dengan field (attribut/properti) dan method. Field mespesifikasi tipe data yang didefinisikan oleh class, sementara methode spesifikasi dari operasi. Sebuah objek adalah sebuah instance pada class. 

###### 9.3.2 Instansiasi Class 
Untuk membuat sebuah objek atau sebuah instance pada sebuah kelas. Kita menggunakan operator baru

####### 9.3.3 Variabel Class dan Method 
Sebagai tambahan pada contoh variable, hal ini juga memungkinkan untuk mendefinisikan variable kelas, dimana variable milik dari seluruh kelas. Ini berarti bahwa memiliki nilai yang sama untuk semua objek pada kelas yang sama. Mereka juga disebut static member variables. 

##### 9.4 Method
####
###### 9.4.1 Apakah Method itu dan mengapa menggunakan Method? 
Sebuah method adalah bagian terpisah dari kode yang akan dipanggil oleh program utama dan beberapa method lainnya untuk menunjukkan beberapa fungsi spesifik. 

###### 9.4.2 Memanggil Instance dari Method dan Passing Variabel 
Sekarang kita ilustrasikan bagaimana memanggil method, mari kita menggunakan kelas string sebagai contoh. Anda dapat menggunakan the Java API documentation untuk melihat semua method dalam kelas string yang tersedia. Selanjutnya, kita akan membuat method kita sendiri. Tapi sekarang mari kita menggunakan apa yang tersedia. Untuk memanggil sebuah instance method, kita menuliskan : 

       nameOfObject.nameOfMethod( parameters ); 

Menggunakan method : 
       
       String str1 = "Hello"; 
       char x = str2.charAt(0); //will return the 
       character H 
                     //simpan pada variabel x 
       String str2 = "hello"; 
       //return boolean 
       boolean result = str1.equalsIgnoreCase( str1 );
       
###### 9.4.3 Memanggil Method Static 
method Static adalah cara yang dapat dipakai tanpa inisialisasi suatu class (maksudnya tanpa menggunakan kata kunci yang baru ), method static mempunyai class yang lengkap dan contoh yang tidak pasti (atau objek) dari suatu class. method static dibedakan dari contoh method di dalam suatu class oleh kata kunci static. Untuk memanggil method static, ketik, 

      Classname.staticMethodName(params);
      
Contoh dari static method yang digunakan : 

      //mencetak data pada layar
      System.out.println(“Hello world”);
      
      //convert string menjadi integer 
      int i = Integer.parseInt(“10”); 
      
      String hexEquivalent = Integer.toHexString( 10 );
####
###### 9.5 Casting, Converting dan Comparing Objects 
####
###### 9.5.1 Casting Tipe Primitiv 
Casting antara tipe primitve mendukung Anda untuk mengkonversikan sebuah value dari sebuah tipe data tertentu kepada tipe primitive yang lain. Hal ini biasanya terjadi diantara tipe data numerik. Ada sebuah tipe data primitive yang tetap tidak dapat kita casting, dan dia adalah tipe data boolean. Sebagai contoh dari typecasting adalah pada saat Anda menyimpan sebuah integer kepada sebuah variabel dengan tipe data double. Sebagai contoh: 

      int numInt = 10; 
      double numDouble = numInt; //implicit cast 
      

###### 9.5.2 Casting Objects 
Instances dari class-class juga dapat di pilih ke instance-instance dari class-class yang lain, dengan satu batasan: class-class sumber dan tujuan harus terhubung dengan mekanisme inheritance; satu class harus menjadi sebuah subclass terhadap class yang lain. kita akan akan menjelaskan mengenai inheritance pada kesempatan selanjutnya. 

Sejalan dengan pemilihan nilai primitive untuk tipe yang lebih besar, beberapa object mungkin tidak membutuhkan untuk dipilih secara explisit. Faktanya, karena sebuah semua subclass terdiri atas informasi yang sama, Anda dapat menggunakan instance dari subclass diamanpun sebuah superclass diharapkan berada. 

###### 9.5.3 Convert Tipe Primitive ke Object Dan Sebaliknya 
Satu hal yang tidak dapat Anda lakukan pada beberapa keadaan yaitu pemilihan dari sebuah objectke sebuah tipe data primitive, atau vice versa. Tipe-tipe primitive dan objectadalah sesuatu yang sangat berbeda dalam Java, dan Anda tidak bisa secara langsung memilih diantara dua atau saling menukar diantara keduanya.

###### 9.5.4 Menentukan Class dari sebuah Object 
Ingin menemukan apakah sebuah class object itu? Disini langkah untuk melakukannya untuk sebuah object yang diberikan sebagai kunci variabel : 
1. Method getClass() mengembalikan sebuah object Class (dimana Class itu sendiri 
merupakan sebuah class) yang memilki sebuah method yang disebut getName(). Pada 
bagiannya, getName() mengembalikan sebuah string yang mewakili nama class. 
Sebagai contoh, 

            String name = key.getClass().getName(); 
      
2. operator InstanceOf 
instanceOf memiliki dua operands: suatu mengarahke sebuah object pada sebelah kiri dan nama class pada sebelah kanan. pernyataan mengembalikan nilai true atau false tergantung pada apakah object adalah sebuah instance dari penamaan class atau beberapa dari subclass milik class tersebut. 
Sebagai contoh, 

            boolean ex1 = "Texas" instanceof String; // true 
            Object pt = new Point(10, 10); 
            boolean ex2 = pt instanceof String; // false 
            
##### 9.6 Latihan
####
###### 9.6.1 Mendefinisikan Istilah 
Dengan kata-kata Anda sendiri, definisikan istilah-istilah berikut ini : 
1. Class 
2. Object 
3. Instantiate 
4. Instance Variable 
5. Instance Method 
6. Class Variables atau static member variables 
7. Constructor 

###### 9.6.2 Java Scavanger Hunt 
Pipoy adalah suatu anggota baru dalam bahasa pemrograman Java. Dia hanya memperdengarkan bahwa telah ada APIs siap pakai dalam Java yang salah satunya dapat digunakan dalam program mereka, dan ia ingin sekali untuk mengusahakan mereka keluar. Masalahnya adalah, Pipoy tidak memiliki copy dari dokumentasi Java, dan dia juga tidak memiliki acces internet, jadi tidak ada jalan untuknya untuk menunjukkan Java APIs. Tugas Anda adalah untuk membantu Pipoy memperhatikan APIs (Application Programming Interface). Anda harus menyebutkan class dimana seharusnya method berada, deklarasi method dan penggunaan contoh yang dinyatakan method. Sebagai contoh, jika Pipoy ingin untuk mengetahui method yang mengknversisebuah String ke integer,jawaban Anda seharusnya menjadi: 
 
 
        Class: Integer 
        Method Declaration: public static int parseInt( String value ) 
        Sample Usage: 
               String strValue = "100"; 
               int value = Integer.parseInt( strValue ); 
yakinkan bahwa snippet dari kode yang Anda tulis dalam contoh Anda menggunakan compiles dan memberi output jawaban yang benar, jadi tidak membingungkan Pipoy. (Hint: Semua methods adalah dalam java.lang package). Dalam kasus dimana Anda dapat menemukan lebih banyak methods yang dapat menyelesaikan tugas, berikan hanya satu.

Thank you !

Pembuat
> Aatrisa Mulyati