package by.bylinay.trening.parking;

import java.util.ArrayList;
import java.util.List;

public class Chek {
	public static void main( String arg[]) {
		
		//ParkingTypeInfo a1 = new ParkingTypeInfo("bike", 9, 50);
		//ParkingTypeInfo a2 = new ParkingTypeInfo("passanger's", 7, 90);
		//ParkingTypeInfo a3 = new ParkingTypeInfo("truck", 6, 5);	
		
		List<ParkingTypeInfo> type = new ArrayList<ParkingTypeInfo>(TransportVehicleTypeEnum.getSize());
		ParkingTypeInfo a1 = new ParkingTypeInfo("bike", 12, 0);
		ParkingTypeInfo a2 = new ParkingTypeInfo("passanger's", 1, 0);
		ParkingTypeInfo a4 = new ParkingTypeInfo("truck", 14, 0);
		type.add(a1);
		type.add(a2);
		type.add(a4);
		/* a1.setQuantityPlaces(12);
		    a1.setRentFfPlace(8);
		    a2.setQuantityPlaces(12);
		    a2.setRentFfPlace(8);
		    a4.setQuantityPlaces(12);
		    a4.setRentFfPlace(8);
		type.add(a4);
		type.add(a2);
		type.add(a1);
	//	ParkingTypeInfo a1 = new ParkingTypeInfo(, 0, 0);
	//	ParkingTypeInfo a1 = new ParkingTypeInfo(null, 0, 0);
			//	ParkingTypeInfo a2 = new ParkingTypeInfo("passanger's", 7, 90);
			//	ParkingTypeInfo a3 = new ParkingTypeInfo("truck", 6, 5);
 //a1.setTypeTransportVehicle(TransportVehicleTypeEnum.getTyps().get(0));
//a1.setQuantityPlaces(8);				
//a1.setRentFfPlace(8);				
				
for(int i = 0; i < TransportVehicleTypeEnum.getSize(); i++) {
	
	ParkingTypeInfo k = type.get(i);
	k.setTypeTransportVehicle(TransportVehicleTypeEnum.getTyps().get(i));
	type.add(k);
	}
*/
   for(int i = 0; i < type.size(); i++)  {
	ParkingTypeInfo k = type.get(i);
	System.out.println(k.getTypeTransportVehicle());
	System.out.println(k.getQuantityPlaces());
    };
    System.out.println( type.size());
    
   Parking2 minnesota = new Parking2(type);
   // System.out.println(minnesota. maikingSizesParkingsDyfferentTyps(type).size());

   // for(int i = 0; i < minnesota. maikingSizesParkingsDyfferentTyps(type).size(); i++)  {
 	//int k =  minnesota. maikingSizesParkingsDyfferentTyps(type).get(i);
   // } 
    
    TransportVehicle ural = new TransportVehicle("bike", 3536);
	TransportVehicle r1 = new TransportVehicle("bike", 7986);
	TransportVehicle japanis = new TransportVehicle("passanger's", 3456);
	TransportVehicle chizer = new TransportVehicle("passanger's", 9874);
	TransportVehicle iS = new TransportVehicle("passanger's", 6556);
	TransportVehicle skania = new TransportVehicle("truck", 3469);
	TransportVehicle kitaec = new TransportVehicle("truck", 9000);
	TransportVehicle volvlo = new TransportVehicle("truck", 5643);

	Ticket a = (minnesota.park(ural));
	Ticket b = minnesota.park(r1);
	Ticket c = minnesota.park(japanis);
	Ticket d = minnesota.park(iS);
	Ticket e = minnesota.park(chizer);
	Ticket f = minnesota.park(skania);
	Ticket h = minnesota.park(kitaec);
	Ticket g = minnesota.park(volvlo);

		//System.out.println(a2.getQuantityPlacesforType(a2.getTypeTransportVehicle()));
				//System.out.println(TransportVehicleTypeEnum. getValid("passanger's").getTipe());

				//System.out.println(TransportVehicleTypeEnum.getTyps());
			//	System.out.println(type.);
				//System.out.println(a1.getQuantityPlaces());

		}

	}


