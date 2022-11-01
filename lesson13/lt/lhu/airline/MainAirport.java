package lesson13.lt.lhu.airline;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainAirport {

	public static void main(String[] args) {
		List<Airplane> airplanes = new ArrayList<Airplane>();
		
		airplanes.add(new Airplane("Minsk", "Boeing707", 23, "Monday", "10.00"));
		airplanes.add(new Airplane("Minsk", "AirbusA310", 12, "Wednesday", "11.00"));
		airplanes.add(new Airplane("Brest", "Boeing737", 10, "Tuesday", "12.00"));
		airplanes.add(new Airplane("Minsk", "Boing707", 11, "Monday", "13.00"));
		airplanes.add(new Airplane("Moscow", "Boing707", 5, "Sunday", "9.00"));
		airplanes.add(new Airplane("Minsk", "Boeing737", 10, "Thursday", "12.00"));
		airplanes.add(new Airplane("Gomel", "Boing707", 18, "Monday", "16.00"));
		airplanes.add(new Airplane("Minsk", "AirbusA310", 22, "Saturday", "12.00"));
		airplanes.add(new Airplane("Vitsebsk", "Boing707", 2, "Sunday", "9.00"));
		airplanes.add(new Airplane("Minsk", "AirbusA310", 13, "Friday", "7.00"));
		
		System.out.println("All Airplanes: ");
		for(Airplane ar: airplanes) {
			System.out.println(ar);
		}
		System.out.println(" ");
		System.out.println("Sorting All Airplanes Name Destination");
		Collections.sort(airplanes, Airplane.DestinationNameComparator );
		for(Airplane ar : airplanes) {
			System.out.println(ar);
		}
		
	
		}

	}


