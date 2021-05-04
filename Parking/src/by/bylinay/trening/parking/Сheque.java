package by.bylinay.trening.parking;

import java.text.ParseException;
import java.time.LocalDateTime;


public class Ñheque {
	public int numberTiket;
	public String typeCar;
	public int ibnCar;
	private String timeOn;
	private String timeOff;
	private int quantity;
	public int rateOfHour;
	public int price;
	

	public Ñheque(Ticket ticket, int quantity,  int rateOfHour, int price, LocalDateTime moment) throws ParseException {

		this.rateOfHour = rateOfHour;
		this.timeOn = ticket.getTimeOn();
		this.timeOff = TimeUtil.convertionTimeMoment(moment);
		this.quantity = quantity;
		this.price = price;

	}

	
	public int getIbnCar() {
		return ibnCar;
	}

	public String getTimeOn() {
		return timeOn;
	}

	public String getTimeOff() {
		return timeOff;
	}

	public long getQuantity() {
		return quantity;
	}

	public int getRateOfHour() {
		return rateOfHour;
	}

	public int getRate() {
		return price;
	}
	
	
	public int getPrice() {
		return price;
	}

	public void toPrintChecue() {
		System.out.printf(" \n %s \n %s %d \n %s %s \n %s %s \n %s %d \n %s %d  %s  ", " \\\\\\\\ÑHEQUE////", "IbnCar",
				getIbnCar(), "time on", getTimeOn(), "time off", getTimeOff(), "hours", getQuantity(), "many",
				getPrice(), getTimeOff());

	}

	
}