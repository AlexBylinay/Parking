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

		TransportVehicle car1 = �olorado.pickUpCar(�oloradoD);
		car1.toPrintInfo();
		TransportVehicle bike1 = �olorado.pickUpCar(�oloradoB);
		bike1.toPrintInfo();
		TransportVehicle track1 = �olorado.pickUpCar(�oloradoH);
		track1.toPrintInfo();

		//�heque chek1 = �olorado.pickUp�heque(�oloradoE);
		//chek1.toPrintChecue();
		�heque chek2 = �olorado.pickUp�hequeForChec(�oloradoB, 2021, 4, 22, 17, 38, 35, 678);
		chek2.toPrintChecue();
		�heque chek3 = �olorado.pickUp�hequeForChec(�oloradoH, 2021, 4, 22, 17, 50, 35, 678);
		chek3.toPrintChecue();
		TransportVehicle marck = new TransportVehicle(TransportVehicleTypeEnum.PASSANGERS, 1143);
		Ticket a�oloradoN = (�olorado.park(marck));
		a�oloradoN.toPrintTicket();
	}

}


