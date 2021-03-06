package vn.lnquang.manage.student.model;

import java.util.Scanner;

public class Student extends Person {

    private int id;
    private double AverageScore;
    private String Email;
    static int count = 0;


    public Student() {
    }

    public Student(String Name, String Gender, String Birthday, String Address, double averageScore, String email) {
        super(Name, Gender, Birthday, Address);
        count++;
        this.id = count;
        AverageScore = averageScore;
        Email = email;
    }

    @Override
    public int getId() {
        return id;
    }

    public void setId(int Ma_sv) {
        this.id = Ma_sv;
    }

    public static Person createPerson(String Name, String Gender, String Birthday,
                                      String Address, double averageScore, String email) {
        Person result = new Student(Name, Gender, Birthday, Address, averageScore, email);
        return result;
    }

    public double getAverageScore() {
        return AverageScore;
    }

    public void setAverageScore(double Diem_tb) {
        this.AverageScore = Diem_tb;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public Student(int Ma_sv, double Diem_tb, String Email) {
        this.id = Ma_sv;
        this.AverageScore = Diem_tb;
        this.Email = Email;
    }
//    public String getName(){
//        return
//    }
    @Override
    public String toString() {
        return super.toString() + ", Student ID : " + id + ", AverageScore : " + AverageScore + ", Email=" + Email;
    }
}