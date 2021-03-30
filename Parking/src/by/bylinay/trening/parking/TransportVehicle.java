package by.bylinay.trening.parking;

public class TransportVehicle {

	private   String type;
	private   int ibn;

	public TransportVehicle(String type, int ibn) {
		this.type = type;
		this.ibn = ibn;
	}

	public  String getType() {
		return type;
	}

	public  int getIbn() {
		return ibn;
	}

}