package Program;

public class StudentRBCA22236 {
	    private String name;
	    private int age1;
	    private String address;

	    // Constructor with default values
	    public StudentRBCA22236 () {
	        this.name = "Unknown";
	        this.age1 = 0;
	        this.address = "Not Available";
	    }

	    // Method to set name and age
	    public void setInfo(String name, int age) {
	        this.name = name;
	        this.age1 = age;
	    }

	    // Method to set name, age, and address
	    public void setInfo(String name, int age, String address) {
	        this.name = name;
	        this.age1 = age;
	        this.address = address;
	    }

	    // Method to print student information
	    public void printInfo() {
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age1);
	        System.out.println("Address: " + address);
	        System.out.println();
}
}



