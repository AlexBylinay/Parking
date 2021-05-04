package by.bylinay.trening.parking;

import java.text.ParseException;
import java.util.HashMap;

import java.util.Map;

public class CheckingWork {

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

		Ticket �oloradoA = �olorado.park(ural);
		Ticket �oloradoB = �olorado.park(r1);
		Ticket �oloradoC = �olorado.park(japanis);
		Ticket �oloradoD = �olorado.park(iS);
		Ticket �oloradoE = �olorado.park(chizer);
		Ticket �oloradoH = �olorado.park(volvlo);
		Ticket �oloradoI = �olorado.park(yamaha);
		Ticket �oloradoJ = �olorado.park(skania);
		Ticket �oloradoK = �olorado.park(kitaec);
		Ticket �oloradoAaChek = new Ticket(r1, 12 , "2021.05.04|13:05:36");
		Ticket �oloradoBbChek = new Ticket(chizer, 15, "2021.05.04|12:05:36");
		Ticket �oloradoCcChek = new Ticket(iS, 14,"2021.05.03|00:05:36");
		�oloradoA.toPrintTicket();
		�oloradoB.toPrintTicket();
		�oloradoC.toPrintTicket();
		�oloradoD.toPrintTicket();
		�oloradoE.toPrintTicket();
		�oloradoI.toPrintTicket();
		�oloradoJ.toPrintTicket();
		�oloradoK.toPrintTicket();

		TransportVehicle car1 = �olorado.getCar(�oloradoD);
		car1.toPrintInfo();
		TransportVehicle bike1 = �olorado.getCar(�oloradoB);
		bike1.toPrintInfo();
		TransportVehicle track1 = �olorado.getCar(�oloradoH);
		track1.toPrintInfo();

		�heque chek1 = �olorado.get�heque(�oloradoJ);
		chek1.toPrintChecue();
		�heque chek2 = �olorado.get�heque(�oloradoB);
		chek2.toPrintChecue();
		�heque chek3 = �olorado.get�heque(�oloradoH);
		chek3.toPrintChecue();
		�heque chek6 = �olorado.get�heque(�oloradoAaChek);
		chek6.toPrintChecue();
		�heque chek7 = �olorado.get�heque(�oloradoBbChek);
		chek7.toPrintChecue();
		�heque chek5 = �olorado.get�heque(�oloradoCcChek);
		chek5.toPrintChecue();
		
		TransportVehicle marck = new TransportVehicle(TransportVehicleTypeEnum.PASSANGERS, 1143);
		Ticket a�oloradoN = (�olorado.park(marck));
		a�oloradoN.toPrintTicket();
		
	
	}

}