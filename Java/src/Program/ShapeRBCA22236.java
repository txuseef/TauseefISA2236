package Program;


	abstract class ShapeRBCA22236 {
	    public abstract double calculateArea();
	    public abstract double calculatePerimeter();
	}

	class Circle extends ShapeRBCA22236 {
	    private double radius;

	    public Circle(double radius) {
	        this.radius = radius;
	    }

	    public double calculateArea() {
	        return Math.PI * radius * radius;
	    }

	    public double calculatePerimeter() {
	        return 2 * Math.PI * radius;
	    }
	}

	class Triangle extends ShapeRBCA22236 {
	    private double side1, side2, side3;

	    public Triangle(double side1, double side2, double side3) {
	        this.side1 = side1;
	        this.side2 = side2;
	        this.side3 = side3;
	    }

	   public double calculateArea() {
	        double s = (side1 + side2 + side3) / 2;
	      return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
	    }

	    public double calculatePerimeter() {
	        return side1 + side2 + side3;
	    }
	}



