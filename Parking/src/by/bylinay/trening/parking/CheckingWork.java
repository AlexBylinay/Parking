package by.bylinay.trening.parking;

public class CheckingWork {
	
	
	public static void main(String[] arr) {

		
		Ticket ai = new  Ticket (0, 0, null);
		

	
		
		TransportVehicle ural = new TransportVehicle("bike", 3536);
		TransportVehicle r1 = new TransportVehicle("bike", 7986);
		TransportVehicle japanis = new TransportVehicle("passanger's", 3456);
		TransportVehicle chizer = new TransportVehicle("passanger's", 9874);
		TransportVehicle iS = new TransportVehicle("passanger's", 6556);
		TransportVehicle skania = new TransportVehicle("truck", 3469);
		TransportVehicle kitaec = new TransportVehicle("truck", 9000);
		TransportVehicle volvlo = new TransportVehicle("truck", 5643);
		
		Parking minnesota = new Parking(9, 12, 15, 3);
	
		Ticket a = (minnesota.park(ural));
		Ticket b = minnesota.park(r1);
		Ticket c = minnesota.park(japanis);
		Ticket d = minnesota.park(iS);
		Ticket e = minnesota.park(chizer);
		Ticket f = minnesota.park(skania);
		Ticket h = minnesota.park(kitaec);
		Ticket g = minnesota.park(volvlo);
		
		/*
		�heque o= new �heque(b, minnesota);
		o.toPrintChecue();
		�heque y= new �heque(c, minnesota);
		�heque u= new �heque(d, minnesota);
		�heque i= new �heque(e, minnesota);
		�heque j= new �heque(ai, minnesota);
		j.toPrintChecue();
		
		y.toPrintChecue();
		u.toPrintChecue();
		i.toPrintChecue();
		*/
		�heque y= new �heque(c, minnesota);
		�heque u= new �heque(d, minnesota);
		�heque i= new �heque(e, minnesota);

		
		
		b.toPrintTicket();
		c.toPrintTicket();
		d.toPrintTicket();
		e.toPrintTicket();
		f.toPrintTicket();
		h.toPrintTicket();
		g.toPrintTicket();
		y.toPrintChecue();
		u.toPrintChecue();
		i.toPrintChecue();
	}
}