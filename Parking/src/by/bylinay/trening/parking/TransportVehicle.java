package by.bylinay.trening.parking;

public class TransportVehicle {

	private TransportVehicleTypeEnum type;
	private int ibn;

	public TransportVehicle(TransportVehicleTypeEnum type, int ibn) {
		this.type = type;
		this.ibn = ibn;

	}

	public TransportVehicleTypeEnum getType() {
		return type;
	}

	public String getTypeToString() {
		return type.getTipe();
	}

	public int getIbn() {
		return ibn;
	}

	public void toPrintInfo() {

		System.out.printf(" \n %s \n %s %d  \n %s %s  ", "/////Info About Car//////", "ibn Car", getIbn(),
				"typ TransportVehicle", getType());
	}
}