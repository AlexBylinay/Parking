package by.bylinay.trening.parking;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Ñheque {
	private static final long MILLISEKONDS_IN_HOUR =  3600000;
	public static int numberTiket;
	public static String typeCar;
	public static int ibnCar;
	public static String timeOn;
	public static String timeOff;
	public static long quantityHours;
	public static int rateOfHour;
	public static int rate;
	
	
 public static void fillingChecue (Ticket ticket) {
	 ibnCar = ticket.getIbnCar();
	 timeOn = ticket.getTimeOn();
	 timeOff = new SimpleDateFormat("yyyy/MM/dd_HH:mm:ss").format(Calendar.getInstance().getTime());
	 quantityHours = (ticket.getStartTime() -  System.currentTimeMillis())/MILLISEKONDS_IN_HOUR;
	 
			 
 }


}
