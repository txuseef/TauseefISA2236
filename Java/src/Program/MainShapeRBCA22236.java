package Program;

import java.text.DecimalFormat;

public class MainShapeRBCA22236 {
	    public static void main(String[] args) {
	        Circle circle = new Circle(5);
System.out.println("Circle - Area: " + formatDecimal(circle.calculateArea()) + ", Perimeter: " + formatDecimal(circle.calculatePerimeter()));

	
	        Triangle triangle = new Triangle(3, 4, 5);
	        System.out.println("Triangle - Area: " + formatDecimal(triangle.calculateArea()) + ", Perimeter: " + formatDecimal(triangle.calculatePerimeter()));
	    }

	    private static String formatDecimal(double value) {
	        DecimalFormat df = new DecimalFormat("#.##");
	        return df.format(value);
	    }
	}




