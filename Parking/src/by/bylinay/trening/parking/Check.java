package by.bylinay.trening.parking;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Check {
	

	public static void main(String arg[]) {
		
		//check("bike");
		//String timeStamp = new SimpleDateFormat("yyyy/MM/dd_HH:mm:ss").format(Calendar.getInstance().getTime());
		//System.out.print(timeStamp);
		//System.out.print(isValid1("truck"));
		Ticket rt = new Ticket (0);
		System.out.print(rt.getTimeOn());
		//System.out.print(TransportVehicleType�efficients.getCefficient("truck"));
	}

	private static TransportVehicleType�efficients isValid1(String cmd) {
		return TransportVehicleType�efficients.fromCefficients(cmd);
	}

	private static void check(String tipe) {
		if (TransportVehicleType�efficients.isValid(tipe) == true) {
			
			if (TransportVehicleType�efficients.getCefficient(tipe) == (float) 0.7) {
				System.out.println("bike");
			}
			if (TransportVehicleType�efficients.getCefficient(tipe) == 1) {
				System.out.println("passanger's");
			}
			if (TransportVehicleType�efficients.getCefficient(tipe) ==(float) 1.3) {
				System.out.println("truck");
			}

		}
		else {System.out.println("date");}
	}
}