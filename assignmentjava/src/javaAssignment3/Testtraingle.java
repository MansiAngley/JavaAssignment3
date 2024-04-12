package javaAssignment3;

public class Testtraingle {

	public static void main(String[] args) {
		// Create a triangle object with sides 3, 4, and 5 units
        Triangle triangle = new Triangle(3, 4, 5);

     // Calculate and print area
        double area = triangle.calculateArea();
        System.out.println("Area of the triangle: " + area);
        
        // Calculate and print perimeter
        double perimeter = triangle.calculatePerimeter();
        System.out.println("Perimeter of the triangle: " + perimeter);

        
    
	}

}
