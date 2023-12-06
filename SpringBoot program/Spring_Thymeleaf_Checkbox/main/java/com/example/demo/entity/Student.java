package com.example.demo.entity;

public class Student {
    private int rollno;
    private String address;
    private String city;
    private String name;

    public Student() {
    }
    public Student(int rollno,String address,String city,String name) {
        this.rollno=rollno;
        this.address=address;
        this.city = city;
        this.name = name;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}



