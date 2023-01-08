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
public class StudentRecord {
    private String name;
    private String address;
    private int age;
    private double mathGrade;
    private double englishGrade;
    private double scienceGrade;
    private double average;
    //area penulisan kode selanjutnya

    private static int studentCount;
    
    public StudentRecord(){
    //area inisialisasi kode;
        this("Alif","Padang",19);
        studentCount++;
    }
    public StudentRecord(String temp){
        this.name = temp;
        studentCount++;
    }
    public StudentRecord(String name, String address,int age){
        this.name = name;
        this.address = address;
        this.age=age;
        studentCount++;
    }
    public StudentRecord(double mGrade, double eGrade, double sGrade){
        mathGrade = mGrade;
        englishGrade = eGrade;
        scienceGrade = sGrade;
        studentCount++;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String address){
        this.address=address;
    }
    
    public int getAge(){
    return age;
    }

    public void setAge(int age){
        this.age=age;
    }
    
    public double getMathGrade(){
    return mathGrade;
    }

    public void setMathGrade(double mathGrade){
        this.mathGrade=mathGrade;
    }
    
    public double getEnglishGrade(){
    return englishGrade;
    }

    public void setEnglishGrade(double englishGrade){
        this.englishGrade=englishGrade;
    }
    
    public double getScienceGrade(){
    return scienceGrade;
    }

    public void setScienceGrade(double scienceGrade){
        this.scienceGrade=scienceGrade;
    }
    
    public double getAverage(){
        double ave;
        
        ave=((mathGrade+englishGrade+scienceGrade)/3);
        return ave;
    }
    
    public double getMax(){
        double max;
        max=mathGrade;
        
        max=(max>englishGrade)? max:englishGrade;
        max=(max>scienceGrade)? max:scienceGrade;
        //if(englishGrade>max){
          //  max=englishGrade;
        //}
        //if(scienceGrade>max){
          //  max=scienceGrade;
        //}
        
        return max;
    }
    
    public static int getStudentCount(){
        return studentCount;
    }
    
    public void print(String temp){
        System.out.println("Name: "+name);
        System.out.println("Address : "+address);
        System.out.println("Age: "+age);
    }
    
    public void print(double mGrade,double eGrade,double sGrade,double ave,double max){
        System.out.println("Nilai Mtk : "+mGrade);
        System.out.println("Nilai B.Inggris : "+eGrade);
        System.out.println("Nilai Pengetahuan : "+sGrade);
        System.out.println("Nilai Rata-Rata : "+ave);
        System.out.println("Nilai Max : "+max);
    }
}