package by.bylinay.trening.parking;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class �heque {
	private final long MILLISEKONDS_IN_HOUR = 1;
	public int numberTiket;
	public  String typeCar;
	public  int ibnCar;
	public  String timeOn;
	public  String timeOff;
	public  int quantity;
	public  int rateOfHour;
	public  int rate;


	

	public �heque(Parking parking,Ticket ticket) {
		// this.ibnCar = ticket.getIbnCar();

		this.timeOn = ticket.getTimeOn();
		this.timeOff = new SimpleDateFormat("yyyy/MM/dd_HH:mm:ss").format(Calendar.getInstance().getTime());
		this.quantity = timeCount(ticket);
		this.rateOfHour = parking.getRent(ticket);
		//this.rate = calculationRote(ticket, parking);
		this.numberTiket = ticket.getNumberSpeace();
        this.ibnCar = (ticket).getIbnCar ();
	}

	public  int timeCount(Ticket ticket) {
		return (int) (System.currentTimeMillis() - (ticket.getStartTime()) / MILLISEKONDS_IN_HOUR);
	}

	public  int getNumberTiket() {
		return numberTiket;
	}


	public  int getIbnCar() {
		return ibnCar ;
	}

	public  String getTimeOn() {
		return timeOn;
	}


	public String getTimeOff() {
		return timeOff;
	}

	public  int getQuantity() {
		return quantity;
	}

	public  int getRateOfHour() {
		return rateOfHour;
	}

	public  int getRate() {
		return rate;
	}
	
	public  int countRate() {
		return quantity*rateOfHour;
	}
	
 public void toPrintChecue () {
		System.out.printf(" \n %s \n %s %d \n %s %s \n %s %s \n %s %d \n %s %d", " �*�*�*�HEQUE�*�*�*�", "IbnCar",
				getIbnCar(), "time on", getTimeOn(), "time off", getTimeOff(), "hours", getQuantity(), "many",
				countRate());

}
}