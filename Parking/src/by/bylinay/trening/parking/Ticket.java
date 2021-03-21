package by.bylinay.trening.parking;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Ticket {
public static int ibnCar;
public static String timeOn;
private static long startTime;

public Ticket (int ibnCar) {
	this.ibnCar = ibnCar;
	this.timeOn = new SimpleDateFormat("yyyy/MM/dd_HH:mm:ss").format(Calendar.getInstance().getTime());
	this.startTime =  System.currentTimeMillis();
}


public static int getIbnCar() {
	return ibnCar;
}

public static int setIbnCar(int num) {
	ibnCar = num;
	return ibnCar;
}

public static String getTimeOn() {
	return timeOn;
}
public static long getStartTime() {
	return startTime;
}


}
