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

}