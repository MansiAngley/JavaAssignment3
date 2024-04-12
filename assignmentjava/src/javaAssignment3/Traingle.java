/* 1. Write a program to print the area and perimeter of a triangle havingsides of
3, 4 and 5 units by creating a class named 'Triangle' with parameter initsconstructor.*/

package javaAssignment3;

import java.lang.Math;

class Triangle {
    float side1;
    float side2;
    float side3;

    // Constructor
    public Triangle(float side1, float side2, float side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
 // Method to calculate area using Heron's formula
    public double calculateArea() {
    	double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    // Method to calculate perimeter
    public float calculatePerimeter() {
        return side1 + side2 + side3;
    }

    

}
