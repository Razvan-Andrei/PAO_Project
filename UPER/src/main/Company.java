package main;

import car.Car;
import car.PackageCar;
import car.PersonCar;
import client.Client;
import client.ClientPackage;

import java.util.ArrayList;
import java.util.List;

public final class Company {

    private String name;
    private String fiscalCode;
    private double tarif;

    private List<Driver> drivers = new ArrayList<>();
    private List<PersonCar> personCars = new ArrayList<>();
    private List<PackageCar> packageCars = new ArrayList<>();
    private List<Client> clients = new ArrayList<>();
    private List<ClientPackage> clientPackages = new ArrayList<>();

    public static final double fixedTarif = 20;

    public Company(String name, String fiscalCode, double tarif) {
        this.name = name;
        this.fiscalCode = fiscalCode;
        this.tarif = tarif;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFiscalCode() {
        return fiscalCode;
    }

    public void setFiscalCode(String fiscalCode) {
        this.fiscalCode = fiscalCode;
    }

    public double getTarif() {
        return tarif;
    }

    public void setTarif(double tarif) {
        this.tarif = tarif;
    }

    public double getFixedTarif() {
        return fixedTarif;
    }

}
