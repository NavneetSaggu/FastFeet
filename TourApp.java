package TourApp;

import java.util.ArrayList;

class Bicycle {
	private Boolean prepared;
	
	public Bicycle() {
		this.prepared = false;
	}

	public void prepare() {
		this.prepared = true;
	}
}

class Customer {
	private Boolean foodBought;
	
	public Customer() {
		this.foodBought = false;
	}

	public void buyFood() {
		this.foodBought = true;
	}
}

class Vehicle {
	private Boolean gassedUp;
	
	public Vehicle() {
		this.gassedUp = false;
	}

	public void gasUp() {
		this.gassedUp = true;
	}
}

interface Preparer {
	public void prepareTrip(Trip trip);
}

class Mechanic implements Preparer {
	public void prepareTrip(Trip trip) {
		ArrayList <Bicycle> bicycles = trip.getBicycles();
		for(Bicycle bicycle : bicycles) {
			bicycle.prepare();
		}
	}
}

class TripCoordinator implements Preparer {
	public void prepareTrip(Trip trip) {
		ArrayList <Customer> customers = trip.getCustomers();
		for(Customer customer : customers) {
			customer.buyFood();
		}
	}
}

class Driver implements Preparer {
	public void prepareTrip(Trip trip) {
		trip.getVehicle().gasUp();
	}
}


class Trip {
	private ArrayList <Bicycle> bicycles;
	private ArrayList <Customer> customers;
	private Vehicle vehicle;

	public Trip() {
		bicycles = new ArrayList<Bicycle>(2);
		customers = new ArrayList<Customer>(2);
		vehicle = new Vehicle(); 
	}

	public ArrayList <Bicycle> getBicycles() {
		return bicycles;
	}

	public ArrayList <Customer> getCustomers() {
		return customers;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void prepare(Preparer... preparers) {
		for(Preparer preparer : preparers) {
			preparer.prepareTrip(this);
		}
	}
}

public class TourApp {
	public static void main(String[] args) {
		Mechanic mechanic1 = new Mechanic();
		TripCoordinator tripCoordinator1 = new TripCoordinator();
		Driver driver1 = new Driver();
		Trip trip1 = new Trip();
		trip1.prepare(mechanic1, tripCoordinator1, driver1);
	}
}