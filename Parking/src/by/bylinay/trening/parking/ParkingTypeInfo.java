package by.bylinay.trening.parking;

/**
 * 
 * class for describing parking
 * 
 * @author AlexBylinay
 *
 */
public class ParkingTypeInfo {
	


	TransportVehicleTypeEnum type;
	int quantityPlaces;
	int rentFfPlace;
	
	/**
	 * 
	 * @param type - Type of vehicles for this site
	 * @param quantityPlaces - the number of seats for this site
	 * @param rentFfPlace - rent for this site
	 */

	public ParkingTypeInfo(TransportVehicleTypeEnum type, int quantityPlaces, int rentFfPlace) {
		this.type = type;
		this.quantityPlaces = quantityPlaces;
		this.rentFfPlace = rentFfPlace;
	}

	public ParkingTypeInfo(int quantityPlaces, int rentFfPlace) {
		this.quantityPlaces = quantityPlaces;
		this.rentFfPlace = rentFfPlace;
	}

	public TransportVehicleTypeEnum getType() {
		return type;
	}

	public int getQuantityPlaces() {
		return quantityPlaces;
	}

	public int getRentFfPlace() {
		return rentFfPlace;
	}

}
