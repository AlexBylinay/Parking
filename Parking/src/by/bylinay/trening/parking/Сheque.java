package by.bylinay.trening.parking;

import java.text.ParseException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ñheque {
	private final long SEKONDS_IN_HOUR = 3600;
	public int numberTiket;
	public String typeCar;
	public int ibnCar;
	private String timeOn;
	private String timeOff;
	private int quantity;
	public int rateOfHour;
	public int price;
	private LocalDateTime finishTime;
	private LocalDateTime startTime;
	public String timeOffForCheck;

	public Ñheque(Ticket ticket, int rateOfHour) throws ParseException {

		this.rateOfHour = rateOfHour;
		this.numberTiket = ticket.getNumberSpeace();
		this.ibnCar = ticket.getIbnCar();
		this.finishTime = LocalDateTime.now();
		this.timeOn = ticket.getTimeOn();
		this.startTime = ticket.getStartTime();
		this.quantity = timeCount();
		this.timeOff = TimeUtil.convertionTimeMoment(finishTime);
		this.price = countRate();

	}

	Ñheque(Ticket ticket, LocalDateTime time, int rateOfHour)
	   throws ParseException {
		
	    this.rateOfHour = rateOfHour;
	    this.numberTiket = ticket.getNumberSpeace();
		this.ibnCar = ticket.getIbnCar();
		this.finishTime = time;
		this.timeOn = ticket.getTimeOn();
		this.startTime = ticket.getStartTime();
		this.quantity = timeCount();
		this.timeOff = TimeUtil.convertionTimeMoment(time);
		this.price = countRate();
	}

	public int timeCount() {
		double difference = (double) Duration.between(startTime, finishTime).toSeconds();
		double milisekonds = (double) SEKONDS_IN_HOUR;
		return (int) Math.ceil(difference / milisekonds);
	}

	public int getNumberTiket() {
		return numberTiket;
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

	public int countRate() {
		return timeCount() * rateOfHour;

	}

	public LocalDateTime getFinishTime() {
		return finishTime;
	}

	public void toPrintChecue() {
		System.out.printf(" \n %s \n %s %d \n %s %s \n %s %s \n %s %d \n %s %d  %s  ", " \\\\\\\\ÑHEQUE////", "IbnCar",
				getIbnCar(), "time on", getTimeOn(), "time off", getTimeOff(), "hours", timeCount(), "many",
				countRate(), getTimeOff());

	}
}