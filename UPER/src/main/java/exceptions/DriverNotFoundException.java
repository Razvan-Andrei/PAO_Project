package exceptions;

public class DriverNotFoundException extends RuntimeException {

    public DriverNotFoundException(){
        super("There is no such driver!");
    }
}
