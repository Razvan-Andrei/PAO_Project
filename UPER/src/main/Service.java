package main;

import java.util.Scanner;

public class Service {

    public Company createCompany(){
        Scanner in = new Scanner(System.in);

        String name = in.nextLine();
        String fiscalCode = in.nextLine();
        Double tarif = in.nextDouble();

        return new Company(name, fiscalCode, tarif);
    }
}
