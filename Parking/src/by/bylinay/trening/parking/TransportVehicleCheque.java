package by.bylinay.trening.parking;

/**
 * 
 * @author AlexBylinay
 *This class contains data from two lasses: TransportVehicle and Cheque Classes. 
 * Object of this class  is needed to get both the objects TransportVehicle and the
 * Cheque from the method pickUp(Ticket ticket) in the Parking class at the same time
 *
 */

public class TransportVehicleCheque {
	
	
	TransportVehicle transportVehicle;
	Cheque cheque;


	TransportVehicleCheque(TransportVehicle transportVehicle, Cheque cheque) {
		this.transportVehicle = transportVehicle;
		this.cheque = cheque;
	}

	/**
	 *  
	 * @return object TransportVehicle
	 */
	public TransportVehicle getTransportVehicle() {
		return transportVehicle;
	}

	/**
	 * 
	 * @return object Cheque
	 */
	public Cheque getCheque() {
		return cheque;
	}
}