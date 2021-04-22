package by.bylinay.trening.parking;

import java.text.ParseException;

public class Ñheque {
	private final long MILLISEKONDS_IN_HOUR = 3600000;
	public int numberTiket;
	public String typeCar;
	public int ibnCar;
	private String timeOn;
	private String timeOff;
	private int quantity;
	public int rateOfHour;
	public int price;
	private long finishTime;
	private long startTime;
	public String timeOffForCheck;

	public Ñheque(Ticket ticket, int rateOfHour) throws ParseException {

		this.timeOn = ticket.getTimeOn();
		this.timeOff = TimeUtil.getTimeMoment().getTimeFormat();
		this.rateOfHour = rateOfHour;
		this.numberTiket = ticket.getNumberSpeace();
		this.ibnCar = ticket.getIbnCar();
		this.finishTime = TimeUtil.getTimeMoment().getMilliseconds();
		this.startTime = ticket.getStartTime();
		this.quantity = timeCount();
		this.price = countRate();

	}

	Ñheque(Ticket ticket, int rateOfHour, int year, int mounth, int day, int hour, int minutes, int seconds,
			int milisek) throws ParseException {
		TimeUtil time = new TimeUtil();
		this.timeOn = ticket.getTimeOn();
		this.timeOff = time.getTimeCastem(year, mounth, day, hour, minutes, seconds, milisek).getTimeFormat();
		this.rateOfHour = rateOfHour;
		this.numberTiket = ticket.getNumberSpeace();
		this.ibnCar = ticket.getIbnCar();
		this.finishTime = time.getTimeCastem(year, mounth, day, hour, minutes, seconds, milisek).getMilliseconds();
		this.startTime = ticket.getStartTime();
		this.quantity = timeCount();
		this.price = countRate();

	}

	public int timeCount() {
		double difference = (double) (finishTime - startTime);
		double milisekonds = (double) MILLISEKONDS_IN_HOUR;

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

	public long getFinishTime() {
		return finishTime;
	}

	public void toPrintChecue() {
		System.out.printf(" \n %s \n %s %d \n %s %s \n %s %s \n %s %d \n %s %d  \n  %d ", " \\\\\\\\ÑHEQUE////",
				"IbnCar", getIbnCar(), "time on", getTimeOn(), "time off", getTimeOff(), "hours", timeCount(), "many",
				countRate(), getFinishTime());

	}
}