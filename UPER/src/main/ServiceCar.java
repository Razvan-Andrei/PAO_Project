package main;

import car.PackageCar;
import car.PersonCar;

import java.util.Scanner;

public class ServiceCar {

    Scanner in = new Scanner(System.in);

    public Driver createDriver(){

        String name = in.nextLine();
        String phoneNumber = in.nextLine();

        return new Driver(name, phoneNumber);
    }

    public PersonCar createPersonCar(){

        String number = in.nextLine();
        Integer numberSeats = in.nextInt();

        Driver driver = createDriver();
        return new PersonCar(number, driver, numberSeats);
    }

    public PackageCar createPackageCar(){
        Scanner in = new Scanner(System.in);

        String number = in.nextLine();
        Integer capacity = in.nextInt();

        Driver driver = createDriver();
        return new PackageCar(number, driver, capacity);
    }
}
