package lesson13.lt.lhu.example;

import java.util.Comparator;

public class CompNameAndTime implements Comparator<Train> {

	@Override
	public int compare(Train t1, Train t2) {
		t1.getStationName().compareTo(t2.getStationName());
		if (t1.getStationName().equals(t2.getStationName())) {
			return t1.getTimeDeparture().compareTo(t2.getTimeDeparture());
		}
		return 0;
		// не знаю как сделать сортировку по времени, что бы
		// время шло не по убыванию, а по возрастанию.
	}

}
