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
public class Human {
    private String name;
    private int age;

    //constructor
    public Human() {
    }

    public Human(String name) {
        this.name = name;
    }
   
    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // method definition
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
}
