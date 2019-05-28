package main;

import car.Car;
import client.Client;
import company.Company;
import company.Driver;
import repository.Service;
import repository.ServiceCar;
import repository.ServiceClient;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Service service = new Service();

        List<Company> companies = service.readCompanies();
        for(Company i:
             companies) {
            service.printCompany(i);
        }

        ServiceCar serviceCar=new ServiceCar();

        List<Car> cars = serviceCar.readCars();
        for (Car i:
             cars) {
            serviceCar.printCar(i);
        }

        ServiceClient serviceClient = new ServiceClient();
        List<Client> clients = serviceClient.readClients();
        for (Client i:
             clients) {
            serviceClient.printClient(i);
        }

        Driver d1 = new Driver("Alin", "0746175591");
        Car c1 = new Car("482053", d1, "6");
        Client cl1 = new Client("Gingirica", "19:47", "19-02-2019", "Baicoi", "Tandarei");
        service.addClient(cl1);
        service.addDriver(d1);
        service.addCar(c1);
        Driver d2 = service.searchDriver(d1.getName());
        Client cl2 = service.searchClient(cl1.getName());
        System.out.println(d2);
        System.out.println(cl2);

    }
}
