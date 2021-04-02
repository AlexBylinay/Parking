package by.bylinay.trening.parking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Chek2 {
	
	
	public static void main( String arg[]) {
	List<ParkingTypeInfo> type = new ArrayList<ParkingTypeInfo>(TransportVehicleTypeEnum.getSize());
	ParkingTypeInfo a1 = new ParkingTypeInfo(null, 0, 0);
	ParkingTypeInfo a2 = new ParkingTypeInfo(null, 0, 0);
	ParkingTypeInfo a3 = new ParkingTypeInfo(null, 0, 0);
	type.add(a1);
	type.add(a2);
	type.add(a3);
	
	for(int i = 0; i < TransportVehicleTypeEnum.getSize(); i++) {
		ParkingTypeInfo k = type.get(i);
		k.setTypeTransportVehicle(TransportVehicleTypeEnum.getTyps().get(i));
		type.add(k);
		}
	
	a1.setQuantityPlaces(12);
	a2.setQuantityPlaces(15);
	a3.setQuantityPlaces(18);
	
	 System.out.println(a2.getTypeTransportVehicle());
	 System.out.println(TransportVehicleTypeEnum.getSize());
	 System.out.println(TransportVehicleTypeEnum.getTyps());
	
	TransportVehicle ural = new TransportVehicle("bike", 3536);
	TransportVehicle r1 = new TransportVehicle("bike", 7986);
	TransportVehicle japanis = new TransportVehicle("passanger's", 3456);
	TransportVehicle chizer = new TransportVehicle("passanger's", 9874);
	TransportVehicle iS = new TransportVehicle("passanger's", 6556);
	TransportVehicle skania = new TransportVehicle("truck", 3469);
	TransportVehicle kitaec = new TransportVehicle("truck", 9000);
	TransportVehicle volvlo = new TransportVehicle("truck", 5643);
	
	Parking2 minnesota = new Parking2(type);
	
	Ticket a = (minnesota.park(ural));
	Ticket b = minnesota.park(r1);
	Ticket c = minnesota.park(japanis);
	Ticket d = minnesota.park(iS);
	Ticket e = minnesota.park(chizer);
	Ticket f = minnesota.park(skania);
	Ticket h = minnesota.park(kitaec);
	Ticket g = minnesota.park(volvlo);
	
	a.toPrintTicket();
	b.toPrintTicket();
	c.toPrintTicket();
	d.toPrintTicket();
	e.toPrintTicket();;;
	f.toPrintTicket();
	h.toPrintTicket();
	g.toPrintTicket();
	TransportVehicle  u = minnesota.pickUp(e);
	u.toPrintInfo();

	
}

}