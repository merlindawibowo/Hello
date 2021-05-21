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
public class DemoScanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // input
        Scanner input = new Scanner(System.in);
       
        System.out.println("==> Edit Profile <==");
        System.out.println();

        System.out.print("Enter your name: ");
        String name = input.nextLine(); // nextLine() for String

        System.out.print("Enter your nickname ");
        char nickname = input.nextLine().charAt(0); // character

        System.out.print("Enter your age: ");
        int age = input.nextInt(); // nextInt() for int

        System.out.print("Enter your height: ");
        float height = input.nextFloat(); // nextFloat() for float

        System.out.println();
        System.out.println("==> My Profile <==");
        System.out.println();
        System.out.println("Name : " + name);
        System.out.println("Nickname : " + nickname);
        System.out.println("Age : " + age + " year");
        System.out.println("Height : " + height + "cm"); 

    }
    
}
