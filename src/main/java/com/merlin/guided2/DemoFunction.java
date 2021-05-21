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
public class DemoFunction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        drawTriangle(7);
        drawRectangle(5, 4);
    }

    public static void drawTriangle(int length) {
        // nested loop
        for (int i = 1; i <= length; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void drawRectangle(int height, int width) {
        // nested loop
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }
    
}
