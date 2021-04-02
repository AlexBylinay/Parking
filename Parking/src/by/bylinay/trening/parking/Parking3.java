package by.bylinay.trening.parking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Parking3 {

	public int rateOfHour;
	public Map<TransportVehicleTypeEnum, TransportVehicle[]> parkingSpaces;
	public ParkingTypeInfo forBikes = new ParkingTypeInfo (null, 0, 0);
	public ParkingTypeInfo forPaxxangrCars  = new ParkingTypeInfo (null, 0, 0);
	public ParkingTypeInfo forTracks = new ParkingTypeInfo (null, 0, 0);
	List<ParkingTypeInfo> parkingValues = new ArrayList<ParkingTypeInfo>();

	public Parking3(List<ParkingTypeInfo> parkingValues) {
		List<TransportVehicle[]> allTypePparking = new ArrayList<TransportVehicle[]>();
	   this.parkingSpaces = fulling(parkingValues);
		
	}

	public Map<TransportVehicleTypeEnum, TransportVehicle[]> getParkingSpaces() {
		return parkingSpaces;
	}

	public List<Integer> maikingSizesParkingsDyfferentTyps(List<ParkingTypeInfo>parkingValues) {
		List<Integer> allTypsSize = new ArrayList<Integer>();
		for(int i = 0; i < parkingValues.size(); i++) {
		allTypsSize.add(i,parkingValues.get(i).getQuantityPlaces());
		}
		return allTypsSize;
	}
	
	
	
	public HashMap<TransportVehicleTypeEnum, TransportVehicle[]> fulling(List<ParkingTypeInfo>parkingValues) {
		HashMap parkingSpaces = new HashMap<TransportVehicleTypeEnum, TransportVehicle[]>();
		for (int i = 0; i <= TransportVehicleTypeEnum.getVallue().size() - 1; i++) {
			String name = TransportVehicleTypeEnum.getVallue().get(i).getTipe();
			TransportVehicleTypeEnum type = TransportVehicleTypeEnum.getVallue().get(i);
			TransportVehicle[] vehicle = new TransportVehicle[maikingSizesParkingsDyfferentTyps(parkingValues).get(i)];
			parkingSpaces.put(type, vehicle);
		}
		return parkingSpaces;
	}

	
	public Ticket park(TransportVehicle car) {
		Ticket ticret = new Ticket(car.getIbn(), giveParkingSpeaseNunber(car), getTipeParking(car));
		return ticret;
	}

	public int giveParkingSpeaseNunber(TransportVehicle car) {

		TransportVehicle[] parking = parkingSpaces.get(TransportVehicleTypeEnum.getValid(car.getType()));
		int num = findFreePlaceNum(parking);
		parking[num-1] = car;
		return num;
	}

	public String getTipeParking(TransportVehicle car) {
		return car.getType();
	}

	private int findFreePlaceNum(TransportVehicle[] parkingSpaces) {
		int num = 0;
		for (int i = 0; i < parkingSpaces.length; i++) {
			if (parkingSpaces[i] == null) {
				num = toNum(i);
			}

		}
		return num;
	}

	private int toNum(int index) {
		return index + 1;
	}

	private int toIndex(int num) {
		return num - 1;
	}

	public TransportVehicle pickUp(Ticket ticket) {
		TransportVehicle[] parking = parkingSpaces.get(TransportVehicleTypeEnum.getValid(ticket.getTypParking()));
		// TransportVehicle vehicle = ticket.getNumberSpeace().getTipeTransportVehicle(
		// ticket);
		TransportVehicle vehicle = parking[(ticket.getNumberSpeace()) - 1];
		parking[toIndex(ticket.getNumberSpeace())] = null;

		return vehicle;
	}

	public int getRent() {
		return rateOfHour;
	}
	/*
	 * public static List <TransportVehicleTypeEnum> getKey() {
	 * List<TransportVehicleTypeEnum> keys = new
	 * ArrayList<TransportVehicleTypeEnum>(); for ( TransportVehicleTypeEnum key1:
	 * parkingSpaces.keySet() ) { keys = (List<TransportVehicleTypeEnum>)
	 * parkingSpaces.keySet(); } return keys; }
	 * 
	 * 
	 * static int getNumberSpeace(TransportVehicle car) { return distribute(car); }
	 * 
	 * public static int distribute(TransportVehicle car) { int num = 0; String tipe
	 * = car.getType(); // TransportVehicleTypeÑefficients.getCefficient(tipe); ( if
	 * (TransportVehicleTypeÑefficients.getCefficient(tipe) == (float)
	 * INDEX_BIKE_PARKING) {
	 * 
	 * num = findFreePlaceNum(parkingSpacesForBikes); parkingSpacesForBikes[num - 1]
	 * = car;
	 * 
	 * }
	 * 
	 * if (TransportVehicleTypeÑefficients.getCefficient(tipe) ==
	 * INDEX_PASSANGERS_PARKING) { num =
	 * findFreePlaceNum(parkingSpacesForPassangersCars);
	 * parkingSpacesForPassangersCars[num - 1] = car;
	 * 
	 * } if (TransportVehicleTypeÑefficients.getCefficient(tipe) ==
	 * (float)INDEX_TRUCK_PARKING) { num = findFreePlaceNum(parkingSpacesForTrucks);
	 * parkingSpacesForTrucks[num - 1] = car;
	 * 
	 * } return num; }
	 * 
	 * 
	 * 
	 * 
	 * public static TransportVehicle pickUp(Ticket ticket) { int y = 0;
	 * //TransportVehicle vehicle =
	 * ticket.getNumberSpeace().getTipeTransportVehicle( ticket); TransportVehicle
	 * vehicle = getTipeTransportVehicle(ticket)[toIndex(ticket.getNumberSpeace())];
	 * // string type = ticket. return vehicle;
	 * 
	 * }
	 * 
	 * public static TransportVehicle[] getTipeTransportVehicle(Ticket ticet) {
	 * String type = ticet.getTypParking(); if ((boolean) (type == "bickeParking"))
	 * { return parkingSpacesForBikes; }
	 * 
	 * if ((boolean) (type == "passangerParking")) { return
	 * parkingSpacesForPassangersCars; }
	 * 
	 * if ((boolean) (type == "truckParking")) { return parkingSpacesForTrucks; }
	 * return null;
	 * 
	 * } public int getRent() { return rateOfHour; }
	 * 
	 * public static float getIndexTruckParking() { return INDEX_TRUCK_PARKING; }
	 * 
	 * public static float getIndexPassangersParking() { return
	 * INDEX_PASSANGERS_PARKING; }
	 * 
	 * public static float getIndexBikeParking() { return INDEX_BIKE_PARKING; }
	 */

}
