package by.bylinay.trening.parking;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * the enum contains the types of vehicles: motorcycle, passanger's car, truck
 * the enum has methods for the check
 * 
 * @author AlexBylinay
 *
 */


public enum TransportVehicleTypeEnum {

	BIKE("bike"), PASSANGERS("passanger's"), TRUCK("truck");

	public String type;

	TransportVehicleTypeEnum(String type) {
		this.type = type;
	}

	public String getTipe() {
		return type;
	}

	public static boolean isValid(String tipe) {
		return getValid(tipe) != null;
	}

	public static TransportVehicleTypeEnum getValid(String tipe) {
		for (TransportVehicleTypeEnum val : values()) {
			if (tipe == val.type) {
				return val;
			}
		}
		return null;
	}

	public static List<TransportVehicleTypeEnum> getVallue() {
		List<TransportVehicleTypeEnum> values = new ArrayList<TransportVehicleTypeEnum>();
		for (TransportVehicleTypeEnum val : values()) {
			values.add(val);
		}
		return values;

	}

	public static List<String> getTyps() {
		List<String> type = new ArrayList<String>();

		for (TransportVehicleTypeEnum val : values()) {
			type.add(val.getTipe());
		}
		return type;
		
	}
	
	
	public static String getTypString(TransportVehicleTypeEnum tiper) {
   String type = null;
		 for (TransportVehicleTypeEnum val : values()) {
			if (val.type==tiper.getTipe()) {
				type= 	val.getTipe();
		}
		 }
		return type;
	}  
	
	
	public static int getSize() {
		return getVallue().size();
	}

}