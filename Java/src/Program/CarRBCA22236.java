package Program;


	public class CarRBCA22236 extends VehicleRBCA22236 {
	    private String make;

	    public CarRBCA22236 (int horsepower, String make) {
	        super(horsepower);
	        this.make = make;
	    }

	    public void drive() {
	        super.drive();
	        System.out.println("Car is being driven");
	    }

	    public String getMake() {
	        return make;
	    }
	}



