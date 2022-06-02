/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.wsu.main;

/**
 *
 * @author simba
 */
public class Circle {

    private double radius;
    private int x, y;

    public Circle(double r, int x, int y) {
        setRadius(r);
        this.x = x;
        this.y = y;
    }

    public Circle() {
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
        } else {
            throw new IllegalArgumentException("Radius cannot be less than zero");
        }
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double calculateArea() {
        return radius * radius * Math.PI;
    }

    public double calculateCircumference() {
        return 2 * radius * Math.PI;
    }

    public double calculateDiameter() {
        return radius * 2;
    }
}
