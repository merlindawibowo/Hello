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
public class Main1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Object constructor
        Animal animal = new Animal("An animal");
        Cat cat = new Cat("Lucas");
        Dog dog = new Dog("Sebastian");
        Rabbit rabbit = new Rabbit("Mina");

        // Outputs
        animal.showProfile();
        cat.showProfile();
        dog.showProfile();
        rabbit.showProfile();

    }
    
}
