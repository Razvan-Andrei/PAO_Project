package repository;

import car.Car;
import client.Client;
import company.Company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ServiceClient {

    private Scanner in = new Scanner(System.in);

    public List<Client> readClients(){
        try{
            Path p = Paths.get("/home/razvandrei/IdeaProjects/UPER/src/main/java/resources/clients.csv");

            return Files.lines(p)
                    .map(s -> createClient(s.split(", ")))
                    .collect(Collectors.toList());
        } catch (IOException e){
            e.printStackTrace();
        }

        return Collections.emptyList();

    }

    private Client createClient(String[] values){

        String name = values[0];
        String time = values[1];
        String date = values[2];
        String source = values[3];
        String destination = values[4];

        return new Client(name, time, date, source, destination);
    }

    public double newTrip(Client client, Company company, Car personCar){
        return personCar.costControl(client, company);
    }

    public void printClient(Client client){
        System.out.println(client.getName());
        System.out.println(client.getTime());
        System.out.println(client.getDate());
        System.out.println(client.getSource());
        System.out.println(client.getDestination());
        System.out.print("\n");
    }
}
