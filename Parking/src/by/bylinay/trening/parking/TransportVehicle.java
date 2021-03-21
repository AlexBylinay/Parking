package by.bylinay.trening.parking;

public class TransportVehicle {

	private static String type;
	private static int ibn;

	public TransportVehicle(String type, int ibn) {
		this.type = type;
		this.ibn = ibn;
	}

	public static String getType() {
		return type;
	}

	public static int getIbn() {
		return ibn;
	}

}