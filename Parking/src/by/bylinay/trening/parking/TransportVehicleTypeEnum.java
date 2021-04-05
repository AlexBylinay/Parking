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
		return getValid(tipe) != null;
	}

	public static TransportVehicleTypeEnum getValid(String tipe) {
		for (TransportVehicleTypeEnum val : values()) {
			if (tipe == val.tipe) {
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

	public static int getSize() {
		return getVallue().size();
	}


}