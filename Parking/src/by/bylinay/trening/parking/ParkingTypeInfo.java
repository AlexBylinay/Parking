package by.bylinay.trening.parking;

public class ParkingTypeInfo {

	TransportVehicleTypeEnum type;
	int quantityPlaces;
	int rentFfPlace;

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
