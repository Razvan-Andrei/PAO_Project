package car;

import car.Car;
import client.Client;
import client.ClientPackage;
import main.Company;
import main.Driver;

public class PackageCar extends Car {

    private Integer capacity;

    public PackageCar(String number, Driver driver, Integer capacity) {
        super(number, driver);
        this.capacity = capacity;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public double costControl(ClientPackage client, Company company) {
        return super.costControl(client, company) * client.getWeight();
    }
}
