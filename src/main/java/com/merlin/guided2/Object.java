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
public class Object {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // class with constructor no parameter
        Student stu1 = new Student();
        // class with constructor parameter
        Student stu2 = new Student("Andre", 19102099);

        // Output student1
        System.out.println("==> Student Data 1 <==");
        System.out.println("Name: " + stu1.name);
        System.out.println("ID: " + stu1.id);

        // Output student2
        System.out.println("==> Student Data 2 <==");
        System.out.println("Name: " + stu2.name);
        System.out.println("ID: " + stu2.id);
        System.out.println();

    }
    
}
