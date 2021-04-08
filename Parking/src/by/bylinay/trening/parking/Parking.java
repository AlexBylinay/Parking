package by.bylinay.trening.parking;

import java.util.HashMap;
import java.util.Map;

public class Parking {

	public Map<TransportVehicleTypeEnum, TransportVehicle[]> parkingSpaces;
	public Map<TransportVehicleTypeEnum, Integer> rateOfHour;

	public Parking(Map<TransportVehicleTypeEnum, ParkingTypeInfo> parkingValues) {
		this.parkingSpaces = fulling(parkingValues);
		this.rateOfHour = getRent(parkingValues);
	}

	private Map<TransportVehicleTypeEnum, TransportVehicle[]> fulling(
			Map<TransportVehicleTypeEnum, ParkingTypeInfo> parkingValues) {
		parkingSpaces = new HashMap<TransportVehicleTypeEnum, TransportVehicle[]>();
		for (Map.Entry<TransportVehicleTypeEnum, ParkingTypeInfo> entry : parkingValues.entrySet()) {
			parkingSpaces.put(entry.getKey(), new TransportVehicle[entry.getValue().getQuantityPlaces()]);
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
		parking[toIndex(num)] = car;
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

	public Getting pickUp(Ticket ticket) {
		TransportVehicle[] parking = parkingSpaces.get(TransportVehicleTypeEnum.getValid(ticket.getTypParking()));
		TransportVehicle vehicle = parking[toIndex(ticket.getNumberSpeace())];
		Ñheque cheque = new Ñheque(ticket, (getRent(ticket)));
		parking[toIndex(ticket.getNumberSpeace())] = null;
		Getting getting = new Getting(vehicle, cheque);
		return getting;
	}

	public TransportVehicle pickUpCar(Ticket ticket) {
		TransportVehicle vehicle = pickUp(ticket).getTransportVehicle();
		return vehicle;
	}

	public Ñheque pickUpÑheque(Ticket ticket) {
		Ñheque cheque = pickUp(ticket).getCheque();
		return cheque;
	}

	private Map<TransportVehicleTypeEnum, Integer> getRent(
			Map<TransportVehicleTypeEnum, ParkingTypeInfo> parkingValues) {
		rateOfHour = new HashMap<TransportVehicleTypeEnum, Integer>();
		for (Map.Entry<TransportVehicleTypeEnum, ParkingTypeInfo> entry : parkingValues.entrySet()) {
			rateOfHour.put(entry.getKey(), entry.getValue().getRentFfPlace());
		}
		return rateOfHour;
	}

	public int getRent(Ticket ticket) {
		int rent = rateOfHour.get(TransportVehicleTypeEnum.getValid(ticket.getTypParking()));
		return rent;
	}

}
