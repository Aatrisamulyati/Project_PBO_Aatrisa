/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tisa02112022;

/**
 *
 * @author hp
 */
public class StudentRecordExample {
    public static void main(String[] args) {
        StudentRecord student1 = new StudentRecord();
        ///ini object
        student1.setName ("Aatrisa Mulyati");
        student1.setAddress ("Padang");
        student1.setAge (20);
        student1.setMathGrade (80);
        student1.setEnglishGrade (70);
        student1.setScienceGrade (90);
        
        ///tampilan
        
        System.out.println("Nama                : "+student1.getName());
        System.out.println("Alamat              : "+student1.getAddress());
        System.out.println("Umur                : "+student1.getAge());
        System.out.println("Matematika          : "+student1.getMathGrade ());
        System.out.println("B.inggris           : "+student1.getEnglishGrade());
        System.out.println("Sains               : "+student1.getScienceGrade());
        System.out.println("Nilai Tertinggi     : "+student1.getMax());
        
        System.out.println("----------------------------------------------------");
        StudentRecord student2 = new StudentRecord();
        student2.setName("Aatrisa");
        student2.setAddress("Padang");
        student2.setAge(18);
        student2.setMathGrade(70);
        student2.setEnglishGrade(90);
        student2.setScienceGrade(90);
        System.out.print("/n");
        student2.print("");
        student2.print(student2.getMathGrade(),student2.getEnglishGrade(),student2.getScienceGrade(),student2.getAverage(),+student2.getMax());
    }
}

