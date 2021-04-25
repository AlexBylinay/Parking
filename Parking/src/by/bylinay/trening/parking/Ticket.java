package by.bylinay.trening.parking;

import java.text.ParseException;
import java.time.LocalDateTime;

public class Ticket {
	public int ibnCar;
	public int numberParkingSpace;
	private String typParking;
	private String timeOn;
	private LocalDateTime startTime;

	public Ticket(TransportVehicle car, int numberParkingSpace) throws ParseException {
		this.ibnCar = car.getIbn();
		this.numberParkingSpace = numberParkingSpace;
		this.typParking = car.getTypeToString();
		this.startTime = LocalDateTime.now();
		this.timeOn = TimeUtil.convertionTimeMoment(startTime);

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

	public void toPrintTicket() {
		System.out.printf(" \n %s \n %s %d \n %s %d \n %s %s \n %s %s   ", "||||||TICKET||||||", "ibn Car",
				getIbnCar(), "number spase", getNumberSpeace(), "typ Parking", getTypParking(), "time", getTimeOn());
	}
}
