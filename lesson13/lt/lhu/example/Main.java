package lesson13.lt.lhu.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		List<Train> trains = new ArrayList<Train>();
		trains.add(new Train("Minsk", 8, "12.30"));
		trains.add(new Train("Brest", 2, "11.30"));
		trains.add(new Train("Brest", 5, "9.45"));
		trains.add(new Train("Gomel", 1, "18.20"));
		trains.add(new Train("Mogilev", 6, "13.30"));
		trains.add(new Train("Brest", 3, "11.00"));
		trains.add(new Train("Pinsk", 4, "16.30"));
		trains.add(new Train("Polotsk", 7, "19.00"));

		System.out.println("Sorting Train by Number: -----> ");// Соритровка по номеру поезда.
		Collections.sort(trains);
		for (Train t : trains) {
			System.out.println(t);
		}
		System.out.println(" Search equals Number Train:");// Поиск информации по номеру поезда.
		System.out.println("Enter Number of Train ---->");
		Scanner sc = new Scanner(System.in);
		int inPutNumTrain = sc.nextInt();
		for (Train tr : trains) {
			if (tr.getNumTrain() == inPutNumTrain) {
				System.out.println(tr);
				sc.close();
			}
		}
		System.out.println("  ");
		System.out.println("Sorting Train by Station Name: ------>");// Сортировка по имени станции.
		Collections.sort(trains, Train.StationNameComparator);
		for (Train tr : trains) {
			System.out.println(tr);
		}
		System.out.println("  ");
		System.out.println("Sorting Train by Name and Time Departure --------->");// Сортировка по Имени и по времени.
		Collections.sort(trains, new CompNameAndTime());
		for (Train trs : trains) {
			System.out.println(trs);
		}
	}
}
