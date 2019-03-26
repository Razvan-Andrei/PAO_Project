package client;

public class ClientPackage extends Client {

    private Integer weight;

    public ClientPackage(String name, String time, String date, String source, String destination, Integer weight) {
        super(name, time, date, source, destination);
        this.weight = weight;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }
}
