package car;

import client.Client;
import company.Company;
import company.Driver;

public abstract class Vehicle {

    private String number;
    private Driver driver;

    Vehicle(String number, Driver driver) {
        this.number = number;
        this.driver = driver;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public double costControl(Client client, Company company){
        return client.getKm() * company.getTarif();
    }
}
