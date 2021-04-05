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

		Parking �olorado = new Parking(typeParcking);

		Ticket a�oloradoA = (�olorado.park(ural));
		Ticket �oloradoB = �olorado.park(r1);
		Ticket �oloradoC = �olorado.park(japanis);
		Ticket �oloradoD = �olorado.park(iS);
		Ticket �oloradoE = �olorado.park(chizer);
		Ticket �oloradoH = �olorado.park(volvlo);
		Ticket �oloradoI = �olorado.park(yamaha);

		a�oloradoA.toPrintTicket();
		�oloradoB.toPrintTicket();
		�oloradoC.toPrintTicket();
		�oloradoD.toPrintTicket();
		�oloradoE.toPrintTicket();
		�oloradoI.toPrintTicket();

		TransportVehicle car2 = �olorado.pickUp(�oloradoE);
		car2.toPrintInfo();
		TransportVehicle bike2 = �olorado.pickUp(�oloradoB);
		bike2.toPrintInfo();
		TransportVehicle track2 = �olorado.pickUp(�oloradoH);
		track2.toPrintInfo();
		
		System.out.println( �olorado.getRent(�oloradoI));
		System.out.println( minnesota.getRent(minnesotaE));
		�heque chek1 = new �heque(�olorado, �oloradoI);
		chek1.toPrintChecue();
		�heque chek2 = new �heque(minnesota, minnesotaE);
		chek2.toPrintChecue();
		
	}
	

}