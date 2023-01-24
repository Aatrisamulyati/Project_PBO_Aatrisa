# Pewarisan, Polimorfisme, dan Interface  - Modul 11

##### 11.1 Tujuan.
####
Pada akhir pembelajaran ini, siswa harus mampu untuk: 
* Mendefinisikan superclasses dan subclasses 
* Override method dari superclasses 
* Membuat method final dan class final

##### 11.2 Pewarisan
####
Pewarisan adalah keuntungan besar dalam pemrograman berbasis object karena suatu sifat atau method didefinisikan dalam superclass, sifat ini secara otomatis diwariskan dari semua subclasses. Jadi, Anda dapat menuliskan kode method hanya sekali dan mereka dapat digunakan oleh semua subclass. Subclass hanya butuh mengimplementasikan perbedaannya sendiri dan induknya. 

###### 11.2.1 Mendefinisikan Superclass dan Subclass
####
       public class Person 
       { 
              protected String name; 
              protected String address; 
 
               /** 
               * Default constructor 
               */ 
               public Person(){ 
                      System.out.println(“Inside Person:Constructor”); 
                             name = ""; 
                             address = ""; 
               } 
 
               /** 
               * Constructor dengan dua parameter 
               */ 
               public Person( String name, String address ){ 
                      this.name = name; 
                      this.address = address; 
               } 
 
               /** 
               * Method accessor 
               */ 
               public String getName(){ 
                      return name; 
               } 
               
               public String getAddress(){ 
                      return address; 
               } 
 
               public void setName( String name ){ 
                      this.name = name; 
               } 
 
               public void setAddress( String add ){ 
                      this.address = add; 
               } 
       } 

##### 11.3 Polimorfisme
####
       public class Person 
       { 
               public String getName(){ 
                      System.out.println(“Person Name:” + name); 
                      return name; 
               } 
       } 
       public class Student extends Person 
       { 
               public String getName(){ 
                      System.out.println(“Student Name:” + name); 
                      return name; 
               } 
       } 
       public class Employee extends Person 
       { 
             public String getName(){ 
                   System.out.println(“Employee Name:” + name); 
                   return name; 
             }
        }
       
##### 11.4 Abstract Class 
####
 class abstract adalah class yang tidak dapat di-instantiate. Seringkali muncul di atas hirarki class pemrograman berbasis object, dan mendefinisikan keseluruhan aksi yang mungkin pada object dari seluruh subclasses dalam class.

      public abstract class LivingThing 
      { 
             public void breath(){ 
                   System.out.println("Living Thing breathing..."); 
             } 
             public void eat(){ 
                   System.out.println("Living Thing eating..."); 
             } 
            /** 
             * abstract method walk 
             * Kita ingin method ini di-overridden oleh subclasses 
             */ 
             public abstract void walk(); 
      }
        
##### 11.5 Interface
####
Interface adalah jenis khusus dari blok yang hanya berisi method signature(atau constant ). Interface mendefinisikan sebuah(signature) dari sebuah kumpulan method tanpa tubuh. Interface mendefinisikan sebuah cara standar dan umum dalam menetapkan sifat-sifat dari class-class. Mereka menyediakan class-class, tanpa memperhatikan lokasinya dalam hirarki class, untuk mengimplementasikan sifat-sifat yang umum. Dengan catatan bahwa interface-interface juga menunjukkan polimorfisme, dikarenakan program dapat memanggil method interface dan versi yang tepat dari method yang akan dieksekusi tergantung dari tipe object yang melewati pemanggil method interface.

##### 11.6 Latihan 
####
###### 11.6.1 Extend StudentRecord 
Dalam latihan ini, kita ingin untuk membuat catatan siswa yang lebih khusus yang berisi informasi tambahan tentang pengetahuan komputer siswa. Tugasnya adalah meng-extend class StudentRecord yang mengimplementasikan pelajaran sebelumnya. Cobalah untuk meng-override beberapa method yang ada dalam superclass StudentRecord, jika Anda benar-benar membutuhkannya. 

###### 11.6.2 Bentuk Abstract Class 
Cobalah untuk membuat class abstract yang dinamai Shape dengan method abstract  getArea() dan getName(). Tulis dua subclasses-nya yaitu Circle dan Square. Anda dapat menambahkan method tambahan ke dalam subclasses jika diinginkan.  


Thank you !

Pembuat
> Aatrisa Mulyati