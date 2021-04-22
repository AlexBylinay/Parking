package by.bylinay.trening.parking;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

public class TimeUtil {
	static DateTimeFormatter Formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd|HH:mm:ss:SSS");
	
	public static DoerTimeMarckers getTimeMoment() {
		LocalDateTime time = LocalDateTime.now();
		return new DoerTimeMarckers(time.format(Formatter), time.atZone(ZoneOffset.UTC).toInstant().toEpochMilli());
	}

	public  DoerTimeMarckers getTimeCastem(int year, int mounth, int day, int hour, int minutes, int seconds,
			int milisek) {
		LocalDateTime time = LocalDateTime.of(year, mounth, day, hour, minutes, seconds, milisek);
		return new DoerTimeMarckers(time.format(Formatter), time.atZone(ZoneOffset.UTC).toInstant().toEpochMilli());
	}
}
