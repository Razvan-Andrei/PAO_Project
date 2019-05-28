package car;

import client.Client;
import company.Company;
import company.Driver;

public class Car extends Vehicle {

    private String numberSeats;

    public Car(String number, Driver driver, String numberSeats) {
        super(number, driver);
        this.numberSeats = numberSeats;
    }

    public String getNumberSeats() {
        return numberSeats;
    }

    public void setNumberSeats(String numberSeats) {
        this.numberSeats = numberSeats;
    }

    // if destination is airport, then the price should de double
    public double preorder(Client client, Company company){
        return super.costControl(client,company) * 2;
    }

}
