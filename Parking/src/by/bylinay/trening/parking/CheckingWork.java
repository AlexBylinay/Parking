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

		Parking Òolorado = new Parking(typeParcking);

		Ticket ÒoloradoA = (Òolorado.park(ural));
		Ticket ÒoloradoB = Òolorado.park(r1);
		Ticket ÒoloradoC = Òolorado.park(japanis);
		Ticket ÒoloradoD = Òolorado.park(iS);
		Ticket ÒoloradoE = Òolorado.park(chizer);
		Ticket ÒoloradoH = Òolorado.park(volvlo);
		Ticket ÒoloradoI = Òolorado.park(yamaha);
		Ticket ÒoloradoJ = Òolorado.park(skania);
		Ticket ÒoloradoK = Òolorado.park(kitaec);

		ÒoloradoA.toPrintTicket();
		ÒoloradoB.toPrintTicket();
		ÒoloradoC.toPrintTicket();
		ÒoloradoD.toPrintTicket();
		ÒoloradoE.toPrintTicket();
		ÒoloradoI.toPrintTicket();
		ÒoloradoJ.toPrintTicket();
		ÒoloradoK.toPrintTicket();

		TransportVehicle car1 = Òolorado.pickUpCar(ÒoloradoD);
		car1.toPrintInfo();
		TransportVehicle bike1 = Òolorado.pickUpCar(ÒoloradoB);
		bike1.toPrintInfo();
		TransportVehicle track1 = Òolorado.pickUpCar(ÒoloradoH);
		track1.toPrintInfo();

		//—heque chek1 = Òolorado.pickUp—heque(ÒoloradoE);
		//chek1.toPrintChecue();
		—heque chek2 = Òolorado.pickUp—heque(ÒoloradoB);
		chek2.toPrintChecue();
		—heque chek3 = Òolorado.pickUp—heque(ÒoloradoH);
		chek3.toPrintChecue();
		TransportVehicle marck = new TransportVehicle(TransportVehicleTypeEnum.PASSANGERS, 1143);
		Ticket aÒoloradoN = (Òolorado.park(marck));
		aÒoloradoN.toPrintTicket();
		—heque chek5 = Òolorado.pickUp—hequeForChec(ÒoloradoB, TimeUtil.convertionInTime("2021.04.25|19:09:54"));
		chek5.toPrintChecue();
		—heque chek6 = Òolorado.pickUp—hequeForChec(ÒoloradoH,TimeUtil.convertionInTime ( "2021.04.25|19:59:54"));
		chek6.toPrintChecue();
		 System.out.println (ÒoloradoA.getStartTime());
	}

}