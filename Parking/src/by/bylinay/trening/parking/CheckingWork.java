package by.bylinay.trening.parking;

public class CheckingWork {
	public static void main(String[] arr) {

		
		Ticket ai = new  Ticket (0, 0, null);
		
		TransportVehicle iS = new TransportVehicle("passanger's", 8930);
		Parking minnesota = new Parking(4, 5, 4, 6);
		ai = (minnesota.park(iS));
		TransportVehicle r1 = new TransportVehicle("bike", 7986);
		Ticket b = minnesota.park(r1);
		Ñheque j= new Ñheque(ai, minnesota);
		j.toPrintChecue();
		
		TransportVehicle japanis = new TransportVehicle("passanger's", 3456);
		
		TransportVehicle chizer = new TransportVehicle("passanger's", 9874);
		TransportVehicle yamaha = new TransportVehicle("bike", 5665);
		
		TransportVehicle ural = new TransportVehicle("bike", 3536);
		//TransportVehicle skania = new TransportVehicle("truck", 3469);
		//TransportVehicle kitaec = new TransportVehicle("truck", 9000);
		//TransportVehicle volvlo = new TransportVehicle("truck", 5643);
		
	
		
		
				//(minnesota.park(ural));
		
		Ticket c = minnesota.park(japanis);
		Ticket d = minnesota.park(iS);
		Ticket e = minnesota.park(chizer);
		//Ticket f = minnesota.park(skania);
		//Ticket h = minnesota.park(kitaec);
		//Ticket g = minnesota.park(volvlo);
		
		Ñheque o= new Ñheque(b, minnesota);
		Ñheque y= new Ñheque(c, minnesota);
		Ñheque h= new Ñheque(d, minnesota);
		Ñheque i= new Ñheque(e, minnesota);
		o.toPrintChecue();
		y.toPrintChecue();
		h.toPrintChecue();
		i.toPrintChecue();
		
		
		ai.toPrintTicket();
		/*b.toPrintTicket();
		//c.toPrintTicket();
		d.toPrintTicket();
		e.toPrintTicket();
		f.toPrintTicket();
		h.toPrintTicket();
	//	g.toPrintTicket();*/
	}
}