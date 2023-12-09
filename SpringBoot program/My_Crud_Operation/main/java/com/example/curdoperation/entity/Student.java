package com.example.curdoperation.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.springframework.stereotype.Component;

@Entity
@Table(name="studentinfo")
public class Student {
    @Id
    private int Rollno;
    private String Name;
    private String Address;
    private String City;

    public Student() { //default constuctor
    }
    public Student(int rollno, String name, String address, String city) { //parametarise constructor
        Rollno = rollno;
        Name = name;
        Address = address;
        City = city;
    }
    public void setRollno(int rollno) {
        Rollno = rollno;
    } //setter method
    public int getRollNo(){ return Rollno;} //getter method
    public String getName() {
        return Name;
    } //getter method
    public void setName(String name) {
        Name = name;
    } //setter method
    public String getAddress() {
        return Address;
    }  //getter method
    public void setAddress(String address) {
        Address = address;
    } //setter method
    public String getCity() {
        return City;
    }  //getter method
    public void setCity(String city) {
        City = city;
    } //setter method
}
