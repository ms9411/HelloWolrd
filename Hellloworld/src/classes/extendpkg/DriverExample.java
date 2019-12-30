package classes.extendpkg;

public class DriverExample {
	public static void main(String[] args) {
		Driver driver = new Driver();
		Vehicle vehicle = new Vehicle();
		
		vehicle = new Bus();
		vehicle = new Truck();
		
		driver.driver(vehicle);
		
		Bus bus = new Bus();
		Truck truck = new Truck();
		driver.driver(bus);
		driver.driver(truck);
	}
}
