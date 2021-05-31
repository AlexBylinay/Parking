package by.bylinay.trening.parking;

import java.text.ParseException;
import java.time.LocalDateTime;

/**
 * this class describes the receipt that will be issued after the ticket is
 * provided the receipt will show everything: the rate, the start and end time
 * of the parking lot, the time at the parking lot, the cost
 * 
 * @author AlexBylinay
 *
 */

public class Cheque {
	
	public int ibnCar;
	private String timeOn;
	private String timeOff;
	private int quantity;
	public int rateOfHour;
	public int price;
	

	public Cheque(Ticket ticket, int quantity,  int rateOfHour, int price, LocalDateTime moment) throws ParseException {
		this.ibnCar = ticket.getIbnCar();
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


	/**
	 * Method for data output
	 */
	
	public void toPrintChecue() {
		System.out.printf(" \n %s \n %s %d \n %s %s \n %s %s \n %s %d \n %s %d  %s  ", " \\\\\\\\�HEQUE////", "IbnCar",
				getIbnCar(), "time on", getTimeOn(), "time off", getTimeOff(), "hours", getQuantity(), "many",
				getPrice(), getTimeOff());

	}

	
}