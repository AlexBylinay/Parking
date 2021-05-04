package by.bylinay.trening.parking;

import java.text.ParseException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

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

	
	
	  public Getting pickUp(Ticket ticket) throws ParseException {
	        TransportVehicle[] parking = parkingSpaces.get(TransportVehicleTypeEnum.getValid(ticket.getTypParking()));
	        TransportVehicle vehicle = parking[toIndex(ticket.getNumberSpeace())];
	        parking[toIndex(ticket.getNumberSpeace())] = null;
	        LocalDateTime TimeThisMoment =  LocalDateTime.now();
	        int rent = rateOfHour.get(TransportVehicleTypeEnum.getValid(ticket.getTypParking()));
	        double difference = (double) Duration.between(ticket.getStartTime(), TimeThisMoment).toSeconds();
			double milisekonds = (double) TimeUtil.SEKONDS_IN_HOUR;
			 int timeCount = (int) Math.ceil(difference / milisekonds);
	        —heque cheque = new —heque(ticket, timeCount, rent, timeCount*rent, TimeThisMoment);
	        Getting getting = new Getting(vehicle, cheque);
	        return getting;
	    }
	  
	  
	  public TransportVehicle getCar(Ticket ticket) throws ParseException {
			TransportVehicle vehicle = pickUp(ticket).getTransportVehicle();
			return vehicle;
		}
	 
	
	  public —heque get—heque(Ticket ticket) throws ParseException {
			—heque cheque = pickUp(ticket).getCheque();
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

	
	

	/*public —heque get—heque(Ticket ticket) throws ParseException {
	return new —heque(ticket, timeCount(ticket), getPice(ticket), getRent(ticket), getmoment());
}

private int getRent(Ticket ticket) {
		return  rateOfHour.get(TransportVehicleTypeEnum.getValid(ticket.getTypParking()));
		}
	LocalDateTime getmoment() {
		return LocalDateTime.now();
	}

	private int timeCount(Ticket ticket) throws ParseException {
		double difference = (double) Duration.between(ticket.getStartTime(), getmoment()).toSeconds();
		double milisekonds = (double) TimeUtil.SEKONDS_IN_HOUR;
		return (int) Math.ceil(difference / milisekonds);
	}

	private int getPice(Ticket ticket) throws ParseException {
		return timeCount(ticket) * getRent(ticket);

	}
*/
	private int toNum(int index) {
		return index + 1;
	}

	private int toIndex(int num) {
		return num - 1;
	}
	
	
	
	
}