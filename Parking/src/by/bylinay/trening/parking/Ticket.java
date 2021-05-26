package by.bylinay.trening.parking;

import java.text.ParseException;
import java.time.LocalDateTime;
 /**
  * This class describes the ticket that will be issued after parking the car.
  *  class contains the fields:
  *  ibnCar -  unique car number
  *  numberParkingSpace - the number on which the car will be parked
  *  typParking - type parking space
  *   timeOn - string value of the time to output to the receipt
  *  startTime - start time of the cost calculation rent
  *  
  * @author AlexBylinay
  *
  */

public class Ticket {
	public int ibnCar;
	public int numberParkingSpace;
	private String typParking;
	private LocalDateTime startTime;
	private String timeOn;

	/**
	 *  accepts the parameters: car, numberParkingSpace. 
	 *  the field timeOn is calculated using the class TimeUtil
	 * 
	 */
	
	public Ticket(TransportVehicle car, int numberParkingSpace) throws ParseException {
		this.ibnCar = car.getIbn();
		this.numberParkingSpace = numberParkingSpace;
		this.typParking = car.getTypeToString();
		this.startTime = LocalDateTime.now();
		this.timeOn = TimeUtil.convertionTimeMoment(startTime);
	}
	
	
	/**
	 * 
	 * this constructor is used to check the operation of the program,
	 *  its field timeOn is not calculated, it entered manually
	 */
	 Ticket(TransportVehicle car, int numberParkingSpace, String time) throws ParseException {
		this.ibnCar = car.getIbn();
		this.numberParkingSpace = numberParkingSpace;
		this.typParking = car.getTypeToString();
		this.startTime = TimeUtil.convertionInTime(time);
		this.timeOn = time;
	}
	
	public int getIbnCar() {
		return ibnCar;
	}

	public int setIbnCar(int num) {
		ibnCar = num;
		return ibnCar;
	}

	public int getNumberSpeace() {
		return numberParkingSpace;
	}

	public String getTypParking() {
		return typParking;
	}

	public String getTimeOn() {
		return timeOn;
	}

	public LocalDateTime getStartTime() {
		return startTime;
	}

	/**
	 * Method for data output
	 */
    void toPrintTicket() {
		System.out.printf(" \n %s \n %s %d \n %s %d \n %s %s \n %s %s   ", "||||||TICKET||||||", "ibn Car",
				getIbnCar(), "number spase", getNumberSpeace(), "typ Parking", getTypParking(), "time", getTimeOn());
	}
}