/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.merlin.guided1;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class DemoIf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input a number: ");
        int num = input.nextInt();
        
        if(num > 0)
            System.out.println(num + " is positive!");
        else if(num < 0)
            System.out.println(num + " is negative!");
        else
            System.out.println(num + " is zero!");

    }
    
}
