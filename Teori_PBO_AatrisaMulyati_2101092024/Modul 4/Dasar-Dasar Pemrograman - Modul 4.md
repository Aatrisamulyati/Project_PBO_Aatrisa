# Dasar-Dasar Pemrograman - Modul 4

##### 4.1 Tujuan.
####
Pada bagian ini, kita akan mendiskusikan mengenai bagian dasar pemrograman java. Kita akan memulai dengan mencoba menjelaskan bagian dasar dari program Hello.java yang telah diperkenalkan pada bab sebelumnya.Kita juga akan mendiskusikan beberapa pedoman cara menulis script atau petunjuk penulisan kode dalam penulisan program lebih efektif dan mudah dibaca. 
Pada akhir pembelajaran ini, pelajar seharusnya dapat : 
* Mengidentifikasi bagian dasar dari program java 
* Membedakan mana yang termasuk ke dalam java literals, tipe data dasar, tipe variabel, pengidentifikasian dan operator. 
* Mengembangkan program java sederhana menggunakan konsep pembelajaran pada bab ini. 
* Menganalisa program java pertama saya

##### 4.2  Menganalisa program Java pertama saya 
####
    
    public class Hello
    { 
        public static void main(String[] args) { 
            
            //menampilkan string”Hello world” pada screen 
            System.out.println("Hello world!");
        } 
    } 

##### 4.3. Komentar pada Java 
Komentar adalah catatan yang ditulis pada kode dengan tujuan sebagai bahan 
dokumentasi. teks ini bukan bagian dari program dan tidak mempengaruhi jalannya 
program. 
        
    Java mendukung tiga jenis komentar : C++ style komentar satu baris, C style beberapa baris, dan komentar javadoc khusus.
    
##### 4.3.1 Penulisan Komentar pada C++ 
komentar C++ Style diawali dengan //. Semua teks setelah // dianggap sebagai komentar. 
Sebagi contoh, 
       
       This is a C++ style or single line comments 
###### 4.3.2. Penulisan Komentar pada C 
Komentar C-style atau juga disebut komentar beberapa baris diawali dengan /* dan diakhiri dengan */. Semua teks yang ada diantara dua tanda tersebut dianggap sebagai komentar. Tidak seperti komentar C++ style, itu dapat menjangkau beberapa baris. Sebagai contoh, 
       
       /* this is an exmaple of a 
       C style or multiline comments */

###### 4.3.3. Komentar Khusus javadoc 
Komentar javadoc khusus digunakan untuk generatisasi dokumentasi HTML untuk program java anda. Anda dapat menciptakan komentar javadoc dengan memulai baris dengan /** dan mengakhirinya dengan */. Seperti Komentar C_style, ini dapat juga menjangkau beberapa baris. Ini juga dapat terdiri atas tag-tag untuk menambahkan lebih banyak informasi pada komentar anda. Sebagai contoh, 

      /** 
          This is an example of special java doc comments used for \n 
          generating an html documentation. It uses tags like: 
          @author Florence Balagtas 
          @version 1.2 
      */ 
      
###### 4.4. Pernyataan dalamJava dan Block 
pernyataan adalah satu atau lebih baris kode yang diakhiri dengan semicolon. sebagai contoh untuk pernyataan tunggal adalah 

      System.out.println(“Hello world”); 
     
Block adalah satu atau lebih pernyataan yang terbentang antara kurung kurawal buka dan kurung kurawal tutup yaitu sekumpulan pernyataan sebagai satu unit kesatuan. Block pernyataan dapat dikumpulkan akan tetapi tidak secara pasti mempunyai keterkaitan 
fungsi. beberapa jumlah spasi kosong diijinkan terdapat didalamnya, sebagai contoh dari suatu block adalah : 

      public static void main( String[] args ){ 
          System.out.println("Hello"); 
          System.out.println("world"); 
      }
      
##### 4.5. Java Identifier 
####
Java Identifier adalah suatu tanda yang mewakili nama-nama vaiabel, method, class dsb. Contoh dari pengidentifikasi adalah : Hello, main, System, out. 

