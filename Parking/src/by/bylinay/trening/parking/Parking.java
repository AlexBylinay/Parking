package by.bylinay.trening.parking;

import java.text.ParseException;
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

	public Ticket park(TransportVehicle car) throws ParseException {
		Ticket ticret = new Ticket(car, giveParkingSpeaseNunber(car));
		return ticret;
	}

	public int giveParkingSpeaseNunber(TransportVehicle car) {
		TransportVehicle[] parking = parkingSpaces.get(TransportVehicleTypeEnum.getValid(car.getTypeToString()));
		int num = findFreePlaceNum(parking);
		parking[toIndex(num)] = car;
		return num;
	}

	public String getTipeParking(TransportVehicle car) {
		return car.getTypeToString ();
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

	public Getting pickUp(Ticket ticket) throws ParseException {
		TransportVehicle[] parking = parkingSpaces.get(TransportVehicleTypeEnum.getValid(ticket.getTypParking()));
		TransportVehicle vehicle = parking[toIndex(ticket.getNumberSpeace())];
		Ñheque cheque = new Ñheque(ticket, (getRent(ticket)));
		parking[toIndex(ticket.getNumberSpeace())] = null;
		Getting getting = new Getting(vehicle, cheque);
		return getting;
	}
	
	public Getting pickUpForCheck(Ticket ticket, int year, int mounth, int day, int hour, int minutes, int seconds, int milisek ) throws ParseException {
		TransportVehicle[] parking = parkingSpaces.get(TransportVehicleTypeEnum.getValid(ticket.getTypParking()));
		TransportVehicle vehicle = parking[toIndex(ticket.getNumberSpeace())];
		Ñheque cheque = new Ñheque(ticket, (getRent(ticket)), year,  mounth, day,  hour,minutes,  seconds, milisek);
		parking[toIndex(ticket.getNumberSpeace())] = null;
		Getting getting = new Getting(vehicle, cheque);
		return getting;
	}


	public TransportVehicle pickUpCar(Ticket ticket) throws ParseException {
		TransportVehicle vehicle = pickUp(ticket).getTransportVehicle();
		return vehicle;
	}

	public Ñheque pickUpÑheque(Ticket ticket) throws ParseException {
		Ñheque cheque = pickUp(ticket).getCheque();
		return cheque;
	}
	
	
	public Ñheque pickUpÑhequeForChec(Ticket ticket, int year, int mounth, int day, int hour, int minutes, int seconds, int milisek) throws ParseException {
		Ñheque cheque = pickUpForCheck(ticket,  year,  mounth, day,  hour,minutes,  seconds, milisek).getCheque();
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
