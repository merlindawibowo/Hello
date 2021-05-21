/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.merlin.guided3;

/**
 *
 * @author hp
 */
public class Item {
    // 1. atributes
    private String name;
    private int price;
    private String type;
    
    // 2. constructor
    public Item(String name, int price, String type) {
        this.name = name;
        this.price = price;
        this.type = type;
    }
    
    // 3. method
    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }
    
    public void showDetail() {
        System.out.println("- " + getName() + " (" + getType() + " ) - Rp " + getPrice());
    }
    
}
