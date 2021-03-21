package by.bylinay.trening.parking;

public enum TransportVehicleType�efficients {

	BIKE("bike"), PASSANGERS("passanger's"), TRUCK("truck");

	public String tipe;

	TransportVehicleType�efficients(String tipe) {
		this.tipe = tipe;
	}


	public static boolean isValid(String tipe) {
		return fromCefficients(tipe) != null;
	}

	public static TransportVehicleType�efficients fromCefficients(String tipe) {
		for (TransportVehicleType�efficients val : values()) {
			if (tipe == val.tipe) {
				return val;
			}
		}
		return null;
	}

	public static float getCefficient(String tipe) {
		if (fromCefficients(tipe) == BIKE) {
			return (float) 0.7;
		}

		if (fromCefficients(tipe) == PASSANGERS) {
			return  1;
		}
		if (fromCefficients(tipe) == TRUCK) {
			return (float) 1.3;
		}
		return 0;
	}

}