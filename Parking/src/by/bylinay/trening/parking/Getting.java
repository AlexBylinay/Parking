package by.bylinay.trening.parking;

public class Getting {
	TransportVehicle transportVehicle;
	�heque cheque;

	Getting(TransportVehicle transportVehicle, �heque cheque) {
		this.transportVehicle = transportVehicle;
		this.cheque = cheque;

	}

	public TransportVehicle getTransportVehicle() {
		return transportVehicle;
	}

	public �heque getCheque() {
		return cheque;
	}
}
