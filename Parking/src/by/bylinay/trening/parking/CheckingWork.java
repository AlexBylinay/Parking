package by.bylinay.trening.parking;

import java.util.HashMap;

import java.util.Map;

public class CheckingWork {

	public static void main(String[] arg) {

		Map<TransportVehicleTypeEnum, ParkingTypeInfo> typeParcking = new HashMap<TransportVehicleTypeEnum, ParkingTypeInfo>();
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
		TransportVehicle yamaha = new TransportVehicle("bike", 3776);

		Parking �olorado = new Parking(typeParcking);

		Ticket a�oloradoA = (�olorado.park(ural));
		Ticket �oloradoB = �olorado.park(r1);
		Ticket �oloradoC = �olorado.park(japanis);
		Ticket �oloradoD = �olorado.park(iS);
		Ticket �oloradoE = �olorado.park(chizer);
		Ticket �oloradoH = �olorado.park(volvlo);
		Ticket �oloradoI = �olorado.park(yamaha);
		Ticket �oloradoJ = �olorado.park(skania);
		Ticket �oloradoK = �olorado.park(kitaec);

		a�oloradoA.toPrintTicket();
		�oloradoB.toPrintTicket();
		�oloradoC.toPrintTicket();
		�oloradoD.toPrintTicket();
		�oloradoE.toPrintTicket();
		�oloradoI.toPrintTicket();
		�oloradoJ.toPrintTicket();
		�oloradoK.toPrintTicket();

		TransportVehicle car1 = �olorado.pickUpCar(�oloradoE);
		car1.toPrintInfo();
		TransportVehicle bike1 = �olorado.pickUpCar(�oloradoB);
		bike1.toPrintInfo();
		TransportVehicle track1 = �olorado.pickUpCar(�oloradoH);
		track1.toPrintInfo();

		�heque chek1 = �olorado.pickUp�heque(�oloradoE);
		chek1.toPrintChecue();
		�heque chek2 = �olorado.pickUp�heque(�oloradoB);
		chek2.toPrintChecue();
		�heque chek3 = �olorado.pickUp�heque(�oloradoH);
		chek3.toPrintChecue();
	}

}