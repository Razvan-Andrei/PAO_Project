package client;

public class Client {

    private String name;
    private String time;
    private String date;
    private String source;
    private String destination;

    public Client(String name, String time, String date, String source, String destination) {
        this.name = name;
        this.time = time;
        this.date = date;
        this.source = source;
        this.destination = destination;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Double getKm(){
        return (Math.random() * 100) + 1;
    }
}