Pendeklarasian Java adalah case-sensitive. Hal ini berarti bahwa pengidentifikasi : Hello tidak sama dengan hello. Pengidentifikasi harus dimulai dengan salah satu huruf, underscore “_”, atau tanda dollar “$”. Hurufnya dapat berupa huruf besar maupun huruf kecil. Karakter selanjutnya dapat menggunakan nomor 0 smpai 9. 

Pengidentifikasi tidak dapat menggunakan kata kunci dalam java seperti class, public, void, dsb. Selanjutnya kita akan berdiskusi lebih banyak tentang kata kunci dalam java.

##### 4.6. Java Literals 
####
Literals adalah tanda bahwa tidak terjadi perubahan atau konstan. Macam-macam literals dalam java adalah : Integer Literals, Floating-Point Literals, Boolean Literals, Character Literals dan String Literals.

###### 4.6.1. Literals Integer 
####
literals Integer dibedakan dalam beberapa format yang berbeda: desimal (berbasis 10), heksadesimal (berbasis 16), and oktal (berbasis 8). Dalam penggunaan tipe data integer pada program, kita harus mengikuti aturan penggunaan beberapa notasi khusus. 

Untuk angka desimal, kita tidak memerlukan notasi khusus. Kita hanya menulis angka desimal seperti apa adanya. untuk angka heksadesimal, hal itu harus ditandai oleh “0x” atau “0X”. untuk oktal, ditandai oleh“0”. 

Sebagai contoh, mewakili angka 12. penulisan dalam bentuk desimalnya adalah 12, 
Sementara dalam heksadesimal, menjdi 0xC, dan dalam oktal, nilai tersebut ekivalen dengan 014. Default tipe data untuk integer literals adalah int. Int ditandai dengan ditampilkannya dalam 32-bit. Pada kasus-kasus tertentu anda dapat berharap untuk memaksa integer literal untuk menjadi tipe data long dengan menambahkan karakter “l” or “L”. tipe data long ditandai oleh ditampilkannya data dalam 64-bit. Kita akan membahas mengenai tipe data pada kesempatan selanjutnya. 

###### 4.6.2. Floating-Point Literals 
####
Floating point literals mewakili bentuk desimal dengan bagian yang terpisah. Sebagai contoh adalah 3.1415. Floating point literals dapat dinyatakan dalam notasi standard atau scientific. Sebagai contoh, 583.45 dinyatakan dalam notasi standard, Sementara 5.8345e2 dinyatakan dalam notasi scientific. 
 
Default Floating point literals mempunyai tipe data double yang dinyatakan dalam 64-bit .Untuk menggunakan ketelitian yang lebih kecil (32-bit) float, hanya dengan menambahkan karakter “f” atau “F”.

###### 4.6.3. Boolean Literals 
#####
Boolean literals hanya memiliki dua nilai, true atau false.

###### 4.6.4. Character Literals 
Character Literals diwakili oleh karakter single Unicode. Karakter Unicode adalah 16-bit character set yang menggantikan 8-bit ASCII character set. Unicode memungkinkan pengunaan symbol dan karakter khusus dari bahasa lain. 

Untuk menggunakan character literal, karakter tersebut di dalam tanda single pute (' ') (single quote delimiters). Sebagai contoh huruf a, diwakili sebagai ‘a’. 

Untuk menggunakan karakter khusus seperti karakter baris baru, backslash digunakan diikuti dengan karakter kode. Sebagai contoh, ‘\n’ untuk karakter baris baru atau ganti baris, ‘\r’ untuk menyatakan nilai balik (carriage return), ‘\b’ untuk backspace. 

###### 4.6.5. String Literals 
String literals mewakili beberapa karakter dan dinyatakan dalam tanda double pute(“ ”)( double quotes). Sebagai contoh string literal adalah, “Hello World”. 

Thank you !

Pembuat
> Aatrisa Mulyati