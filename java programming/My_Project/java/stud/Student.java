/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stud;

/**
 *
 * @author LENOVO
 */
public class Student {
    
    private String roll_no;
    private String Chem;
    private String Phy;
    private String Math;

    public Student() {
    }

    public Student(String roll_no, String Chem, String Phy, String Math) {
        this.roll_no = roll_no;
        this.Chem = Chem;
        this.Phy = Phy;
        this.Math = Math;
    }

    public String getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(String roll_no) {
        this.roll_no = roll_no;
    }

    public String getChem() {
        return Chem;
    }

    public void setChem(String Chem) {
        this.Chem = Chem;
    }

    public String getPhy() {
        return Phy;
    }

    public void setPhy(String Phy) {
        this.Phy = Phy;
    }

    public String getMath() {
        return Math;
    }

    public void setMath(String Math) {
        this.Math = Math;
    }
    
    
    }

