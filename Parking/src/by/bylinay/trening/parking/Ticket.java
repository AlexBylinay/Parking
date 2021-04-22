package by.bylinay.trening.parking;

import java.text.ParseException;

public class Ticket {
	public int ibnCar;
	public int numberParkingSpace;
	private String typParking;
	private String timeOn;
	private long startTime;

	public Ticket(TransportVehicle car, int numberParkingSpace) throws ParseException {
		this.ibnCar = car.getIbn();
		this.numberParkingSpace = numberParkingSpace;
		this.typParking = car.getTypeToString();
		this.timeOn = TimeUtil.getTimeMoment().getTimeFormat();
		this.startTime = TimeUtil.getTimeMoment().getMilliseconds();
		// this.startTime = System.currentTimeMillis();

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

	public long getStartTime() {
		return startTime;
	}

	public void toPrintTicket() {
		System.out.printf(" \n %s \n %s %d \n %s %d \n %s %s \n %s %s  \n  %d ", "||||||TICKET||||||", "ibn Car",
				getIbnCar(), "number spase", getNumberSpeace(), "typ Parking", getTypParking(), "time", getTimeOn(),
				getStartTime());
	}
}
