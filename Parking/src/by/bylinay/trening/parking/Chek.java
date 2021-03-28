package by.bylinay.trening.parking;

public class Chek {
	public static void main( String arg[]) {
		Parking o =  new  Parking(6, 7, 8, 8);
		
		System.out.println(o.fulling());
		for (TransportVehicleTypeEnum s : (TransportVehicleTypeEnum.getVallue())) {
		
			//System.out.println(s.getTipe());
				System.out.println(s);
				

		}

	}
}
		
	//	System.out.print(TransportVehicleType—efficients.fromCefficients2().size());
	
