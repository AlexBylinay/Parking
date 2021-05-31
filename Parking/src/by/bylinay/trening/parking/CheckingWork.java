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

		Parking kolorado = new Parking(typeParcking);

		Ticket koloradoA = kolorado.park(ural);
		Ticket koloradoB = kolorado.park(r1);
		Ticket koloradoC = kolorado.park(japanis);
		Ticket koloradoD = kolorado.park(iS);
		Ticket koloradoE = kolorado.park(chizer);
		Ticket koloradoH = kolorado.park(volvlo);
		Ticket koloradoI = kolorado.park(yamaha);
		Ticket koloradoJ = kolorado.park(skania);
		Ticket koloradoK = kolorado.park(kitaec);
		
		/**
		 * Creating objects of the Ticket, with a String time value, for check
		 */
		
		
		Ticket koloradoAaChek = new Ticket(r1, 12 , "2021.05.16|11:05:36");
		Ticket koloradoBbChek = new Ticket(chizer, 15, "2021.05.16|10:05:36");
		Ticket koloradoCcChek = new Ticket(iS, 14,"2021.05.16|00:05:36");
		koloradoA.toPrintTicket();
		koloradoB.toPrintTicket();
		koloradoC.toPrintTicket();
		koloradoD.toPrintTicket();
		koloradoE.toPrintTicket();
		koloradoI.toPrintTicket();
		koloradoJ.toPrintTicket();
		koloradoK.toPrintTicket();

		TransportVehicle car1 = kolorado.getCar(koloradoD);
		car1.toPrintInfo();
		TransportVehicle bike1 = kolorado.getCar(koloradoB);
		bike1.toPrintInfo();
		TransportVehicle track1 = kolorado.getCar(koloradoH);
		track1.toPrintInfo();

		Cheque chek1 = kolorado.getCheque(koloradoJ);
		chek1.toPrintChecue();
		Cheque chek2 = kolorado.getCheque(koloradoB);
		chek2.toPrintChecue();
		Cheque chek3 = kolorado.getCheque(koloradoH);
		chek3.toPrintChecue();
		Cheque chek6 = kolorado.getCheque(koloradoAaChek);
		chek6.toPrintChecue();
		Cheque chek7 = kolorado.getCheque(koloradoBbChek);
		chek7.toPrintChecue();
		Cheque chek5 = kolorado.getCheque(koloradoCcChek);
		chek5.toPrintChecue();
		
		TransportVehicle marck = new TransportVehicle(TransportVehicleTypeEnum.PASSANGERS, 1143);
		Ticket aKoloradoN = (kolorado.park(marck));
		aKoloradoN.toPrintTicket();
		
	
	}

}