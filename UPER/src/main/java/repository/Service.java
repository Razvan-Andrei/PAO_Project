package repository;

import car.Car;
import client.Client;
import company.Company;
import company.Driver;
import exceptions.ClientNotFoundException;
import exceptions.DriverNotFoundException;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


public class Service {

    private final List<Driver> drivers = new ArrayList<>();
    private final List<Car> cars = new ArrayList<>();
    private final List<Client> clients = new ArrayList<>();

    public List<Company> readCompanies(){
        try{
            Path p = Paths.get("/home/razvandrei/IdeaProjects/UPER/src/main/java/resources/company.csv");

            return Files.lines(p)
                        .map(s -> createCompany(s.split(", ")))
                        .collect(Collectors.toList());
        } catch (IOException e){
            e.printStackTrace();
        }

        return Collections.emptyList();

    }

    private Company createCompany(String[] values){

        String name = values[0];
        String fiscalCode = values[1];
        String tarif = values[2];

        return new Company(name, fiscalCode, tarif);
    }

    public void addDriver(Driver driver){drivers.add(driver);}

    public void addCar(Car car){ cars.add(car);}

    public void addClient(Client client){ clients.add(client);}

    public Driver searchDriver(String name){
        return drivers
                .stream()
                .filter(c-> c.getName().equals(name))
                .findFirst()
                .orElseThrow(DriverNotFoundException::new);
    }

    public Client searchClient(String name){
        return clients
                .stream()
                .filter(c-> c.getName().equals(name))
                .findFirst()
                .orElseThrow(ClientNotFoundException::new);
    }

    public void printCompany(Company company){
        System.out.println(company.getName());
        System.out.println(company.getFiscalCode());
        System.out.println(company.getTarif());
        System.out.print("\n");
    }


}
