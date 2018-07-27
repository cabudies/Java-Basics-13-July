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
public class NewClass {
    int numberOfRows;
    int firstNumber;
    int secondNumber;
    
//    public NewClass(int numberOfRows) {
//        this.numberOfRows = numberOfRows;
//    }
    
    public NewClass(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }
    
    void asterikPattern() {
        for (int i=0; i<=numberOfRows; i++){
            for (int j=0; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    void numberPattern() {
        for (int i=1; i<=numberOfRows; i++){
            for (int j=1; j<=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
    void funAddition() {
        int thirdNumber = firstNumber + secondNumber;
        System.out.print("Sum of two numbers is: " + thirdNumber);
    }
    
}
