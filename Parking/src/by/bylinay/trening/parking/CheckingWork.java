package by.bylinay.trening.parking;

import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;

/**
 * Here, create objects of class and check the operation of the program in the
 * main() method
 * 
 * 
 * @author AlexBylinay
 * 
 */

public class CheckingWork {

	public static void main(String[] arg) throws ParseException {

		/**
		 * creating a map for parking
		 */

		Map<TransportVehicleTypeEnum, ParkingTypeInfo> typeParcking = new HashMap<TransportVehicleTypeEnum, ParkingTypeInfo>();
		typeParcking.put(TransportVehicleTypeEnum.PASSANGERS, new ParkingTypeInfo(15, 2));
		typeParcking.put(TransportVehicleTypeEnum.TRUCK, new ParkingTypeInfo(18, 3));
		typeParcking.put(TransportVehicleTypeEnum.BIKE, new ParkingTypeInfo(12, 1));

		/**
		 * creating objects of the class TransportVehicle
		 */

		TransportVehicle ural = new TransportVehicle(TransportVehicleTypeEnum.BIKE, 3536);
		TransportVehicle r1 = new TransportVehicle(TransportVehicleTypeEnum.BIKE, 7986);
		TransportVehicle japanis = new TransportVehicle(TransportVehicleTypeEnum.PASSANGERS, 3456);
		TransportVehicle chizer = new TransportVehicle(TransportVehicleTypeEnum.PASSANGERS, 9874);
		TransportVehicle iS = new TransportVehicle(TransportVehicleTypeEnum.PASSANGERS, 6556);
		TransportVehicle skania = new TransportVehicle(TransportVehicleTypeEnum.TRUCK, 3469);
		TransportVehicle kitaec = new TransportVehicle(TransportVehicleTypeEnum.TRUCK, 9000);
		TransportVehicle volvlo = new TransportVehicle(TransportVehicleTypeEnum.TRUCK, 5643);
		TransportVehicle yamaha = new TransportVehicle(TransportVehicleTypeEnum.BIKE, 3776);

		/**
		 * creating a parking
		 */

		Parking Òolorado = new Parking(typeParcking);

		Ticket ÒoloradoA = Òolorado.park(ural);
		Ticket ÒoloradoB = Òolorado.park(r1);
		Ticket ÒoloradoC = Òolorado.park(japanis);
		Ticket ÒoloradoD = Òolorado.park(iS);
		Ticket ÒoloradoE = Òolorado.park(chizer);
		Ticket ÒoloradoH = Òolorado.park(volvlo);
		Ticket ÒoloradoI = Òolorado.park(yamaha);
		Ticket ÒoloradoJ = Òolorado.park(skania);
		Ticket ÒoloradoK = Òolorado.park(kitaec);
		
		/**
		 * Creating objects of the Ticket, with a String time value, for check
		 */
		
		
		Ticket ÒoloradoAaChek = new Ticket(r1, 12 , "2021.05.16|11:05:36");
		Ticket ÒoloradoBbChek = new Ticket(chizer, 15, "2021.05.16|10:05:36");
		Ticket ÒoloradoCcChek = new Ticket(iS, 14,"2021.05.16|00:05:36");
		ÒoloradoA.toPrintTicket();
		ÒoloradoB.toPrintTicket();
		ÒoloradoC.toPrintTicket();
		ÒoloradoD.toPrintTicket();
		ÒoloradoE.toPrintTicket();
		ÒoloradoI.toPrintTicket();
		ÒoloradoJ.toPrintTicket();
		ÒoloradoK.toPrintTicket();

		TransportVehicle car1 = Òolorado.getCar(ÒoloradoD);
		car1.toPrintInfo();
		TransportVehicle bike1 = Òolorado.getCar(ÒoloradoB);
		bike1.toPrintInfo();
		TransportVehicle track1 = Òolorado.getCar(ÒoloradoH);
		track1.toPrintInfo();

		—heque chek1 = Òolorado.get—heque(ÒoloradoJ);
		chek1.toPrintChecue();
		—heque chek2 = Òolorado.get—heque(ÒoloradoB);
		chek2.toPrintChecue();
		—heque chek3 = Òolorado.get—heque(ÒoloradoH);
		chek3.toPrintChecue();
		—heque chek6 = Òolorado.get—heque(ÒoloradoAaChek);
		chek6.toPrintChecue();
		—heque chek7 = Òolorado.get—heque(ÒoloradoBbChek);
		chek7.toPrintChecue();
		—heque chek5 = Òolorado.get—heque(ÒoloradoCcChek);
		chek5.toPrintChecue();
		
		TransportVehicle marck = new TransportVehicle(TransportVehicleTypeEnum.PASSANGERS, 1143);
		Ticket aÒoloradoN = (Òolorado.park(marck));
		aÒoloradoN.toPrintTicket();
		
	
	}

}