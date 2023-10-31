/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studdet;

import static java.lang.System.out;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import stud.Student;

/**
 *
 * @author LENOVO
 */
public class StudentDetail {
    Connection connection;
    public StudentDetail(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver"); 
             connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "@mile18hari");
        }catch (Exception e){
            System.out.println(e);
        }
    }
    public int insertRecord(Student student){
        int r=0;
        try{
           PreparedStatement preparedstatement = connection.prepareStatement("insert into marksdetail values(?,?,?,?,)");
            preparedstatement.setString(1, student.getRoll_no());
            preparedstatement.setString(2, student.getChem());
            preparedstatement.setString(3, student.getPhy());
            preparedstatement.setString(4, student.getMath());
           
             r=preparedstatement.executeUpdate();
            
        } 
        catch (Exception e) {
            System.out.println(e);
            }
  return r;
 }
}
