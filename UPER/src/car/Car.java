package car;

import client.Client;
import main.Company;
import main.Driver;

public abstract class Car {

    private String number;
    Driver driver;

    public Car(String number, Driver driver) {
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
