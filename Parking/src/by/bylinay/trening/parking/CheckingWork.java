package by.bylinay.trening.parking;

public class CheckingWork {
	public static void main(String[] arr) {

		TransportVehicle ural = new TransportVehicle("bike", 3536);
		TransportVehicle yamaha = new TransportVehicle("bike", 5665);
		TransportVehicle r1 = new TransportVehicle("bike", 7986);
		TransportVehicle japanis = new TransportVehicle("passanger's", 3456);
		TransportVehicle iS = new TransportVehicle("passanger's", 8930);
		TransportVehicle chizer = new TransportVehicle("passanger's", 9874);
		TransportVehicle skania = new TransportVehicle("truck", 3469);
		//TransportVehicle kitaec = new TransportVehicle("truck", 9000);
		//TransportVehicle volvlo = new TransportVehicle("truck", 5643);
		Parking minnesota = new Parking(4, 4, 4, 6);
	
		Ticket ai = new  Ticket (0,0,null);
				//(minnesota.park(ural));
		/*Ticket b = minnesota.park(r1);
		Ticket c = minnesota.park(japanis);
		Ticket d = minnesota.park(iS);
		Ticket e = minnesota.park(chizer);
		Ticket f = minnesota.park(skania);
		Ticket h = minnesota.park(kitaec);
		//Ticket g = minnesota.park(volvlo);*/
		ai = minnesota.park(chizer);
		
		
		
		ai.toPrintTicket(ai);
		/*b.toPrintTicket();
		//c.toPrintTicket();
		d.toPrintTicket();
		e.toPrintTicket();
		f.toPrintTicket();
		h.toPrintTicket();
	//	g.toPrintTicket();*/
	}
}