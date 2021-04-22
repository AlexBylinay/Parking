package by.bylinay.trening.parking;

public class DoerTimeMarckers {   private String TimeFormat;
private long milliseconds;

DoerTimeMarckers (String TimeFormat, long millisexonds){
  this.TimeFormat = TimeFormat;
  this.milliseconds  = millisexonds;
}
public String getTimeFormat() {
    return TimeFormat;
}
public long getMilliseconds() {
    return milliseconds;
}

}