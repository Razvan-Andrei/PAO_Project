package main;

import car.PackageCar;
import car.PersonCar;
import client.Client;
import client.ClientPackage;

import java.util.Scanner;

public class ServiceClient {

    Scanner in = new Scanner(System.in);

    public Client createClient(){

        String name = in.nextLine();
        String time = in.nextLine();
        String date = in.nextLine();
        String source = in.nextLine();
        String destination = in.nextLine();

        return new Client(name, time, date, source, destination);
    }

    public ClientPackage createClientPackage(){

        Client client = createClient();
        Integer weight = in.nextInt();

        return new ClientPackage(client.getName(), client.getTime(), client.getDate(), client.getSource(), client.getDestination(),weight);
    }

    public double newTrip(Client client, Company company, PersonCar personCar){
        return personCar.costControl(client, company);
    }
    public double newCommand(ClientPackage clientPackage, Company company, PackageCar packageCar){
        return packageCar.costControl(clientPackage, company);
    }
}
