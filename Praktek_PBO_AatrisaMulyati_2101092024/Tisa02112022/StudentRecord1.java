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
public class StudentRecord1 {
    public static void main (String[] args) {
        StudentRecord student3 = new StudentRecord("Aatrisa", "Padang",20);
        student3.setAge(15);
        student3.print("");
        StudentRecord student4 = new StudentRecord();
        student4.print("");
        System.out.println("Jumlah Siswa :" + StudentRecord.getStudentCount());
    }
}
