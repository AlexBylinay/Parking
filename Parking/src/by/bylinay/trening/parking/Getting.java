package by.bylinay.trening.parking;

public class Getting {
	TransportVehicle transportVehicle;
	Ñheque cheque;

	Getting(TransportVehicle transportVehicle, Ñheque cheque) {
		this.transportVehicle = transportVehicle;
		this.cheque = cheque;

	}

	public TransportVehicle getTransportVehicle() {
		return transportVehicle;
	}

	public Ñheque getCheque() {
		return cheque;
	}
}
