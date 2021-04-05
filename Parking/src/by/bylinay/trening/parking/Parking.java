package by.bylinay.trening.parking;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Parking {

	
	public Map<TransportVehicleTypeEnum, TransportVehicle[]> parkingSpaces;
	public Map<TransportVehicleTypeEnum, Integer > rateOfHour;
	
	public Parking(List<ParkingTypeInfo> parkingValues) {
		this.parkingSpaces = fullingForList(parkingValues);
		this.rateOfHour = getRentForList(parkingValues);
	}

	public Parking(Map<TransportVehicleTypeEnum, ParkingTypeInfo> parkingValues) {
		this.parkingSpaces = fullingForMap(parkingValues);
		this.rateOfHour = getRentForMap(parkingValues);
	}

	public Map<TransportVehicleTypeEnum, TransportVehicle[]> fullingForList(List<ParkingTypeInfo> parkingValues) {
		Map parkingSpaces = new HashMap<TransportVehicleTypeEnum, TransportVehicle[]>();
		for (ParkingTypeInfo typeInfo : parkingValues) {
			parkingSpaces.put(typeInfo.getType(), new TransportVehicle[typeInfo.getQuantityPlaces()]);
		}
		return parkingSpaces;
	}
	
	
	private Map<TransportVehicleTypeEnum, TransportVehicle[]> fullingForMap(
			Map<TransportVehicleTypeEnum, ParkingTypeInfo> parkingValues) {
		Map parkingSpaces = new HashMap<TransportVehicleTypeEnum, TransportVehicle[]>();
		for (Map.Entry<TransportVehicleTypeEnum, ParkingTypeInfo> buffer : parkingValues.entrySet()) {
			parkingSpaces.put(buffer.getKey(), new TransportVehicle[buffer.getValue().getQuantityPlaces()]);
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
		parking[toIndex(num) ] = car;
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
		TransportVehicle vehicle = parking[ toIndex(ticket.getNumberSpeace())];
		parking[toIndex(ticket.getNumberSpeace())] = null;
		return vehicle;
	}
	
	
	public Map<TransportVehicleTypeEnum, Integer> getRentForList(List<ParkingTypeInfo> parkingValues) {
		Map rateOfHour = new HashMap<TransportVehicleTypeEnum, TransportVehicle[]>();
		for (ParkingTypeInfo typeInfo : parkingValues) {
			rateOfHour.put(typeInfo.getType(), typeInfo.getRentFfPlace());
		}
		return rateOfHour;
	}
	
	
	private Map<TransportVehicleTypeEnum, Integer> getRentForMap(
			Map<TransportVehicleTypeEnum, ParkingTypeInfo> parkingValues) {
		Map rateOfHour = new HashMap<TransportVehicleTypeEnum, Integer>();
		for (Map.Entry<TransportVehicleTypeEnum, ParkingTypeInfo> buffer : parkingValues.entrySet()) {
			rateOfHour.put(buffer.getKey(),buffer.getValue().getRentFfPlace());
		}
		return rateOfHour;
	}
	

	public int getRent(Ticket ticket) {
	int rent = rateOfHour.get(TransportVehicleTypeEnum.getValid(ticket.getTypParking()));
		return rent;
	}
	
}
