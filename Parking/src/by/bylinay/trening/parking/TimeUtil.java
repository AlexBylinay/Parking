package by.bylinay.trening.parking;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimeUtil {
	static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd|HH:mm:ss");
	public static String convertionTimeMoment(LocalDateTime time) {
		return (time.format(formatter));
	}
	
	public static LocalDateTime convertionInTime(String time) {
		return  LocalDateTime. parse (time, formatter);
	}

}

