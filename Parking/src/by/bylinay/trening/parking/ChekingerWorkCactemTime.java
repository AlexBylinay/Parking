package by.bylinay.trening.parking;

import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;

 class ChekingerWorkCactemTime {
	public static void main(String[] arg) throws ParseException {

		Map<TransportVehicleTypeEnum, ParkingTypeInfo> typeParcking = new HashMap<TransportVehicleTypeEnum, ParkingTypeInfo>();
		typeParcking.put(TransportVehicleTypeEnum.PASSANGERS, new ParkingTypeInfo(15, 2));
		typeParcking.put(TransportVehicleTypeEnum.TRUCK, new ParkingTypeInfo(18, 3));
		typeParcking.put(TransportVehicleTypeEnum.BIKE, new ParkingTypeInfo(12, 1));

		TransportVehicle ural = new TransportVehicle(TransportVehicleTypeEnum.BIKE, 3536);
		TransportVehicle r1 = new TransportVehicle(TransportVehicleTypeEnum.BIKE, 7986);
		TransportVehicle japanis = new TransportVehicle(TransportVehicleTypeEnum.PASSANGERS, 3456);
		TransportVehicle chizer = new TransportVehicle(TransportVehicleTypeEnum.PASSANGERS, 9874);
		TransportVehicle iS = new TransportVehicle(TransportVehicleTypeEnum.PASSANGERS, 6556);
		TransportVehicle skania = new TransportVehicle(TransportVehicleTypeEnum.TRUCK, 3469);
		TransportVehicle kitaec = new TransportVehicle(TransportVehicleTypeEnum.TRUCK, 9000);
		TransportVehicle volvlo = new TransportVehicle(TransportVehicleTypeEnum.TRUCK, 5643);
		TransportVehicle yamaha = new TransportVehicle(TransportVehicleTypeEnum.BIKE, 3776);

		Parking ñolorado = new Parking(typeParcking);

		Ticket añoloradoA = (ñolorado.park(ural));
		Ticket ñoloradoB = ñolorado.park(r1);
		Ticket ñoloradoC = ñolorado.park(japanis);
		Ticket ñoloradoD = ñolorado.park(iS);
		Ticket ñoloradoE = ñolorado.park(chizer);
		Ticket ñoloradoH = ñolorado.park(volvlo);
		Ticket ñoloradoI = ñolorado.park(yamaha);
		Ticket ñoloradoJ = ñolorado.park(skania);
		Ticket ñoloradoK = ñolorado.park(kitaec);

		añoloradoA.toPrintTicket();
		ñoloradoB.toPrintTicket();
		ñoloradoC.toPrintTicket();
		ñoloradoD.toPrintTicket();
		ñoloradoE.toPrintTicket();
		ñoloradoI.toPrintTicket();
		ñoloradoJ.toPrintTicket();
		ñoloradoK.toPrintTicket();

		TransportVehicle car1 = ñolorado.pickUpCar(ñoloradoD);
		car1.toPrintInfo();
		TransportVehicle bike1 = ñolorado.pickUpCar(ñoloradoB);
		bike1.toPrintInfo();
		TransportVehicle track1 = ñolorado.pickUpCar(ñoloradoH);
		track1.toPrintInfo();

		//Ñheque chek1 = ñolorado.pickUpÑheque(ñoloradoE);
		//chek1.toPrintChecue();
		Ñheque chek2 = ñolorado.pickUpÑhequeForChec(ñoloradoB, 2021, 4, 22, 17, 38, 35, 678);
		chek2.toPrintChecue();
		Ñheque chek3 = ñolorado.pickUpÑhequeForChec(ñoloradoH, 2021, 4, 22, 17, 50, 35, 678);
		chek3.toPrintChecue();
		TransportVehicle marck = new TransportVehicle(TransportVehicleTypeEnum.PASSANGERS, 1143);
		Ticket añoloradoN = (ñolorado.park(marck));
		añoloradoN.toPrintTicket();
	}

}


