package by.bylinay.trening.parking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CheckingWork {

	public static void main(String[] arg) {

		List<ParkingTypeInfo> type = new ArrayList<ParkingTypeInfo>();
		type.add(new ParkingTypeInfo(TransportVehicleTypeEnum.PASSANGERS, 15, 2));
		type.add(new ParkingTypeInfo(TransportVehicleTypeEnum.TRUCK, 18, 3));
		type.add(new ParkingTypeInfo(TransportVehicleTypeEnum.BIKE, 12, 1));

		Map typeParcking = new HashMap<TransportVehicleTypeEnum, ParkingTypeInfo>();
		typeParcking.put(TransportVehicleTypeEnum.PASSANGERS, new ParkingTypeInfo(15, 2));
		typeParcking.put(TransportVehicleTypeEnum.TRUCK, new ParkingTypeInfo(18, 3));
		typeParcking.put(TransportVehicleTypeEnum.BIKE, new ParkingTypeInfo(12, 1));

		TransportVehicle ural = new TransportVehicle("bike", 3536);
		TransportVehicle r1 = new TransportVehicle("bike", 7986);
		TransportVehicle japanis = new TransportVehicle("passanger's", 3456);
		TransportVehicle chizer = new TransportVehicle("passanger's", 9874);
		TransportVehicle iS = new TransportVehicle("passanger's", 6556);
		TransportVehicle skania = new TransportVehicle("truck", 3469);
		TransportVehicle kitaec = new TransportVehicle("truck", 9000);
		TransportVehicle volvlo = new TransportVehicle("truck", 5643);
		TransportVehicle yamaha= new TransportVehicle("bike", 3776);

		Parking minnesota = new Parking(type);

		Ticket minnesotaA = (minnesota.park(ural));
		Ticket minnesotaB = minnesota.park(r1);
		Ticket minnesotaC = minnesota.park(japanis);
		Ticket minnesotaD = minnesota.park(iS);
		Ticket minnesotaE = minnesota.park(chizer);
		Ticket minnesotaF = minnesota.park(skania);
		Ticket minnesotaG = minnesota.park(kitaec);
		Ticket minnesotaH = minnesota.park(volvlo);
		Ticket minnesotaI = minnesota.park(yamaha);
		
		minnesotaA.toPrintTicket();
		minnesotaB.toPrintTicket();
		minnesotaC.toPrintTicket();
		minnesotaD.toPrintTicket();
		minnesotaE.toPrintTicket();
		minnesotaF.toPrintTicket();
		minnesotaG.toPrintTicket();
		minnesotaH.toPrintTicket();
		minnesotaI.toPrintTicket();

		TransportVehicle car = minnesota.pickUp(minnesotaE);
		car.toPrintInfo();
		TransportVehicle bike = minnesota.pickUp(minnesotaB);
		bike.toPrintInfo();
		TransportVehicle track = minnesota.pickUp(minnesotaH);
		track.toPrintInfo();

		System.out.println(" \n\n \n !!! different parking's !!! \\n");

		Parking ñolorado = new Parking(typeParcking);

		Ticket añoloradoA = (ñolorado.park(ural));
		Ticket ñoloradoB = ñolorado.park(r1);
		Ticket ñoloradoC = ñolorado.park(japanis);
		Ticket ñoloradoD = ñolorado.park(iS);
		Ticket ñoloradoE = ñolorado.park(chizer);
		Ticket ñoloradoH = ñolorado.park(volvlo);
		Ticket ñoloradoI = ñolorado.park(yamaha);

		añoloradoA.toPrintTicket();
		ñoloradoB.toPrintTicket();
		ñoloradoC.toPrintTicket();
		ñoloradoD.toPrintTicket();
		ñoloradoE.toPrintTicket();
		ñoloradoI.toPrintTicket();

		TransportVehicle car2 = ñolorado.pickUp(ñoloradoE);
		car2.toPrintInfo();
		TransportVehicle bike2 = ñolorado.pickUp(ñoloradoB);
		bike2.toPrintInfo();
		TransportVehicle track2 = ñolorado.pickUp(ñoloradoH);
		track2.toPrintInfo();
		
		System.out.println( ñolorado.getRent(ñoloradoI));
		System.out.println( minnesota.getRent(minnesotaE));
		Ñheque chek1 = new Ñheque(ñolorado, ñoloradoI);
		chek1.toPrintChecue();
		Ñheque chek2 = new Ñheque(minnesota, minnesotaE);
		chek2.toPrintChecue();
		
	}
	

}