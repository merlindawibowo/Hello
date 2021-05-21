/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.merlin.guided2;

/**
 *
 * @author hp
 */
public class Passed {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TestPass tp = new TestPass(50, 100);
        int number1 = 10;
        int number2 = 20;

        // Before pass by value
        System.out.println("Before pass by value");
        System.out.println("Number1: " + number1);
        System.out.println("Number2: " + number2);
        System.out.println();

        tp.calculate(number1, number2);

        // After pass by value
        System.out.println("After pass by value");
        System.out.println("Number1: " + number1);
        System.out.println("Number2: " + number2);
        System.out.println();

        // Before pass by reference
        System.out.println("Before pass by reference");
        System.out.println("Number1: " + tp.number1);
        System.out.println("Number2: " + tp.number2);
        System.out.println();

        tp.calculate(tp);

        // After pass by reference
        System.out.println("After pass by reference");
        System.out.println("Number1: " + tp.number1);
        System.out.println("Number2: " + tp.number2);

    }
    
}
