package g30126.pol.paula.l5.e3;


public abstract class Sensor {
	private String location;

	public Sensor() {
		// TODO Auto-generated constructor stub
	}
	public abstract int readValues();
	public String getLocation() {
		return location;
	}
}
