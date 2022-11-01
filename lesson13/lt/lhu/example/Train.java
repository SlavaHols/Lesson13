package lesson13.lt.lhu.example;

import java.util.Comparator;

public class Train implements Comparable<Train> {
	private String stationName;
	private int numTrain;
	private String timeDeparture;

	public Train(String stationName, int numTrain, String timeDeparture) {
		this.stationName = stationName;
		this.numTrain = numTrain;
		this.timeDeparture = timeDeparture;

	}

	@Override
	public int compareTo(Train o) {
		return this.getNumTrain() - o.getNumTrain();
	}

	@Override
	public String toString() {
		return "Train [stationName= " + stationName + ", numTrain= " + numTrain + ", timeDeparture= " + timeDeparture
				+ "]";
	}

	public static Comparator<Train> StationNameComparator = new Comparator<Train>() {
		@Override
		public int compare(Train t1, Train t2) {
			return t1.getStationName().compareTo(t2.getStationName());
		}
	};

	public void setStationName(String stationName) {
		this.stationName = stationName;
	}

	public String getStationName() {
		return this.stationName;
	}

	public void setNumTrain(int numTrain) {
		this.numTrain = numTrain;
	}

	public int getNumTrain() {
		return this.numTrain;
	}

	public void setTimeDeparture(String timeDeparture) {
		this.timeDeparture = timeDeparture;
	}

	public String getTimeDeparture() {
		return this.timeDeparture;
	}

}
