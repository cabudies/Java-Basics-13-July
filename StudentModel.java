/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication12;

/**
 *
 * @author JATINDER
 */
public class StudentModel {
    
    String studentName;
    String collegeName;
    long phoneNumber;
    
    public StudentModel() {
        
    }
    
    public StudentModel(String studentName, String collegeName, long phoneNumber) {
        this.studentName = studentName;
        this.collegeName = collegeName;
        this.phoneNumber = phoneNumber;
    }
    
}
