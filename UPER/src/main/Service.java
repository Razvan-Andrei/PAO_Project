package main;

import car.Car;
import car.PackageCar;
import car.PersonCar;
import client.Client;
import client.ClientPackage;
import java.util.Scanner;

public class Service {

    public Company addComany(String name, String fiscalCode, double tarif, double fixedTarif){
        Scanner in = new Scanner(System.in);

        name = in.nextLine();
        fiscalCode = in.nextLine();
        tarif = in.nextInt();
        fixedTarif = in.nextInt();

        Company company = new Company(name, fiscalCode, tarif, fixedTarif);
        return company;
    }

    public Driver addDriver(String name, String phoneNumber){
        Scanner in = new Scanner(System.in);

        name = in.nextLine();
        phoneNumber = in.nextLine();

        Driver driver = new Driver(name, phoneNumber);
        return driver;
    }

    public Car addCar(String number, String name, String phoneNumber){
        Scanner in = new Scanner(System.in);

        number = in.nextLine();
        Driver driver = addDriver(name, phoneNumber);

        Car car = new Car(number, driver);
        return car;
    }

    public PersonCar addPersonCar(String number, String name, String phoneNumber, Integer numberSeats){
        Scanner in = new Scanner(System.in);

        number = in.nextLine();
        name = in.nextLine();
        phoneNumber = in.nextLine();
        numberSeats = in.nextInt();

        Driver driver = new Driver(name, phoneNumber);
        PersonCar personCar = new PersonCar(number, driver, numberSeats);
        return personCar;
    }

    public PackageCar addPackageCar(String number, String name, String phoneNumber, Integer capacity){
        Scanner in = new Scanner(System.in);

        number = in.nextLine();
        name = in.nextLine();
        phoneNumber = in.nextLine();
        capacity = in.nextInt();

        Driver driver = new Driver(name, phoneNumber);
        PackageCar packageCar = new PackageCar(number, driver, capacity);
        return packageCar;
    }

    public Client addClient(String name, String time, String date, String source, String destination){
        Scanner in = new Scanner(System.in);

        name = in.nextLine();
        time = in.nextLine();
        date = in.nextLine();
        source = in.nextLine();
        destination = in.nextLine();

        Client client = new Client(name, time, date, source, destination);
        return client;
    }

    public ClientPackage addClientPackage(String name, String time, String date, String source, String destination, Integer weight){
        Scanner in = new Scanner(System.in);

        name = in.nextLine();
        time = in.nextLine();
        date = in.nextLine();
        source = in.nextLine();
        destination = in.nextLine();
        weight = in.nextInt();

        ClientPackage clientPackage = new ClientPackage(name, time, date, source, destination, weight);
        return clientPackage;
    }

    public double newTrip(Client client, Company company, PersonCar personCar){
        return personCar.costControl(client, company);
    }
    public double newCommand(ClientPackage clientPackage, Company company, PackageCar packageCar){
        return packageCar.costControl(clientPackage, company);
    }

}
