package by.bylinay.trening.parking;
 
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Date;
 
public class TimeUtil {
    
    private static final DateFormat FORMAT = new SimpleDateFormat("yyyy/MM/dd_HH:mm:ss");
    // TODO разобратьс€ как это работает, и подготовитьс€ это рассказать и объ€снить
    public static synchronized String format (Date date) {
        return FORMAT.format(date);
    }
    public static synchronized Date parse (String formattedDate) throws ParseException{
        return FORMAT.parse(formattedDate);
        
    }
 
    
}