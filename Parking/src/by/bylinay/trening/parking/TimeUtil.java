package by.bylinay.trening.parking;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * 
 * @author AlexBylinay
 * This class is used to calculate the time of others in the program classes.
 *
 */

public class TimeUtil {
	/**
	 * this variable is used to calculate the hourly rate 
	 * in the Parking class
	 */
	static final int SEKONDS_IN_HOUR = 3600;
	
	static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd|HH:mm:ss");
	public static String convertionTimeMoment(LocalDateTime time) {
		return (time.format(formatter));
	}
	
	/**
	 * 
	 * @param time
	 * @return  LocalDateTime
	 * this method will be used to check the correctness of the program calculation.
	 *  It allows you to drive different date and time values
	 */
	public static LocalDateTime convertionInTime(String time) {
		return  LocalDateTime. parse (time, formatter);
	}

}
