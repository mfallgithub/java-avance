package com.streams.exercice;

import java.util.Set;
import java.util.stream.Collectors;

public class ExerciceFinalStreams {

    private static Set<Driver> alldrivers;
    private static Set<Passenger> allPassengers;
    private static Set<Trip> allTrips;

    public static void callingMainStream() {
        prepareData();
        // Task 1 : Affichez tous les "Trips" ayant duré moins d'une heure
        var task1 = allTrips
                .stream()
                .filter(trip -> trip.getDuration() < 60)
                .toList();
        System.out.println("Task 1 = " + task1);

        // Task 2 : Trouvez tous les "Drivers" qui n'ont fait aucun "Trip"
        var task2 = alldrivers
                .stream()
                .filter(
                        driver -> allTrips
                                .stream()
                                .noneMatch(trip -> trip.getDriver() == driver))
                .toList();
        System.out.println("Task 2 = " + task2);

        // Task 3 : Affichez tous les "Drivers" avec leur distance total
        var task3 = allTrips
                .stream()
                .collect(Collectors.groupingBy(
                        Trip::getDriver,
                        Collectors.summingDouble(Trip::getDistance)
                ));
        System.out.println("Task 3 = " + task3);

        // Task 4 : Trouvez tous les "Passengers" ayant au moins participé à un "Trip"
        var task4 = allPassengers
                .stream()
                .filter(passenger -> allTrips
                        .stream()
                        .anyMatch(trip -> trip.getPassengers().contains(passenger)))
                .toList();
        System.out.println("Task 4 = " + task4);

        // Task 5 : Trouvez tous les "Passengers" qui ont participé à plus d'un "Trip" avec le meme "Driver"
        var task5 = allPassengers
                .stream()
                .filter(passenger -> allTrips
                        .stream()
                        .filter(trip -> trip.getPassengers().contains(passenger))
                        .collect(Collectors.groupingBy(
                                Trip::getDriver,
                                Collectors.counting()
                        ))
                        .values()
                        .stream()
                        .anyMatch(value -> value > 1L))
                .toList();
        System.out.println("Task 5 = " + task5);

    }

    static void prepareData() {
        Driver d1 = new Driver("D1");
        Driver d2 = new Driver("D2");
        Driver d3 = new Driver("D3");
        Driver d4 = new Driver("D4");

        Passenger p1 = new Passenger("P1");
        Passenger p2 = new Passenger("P2");
        Passenger p3 = new Passenger("P3");
        Passenger p4 = new Passenger("P4");

        Trip t1 = new Trip(d1, Set.of(p1, p2), 30, 30);
        Trip t2 = new Trip(d1, Set.of(p1, p3), 50, 70);
        Trip t3 = new Trip(d2, Set.of(p2, p3), 70, 90);
        Trip t4 = new Trip(d3, Set.of(p1, p3), 120, 110);
        Trip t5 = new Trip(d1, Set.of(p1, p3), 50, 70);

        alldrivers = Set.of(d1, d2, d3, d4);
        allPassengers = Set.of(p1, p2, p3, p4);
        allTrips = Set.of(t1, t2, t3, t4, t5);
    }
}
