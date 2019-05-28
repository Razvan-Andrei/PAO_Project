package company;



public final class Company {

    private String name;
    private String fiscalCode;
    private String tarif;


    public Company(String name, String fiscalCode, String tarif) {
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
        return new Double(tarif);
    }

    public void setTarif(String tarif) {
        this.tarif = tarif;
    }

}
