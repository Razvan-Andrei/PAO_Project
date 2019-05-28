package repository;

import car.Car;
import company.Company;
import company.Driver;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ServiceCar {

    private Scanner in = new Scanner(System.in);

    public List<Car> readCars(){
        try{
            Path p = Paths.get("/home/razvandrei/IdeaProjects/UPER/src/main/java/resources/cars.csv");

            return Files.lines(p)
                    .map(s -> createCar(s.split(", ")))
                    .collect(Collectors.toList());
        } catch (IOException e){
            e.printStackTrace();
        }

        return Collections.emptyList();

    }

    private Car createCar(String[] values){

        String number = values[0];
        String name = values[1];
        String phoneNumber = values[2];
        String numberSeats = values[3];

        Driver driver = new Driver(name, phoneNumber);
        return new Car(number, driver, numberSeats);
    }

    public void printCar(Car car){
        System.out.println(car.getNumber());
        System.out.println(car.getDriver().getName());
        System.out.println(car.getDriver().getPhoneNumber());
        System.out.println(car.getNumberSeats());
        System.out.print("\n");
    }
}
