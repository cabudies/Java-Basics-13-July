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
public class NewClass1 extends NewClass{
    
    public NewClass1(int firstNumber, int secondNumber) {
        super(firstNumber, secondNumber);
    }
    
    @Override
    void funAddition() {
        int thirdNumber = firstNumber * secondNumber;
        System.out.print("Multiplication of numbers is: " + thirdNumber);
    }
    
}
