package car;

import client.Client;
import main.Company;
import main.Driver;

public class PersonCar extends Car {

    private Integer numberSeats;

    public PersonCar(String number, Driver driver, Integer numberSeats) {
        super(number, driver);
        this.numberSeats = numberSeats;
    }

    public Integer getNumberSeats() {
        return numberSeats;
    }

    public void setNumberSeats(Integer numberSeats) {
        this.numberSeats = numberSeats;
    }

    // if destination is airport, then the price should de double
    public double preorder(Client client, Company company){
        return super.costControl(client,company) * 2;
    }



    public double designatedDriver(Client client, Company company, Driver driver1, Driver driver2){
        return super.costControl(client,company) + company.getFixedTarif();
    }
}
