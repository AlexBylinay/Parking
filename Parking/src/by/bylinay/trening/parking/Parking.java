package by.bylinay.trening.parking;

import java.text.ParseException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

/**
 * the most important class, it has methods that accept a Transport vehicle,
 * determine its type, put it in a parking space, give the owner a ticket with
 * information. There are also methods that accept the ticket and return the
 * ticket holder and the check with the information
 * 
 * @author AlexBylinay
 *
 */

public class Parking {

	private Map<TransportVehicleTypeEnum, TransportVehicle[]> parkingSpaces;
	private Map<TransportVehicleTypeEnum, Integer> rateOfHour;

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

	/**
	 * 
	 * the method accepts the vehicle and returns the ticket, and this method calls
	 * the method giveParkingSpaceNunber(car) that determines the parking space.
	 * 
	 * @param car
	 * @return ticret
	 * @throws ParseException
	 */
	public Ticket park(TransportVehicle car) throws ParseException {
		Ticket ticret = new Ticket(car, giveParkingSpaceNunber(car));
		return ticret;
	}

	private int giveParkingSpaceNunber(TransportVehicle car) {
		TransportVehicle[] parking = parkingSpaces.get(TransportVehicleTypeEnum.getValid(car.getTypeToString()));
		int num = findFreePlaceNum(parking);
		parking[toIndex(num)] = car;
		return num;
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

	/**
	 * This method accepts a ticket and returns an object of the class Getting that
	 * contains the vehicle and the receipt
	 * 
	 * @param ticket
	 * @return Getting
	 * @throws ParseException
	 */
	
	
	  public TransportVehicleCheque pickUp(Ticket ticket) throws ParseException {
	        TransportVehicle[] parking = parkingSpaces.get(TransportVehicleTypeEnum.getValid(ticket.getTypParking()));
	        TransportVehicle vehicle = parking[toIndex(ticket.getNumberSpeace())];
	        parking[toIndex(ticket.getNumberSpeace())] = null;
	        LocalDateTime TimeThisMoment =  LocalDateTime.now();
	        int rent = rateOfHour.get(TransportVehicleTypeEnum.getValid(ticket.getTypParking()));
	        double difference = (double) Duration.between(ticket.getStartTime(), TimeThisMoment).toSeconds();
			double milisekonds = (double) TimeUtil.SEKONDS_IN_HOUR;
			 int timeCount = (int) Math.ceil(difference / milisekonds);
	        Ñheque cheque = new Ñheque(ticket, timeCount, rent, timeCount*rent, TimeThisMoment);
	        TransportVehicleCheque getting = new TransportVehicleCheque(vehicle, cheque);
	        return getting;
	    }
	  
	  
	  public TransportVehicle getCar(Ticket ticket) throws ParseException {
			TransportVehicle vehicle = pickUp(ticket).getTransportVehicle();
			return vehicle;
		}
	 
	
	  public Ñheque getÑheque(Ticket ticket) throws ParseException {
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

	
	private int toNum(int index) {
		return index + 1;
	}

	private int toIndex(int num) {
		return num - 1;
	}
	
	
	
	
}