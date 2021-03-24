package by.bylinay.trening.parking;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

 public class Ticket {
public static int ibnCar;
public static int numberParkingSpace;
public static String typParking;
public static String timeOn;
private static long startTime;


public Ticket (int ibnCar, int numberParkingSpace, String typParking) {
	this.ibnCar = ibnCar;
	this.numberParkingSpace = numberParkingSpace; 
	this.typParking = typParking;
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


public static int getNumberSpeace() {
	return numberParkingSpace;
}

public static String getTypParking() {
	return typParking;
}

public static String getTimeOn() {
	return timeOn;
}



public static long getStartTime() {
	return startTime;
}
static public void toPrintTicket (Ticket ticket) {
	System.out.printf (" %s %d \n %s %d \n %s %s \n %s %s ", "ibn Car", getIbnCar(), "number spase",  getNumberSpeace(),"typ Parking",getTypParking(), "time",getTimeOn());  
}
}
