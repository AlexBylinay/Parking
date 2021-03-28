package by.bylinay.trening.parking;

import java.util.ArrayList;
import java.util.List;



public enum TransportVehicleTypeEnum {
	
	BIKE("bike"), PASSANGERS("passanger's"), TRUCK("truck");

	public String tipe;
	
	
	

	public String getTipe() {
		return tipe;
	}



	

	TransportVehicleTypeEnum(String tipe) {
		this.tipe = tipe;
	}
	
	

	public static boolean isValid(String tipe) {
		return fromCefficients(tipe) != null;
	}

	public static TransportVehicleTypeEnum fromCefficients(String tipe) {
		for (TransportVehicleTypeEnum val : values()) {
			if (tipe == val.tipe) {
				return val;
			}
		}
		return null;
	}

	
	public static float getCefficient(String tipe) {
		
		if (fromCefficients(tipe) == BIKE) {
			return (float) Parking.getIndexBikeParking();
		}

		if (fromCefficients(tipe) == PASSANGERS) {
			return  Parking.getIndexPassangersParking();
		}
		if (fromCefficients(tipe) == TRUCK) {
			return (float) Parking.getIndexTruckParking();
		}
		return 0;
	}

	
	
	public static List<TransportVehicleTypeEnum> getVallue() {
		List<TransportVehicleTypeEnum> typs = new ArrayList<TransportVehicleTypeEnum>();
	
		for (TransportVehicleTypeEnum val : values()) {
			typs.add(val);
			}
		return typs;
		
	}

}