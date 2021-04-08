package by.bylinay.trening.parking;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Ticket {
	public int ibnCar;
	public int numberParkingSpace;
	public String typParking;
	public String timeOn;
	private long startTime;

	public Ticket(int ibnCar, int numberParkingSpace, String typParking) {
		this.ibnCar = ibnCar;
		this.numberParkingSpace = numberParkingSpace;
		this.typParking = typParking;
		this.timeOn = new SimpleDateFormat("yyyy/MM/dd_HH:mm:ss").format(Calendar.getInstance().getTime());
		this.startTime = System.currentTimeMillis();

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
		System.out.printf(" \n %s \n %s %d \n %s %d \n %s %s \n %s %s ", "оо|$|$|TICKET|$|$|оо", "ibn Car", getIbnCar(),
				"number spase", getNumberSpeace(), "typ Parking", getTypParking(), "time", getTimeOn());
	}
}
