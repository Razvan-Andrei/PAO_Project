package main;

public class Company {

    private String name;
    private String fiscalCode;
    private double tarif;
    private double fixedTarif;

    public Company(String name, String fiscalCode, double tarif, double fixedTarif) {
        this.name = name;
        this.fiscalCode = fiscalCode;
        this.tarif = tarif;
        this.fixedTarif = fixedTarif;
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

    public void setFixedTarif(double fixedTarif) {
        this.fixedTarif = fixedTarif;
    }
}
