package by.bylinay.trening.parking;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Check {
	

	public static void main(String arg[]) {
		TransportVehicle riki = new TransportVehicle ("bike", 101);
		Ticket ticket = new Ticket(8, 9, null);
		Parking uu = new Parking(9, 6, 7, 8);
		Ticket tick = uu.park(riki);
		TransportVehicle ui =uu.pickUp(tick);
		 —heque jj= new  —heque(tick, uu);
		//System.out.print(uu.park(riki).getNumberSpeace());
		//System.out.print(uu.park(riki).getTypParking());
		//System.out.print(tick.getNumberSpeace());
		//System.out.print(ui.getIbn());
		uu.park(riki).getNumberSpeace();
		//System.out.printf (" %s %d \n %s %d", "hhjk",  —heque.calculationRote(uu.park(riki),uu), "hhjk", uu.getRent());
		//jj.toPrintChecue();
		ticket.toPrintTicket();
		
		//uu.getNumberSpeace(riki)
		
		//check("bike");
		//String timeStamp = new SimpleDateFormat("yyyy/MM/dd_HH:mm:ss").format(Calendar.getInstance().getTime());
		//System.out.print(timeStamp);
		//System.out.print(isValid1("truck"));
		//Ticket rt = new Ticket (0, 0);
		//System.out.print(rt.getTimeOn());
		//System.out.print(TransportVehicleType—efficients.getCefficient("truck"));
	}

	private static TransportVehicleTypeEnum isValid1(String cmd) {
		return TransportVehicleTypeEnum.fromCefficients(cmd);
	}

	private static void check(String tipe) {
		if (TransportVehicleTypeEnum.isValid(tipe) == true) {
			
			if (TransportVehicleTypeEnum.getCefficient(tipe) == (float) 0.7) {
				System.out.println("bike");
			}
			if (TransportVehicleTypeEnum.getCefficient(tipe) == 1) {
				System.out.println("passanger's");
			}
			if (TransportVehicleTypeEnum.getCefficient(tipe) ==(float) 1.3) {
				System.out.println("truck");
			}

		}
		else {System.out.println("date");}
	}
}