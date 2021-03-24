package by.bylinay.trening.parking;

import java.util.Map;

public class Parking {

	// private static Map <Integer, TransportVehicle> allTransportVehicle;
	private static final float INDEX_BIKE_PARKING = (float) 0.7;
	private static final float INDEX_PASSANGERS_PARKING = 1;
	private static final float INDEX_TRUCK_PARKING = (float) 1.3;		
	public static TransportVehicle[] parkingSpacesForBikes;
	public static TransportVehicle[] parkingSpacesForPassangersCars;
	public static TransportVehicle[] parkingSpacesForTrucks;
	public static int rateOfHour;

	public Parking(int parkingSpacesForBikes, int parkingSpacesForPassangersCars, int parkingSpacesForTrucks,
			int rent) {
		this.parkingSpacesForBikes = new TransportVehicle[parkingSpacesForBikes+1];
		this.parkingSpacesForPassangersCars = new TransportVehicle[parkingSpacesForPassangersCars+1];
		this.parkingSpacesForTrucks = new TransportVehicle[parkingSpacesForTrucks+1];
		this.rateOfHour = rent;
	}

	public static Ticket park(TransportVehicle car) {
		Ticket ticret = new Ticket(car.getIbn(), getNumberSpeace(car), getTipeParking(car));
		return ticret;
	}

	static int getNumberSpeace(TransportVehicle car) {
		return distribute(car);
	}

	

	public static int distribute(TransportVehicle car) {
		int num = 0;
		String tipe = car.getType();
		// TransportVehicleTypeÑefficients.getCefficient(tipe);
		if (TransportVehicleTypeÑefficients.getCefficient(tipe) == (float) INDEX_BIKE_PARKING) {

			num = findFreePlaceNum(parkingSpacesForBikes);
			parkingSpacesForBikes[num - 1] = car;

		}

		if (TransportVehicleTypeÑefficients.getCefficient(tipe) == INDEX_PASSANGERS_PARKING) {
			num = findFreePlaceNum(parkingSpacesForPassangersCars);
			parkingSpacesForPassangersCars[num - 1] = car;

		}
		if (TransportVehicleTypeÑefficients.getCefficient(tipe) == (float)INDEX_TRUCK_PARKING) {
			num = findFreePlaceNum(parkingSpacesForTrucks);
			parkingSpacesForTrucks[num - 1] = car;

		}
		return num;
	}

	public static String getTipeParking(TransportVehicle car) {
		String type = null;
		String tipe = car.getType();
		// TransportVehicleTypeÑefficients.getCefficient(tipe);
		if (TransportVehicleTypeÑefficients.getCefficient(tipe) == (float) INDEX_BIKE_PARKING) {

			type = "bickeParking";

		}

		if (TransportVehicleTypeÑefficients.getCefficient(tipe) == INDEX_PASSANGERS_PARKING) {
			type = "passangerParking";

		}
		if (TransportVehicleTypeÑefficients.getCefficient(tipe) == (float) INDEX_TRUCK_PARKING) {
			type = "truckParking";

		}
		return type;
	}

	private static int findFreePlaceNum(TransportVehicle[] parkingSpaces) {
		int num = 0;
		for (int i = 0; i < parkingSpaces.length; i++) {
			if (parkingSpaces[i] == null) {
				num = toNum(i);
			}

		}
		return num;
	}

	private static int toNum(int index) {
		return index + 1;
	}

	private int toIndex(int num) {
		return num - 1;
	}

	public static TransportVehicle pickUp(Ticket ticket) {
		int y = 5;
		//TransportVehicle vehicle = ticket.getNumberSpeace().getTipeTransportVehicle( ticket);
		TransportVehicle vehicle = getTipeTransportVehicle(ticket)[ticket.getNumberSpeace()-1];
		// string type = ticket.
		return vehicle;
		
	}
		
		public static TransportVehicle[] getTipeTransportVehicle(Ticket ticet) {
		    String type = ticet.getTypParking();
			if ((boolean) (type == "bickeParking")) {
			return 	parkingSpacesForBikes;
			}
			
			if ((boolean) (type == "passangerParking")) {
				return 	parkingSpacesForPassangersCars;
				}
			
			if ((boolean) (type == "truckParking")) {
				return 	parkingSpacesForTrucks;
				}
			return null;	
			
	}
		public static int getRent() {
			return rateOfHour;
		}

		public static float getIndexTruckParking() {
			return INDEX_TRUCK_PARKING;
		}

		public static float getIndexPassangersParking() {
			return INDEX_PASSANGERS_PARKING;
		}

		public static float getIndexBikeParking() {
			return INDEX_BIKE_PARKING;
		}
}

