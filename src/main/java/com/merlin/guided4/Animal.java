/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.merlin.guided4;

/**
 *
 * @author hp
 */
public class Animal { // parent
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    public String getType(){
        return "Unknown Animal";
    }

    public String playSound(){
        return "Error : Unknown animal type!";
    }

    public void showProfile(){
        System.out.println("Name: " + getName());
        System.out.println("Type: " + getType());
        System.out.println("Sound: " + playSound());
        System.out.println();
    }

    
}
