package by.bylinay.trening.parking;

public class ParkingTypeInfo {
	
	String typeTransportVehicle;
	int quantityPlaces;
	int rentFfPlace;
	

	public ParkingTypeInfo(String typeTransportVehicle, int quantityPlaces, int rentFfPlace) {
		this.typeTransportVehicle = typeTransportVehicle;
		this.quantityPlaces = quantityPlaces;
		this.rentFfPlace = quantityPlaces;
	}

	public String getTypeTransportVehicle() {
		return typeTransportVehicle;
	}

	public void setTypeTransportVehicle(String typeTransportVehicle) {
		this.typeTransportVehicle = typeTransportVehicle;
	}

	public int getQuantityPlaces() {
		return quantityPlaces;
	}

	public void setQuantityPlaces(int quantityPlaces) {
		this.quantityPlaces = quantityPlaces;
	}

	public int getRentFfPlace() {
		return rentFfPlace;
	}

	public void setRentFfPlace(int rentFfPlace) {
		
		this.rentFfPlace = rentFfPlace;
	}
	public int getQuantityPlacesforType(String typeTransportVehicle) {
		int y =0;
		
		if (typeTransportVehicle == getTypeTransportVehicle()){
		y =	getQuantityPlaces() ; 
	}
		return y;
}
}