package by.bylinay.trening.parking;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Ñheque {
	private final long MILLISEKONDS_IN_HOUR = 3600000;
	public int numberTiket;
	public String typeCar;
	public int ibnCar;
	public String timeOn;
	public String timeOff;
	public long quantity;
	public int rateOfHour;
	public int rate;
	public long finishTime;
	public long startTime;
	public String timeOffForCheck;

	public Ñheque(Ticket ticket, int rateOfHour) throws ParseException {

		timeOffForCheck = "2021/04/15_22:40:11";
		this.timeOn = ticket.getTimeOn();
		this.timeOff = TimeUtil.format(Calendar.getInstance().getTime());
		this.rateOfHour = rateOfHour;
		this.numberTiket = ticket.getNumberSpeace();
		this.ibnCar = ticket.getIbnCar();
		this.finishTime = TimeUtil.parse(timeOffForCheck).getTime();
		this.startTime = ticket.getStartTime();
	}

	public long timeCount() {
		return (finishTime - startTime) / MILLISEKONDS_IN_HOUR;
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
		return rate;
	}

	public long countRate() {
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