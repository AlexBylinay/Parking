package by.bylinay.trening.parking;

import java.util.Map;

public class Parking {
	
	private static Map <Integer, TransportVehicle> allTransportVehicle;
	
	
	int parkingSpacesForBikes;
	public static int parkingSpacesForPassangersCars;
	public static int parkingSpacesForTrucks;
	public static int rateOfHour;

	public Parking(int parkingSpacesForBikes, int parkingSpacesForPassangersCars, int parkingSpacesForTrucks,
			int rent) {
		this.parkingSpacesForBikes = parkingSpacesForBikes;
		this.parkingSpacesForPassangersCars = parkingSpacesForPassangersCars;
		this.parkingSpacesForTrucks = parkingSpacesForTrucks;
		this.rateOfHour = rent;
	}

	public static Ticket park(TransportVehicle car) {
	
		allTransportVehicle.put(car.getIbn(), car);
		Ticket ticret = new Ticket(car.getIbn());
		return ticret;
	}

	public static TransportVehicle pickUp(Ticket ticket) {
		TransportVehicle car = allTransportVehicle.get(ticket.getIbnCar());
		return car;	
	}
	
	
}