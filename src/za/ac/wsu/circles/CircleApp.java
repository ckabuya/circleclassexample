/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.wsu.circles;

import za.ac.wsu.main.Circle;

/**
 *
 * @author simba
 */
public class CircleApp {

    public static void main(String[] args) {
        Circle c1 = new Circle(2, 0, 0);
        System.out.println(" ===============Circle 1===============:");
        printCircleInfo(c1);
        Circle c2 = new Circle(4, 1, 1);
        System.out.println(" ===============Circle 2===============:");
        printCircleInfo(c2);
        Circle c3 = new Circle(6, 3, 3);
        System.out.println(" ===============Circle 3===============:");
        printCircleInfo(c3);
    }

    public static void printCircleInfo(Circle c) {
        System.out.println("Circle Info: Radius:" + c.getRadius() + " x :" + c.getX() + " y:" + c.getX());
        System.out.println("Calculation: Area:" + c.calculateArea() + " Circumference :" + c.calculateCircumference() + " Diameter:" + c.calculateDiameter());
    }
}
