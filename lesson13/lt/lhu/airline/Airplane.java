package lesson13.lt.lhu.airline;

import java.util.Comparator;



public class Airplane implements Comparable <Airplane>  {
	private String destination;
	private String airplaneType;
	private int numFly;
	private String day;
	private String departureTime;

	public Airplane(String destination, String airplaneType, int numFly, String day, String departureTime) {
		this.destination = destination;
		this.airplaneType = airplaneType;
		this.numFly = numFly;
		this.day = day;
		this.departureTime = departureTime;

	}
	public static Comparator<Airplane> DestinationNameComparator = new Comparator<Airplane>() {
	@Override
	public int compareTo(Airplane a1) {
		return this.getDestination().compareTo(a1.getDestination());
	}

	@Override
	public String toString() {
		return "Airplane [destination=" + destination + ", airplaneType=" + airplaneType + ", numFly=" + numFly
				+ ", day=" + day + ", departureTime=" + departureTime + "]";
	}

	public void setDestinaton(String destination) {
		this.destination = destination;
	}

	public String getDestination() {
		return this.destination;
	}

	public void setAirplaneType(String airplaneType) {
		this.airplaneType = airplaneType;
	}

	public String getAirplaneType() {
		return this.airplaneType;
	}

	public void setNumFly(int numFly) {
		this.numFly = numFly;
	}

	public int getNumFly() {
		return this.numFly;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getDay() {
		return this.day;
	}

	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}

	public String getDepartureTime() {
		return this.departureTime;

	}

}