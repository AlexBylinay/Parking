package by.bylinay.trening.parking;

public enum TransportVehicleTypeÑefficients {

	BIKE("bike"), PASSANGERS("passanger's"), TRUCK("truck");

	public String tipe;

	TransportVehicleTypeÑefficients(String tipe) {
		this.tipe = tipe;
	}


	public static boolean isValid(String tipe) {
		return fromCefficients(tipe) != null;
	}

	public static TransportVehicleTypeÑefficients fromCefficients(String tipe) {
		for (TransportVehicleTypeÑefficients val : values()) {
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