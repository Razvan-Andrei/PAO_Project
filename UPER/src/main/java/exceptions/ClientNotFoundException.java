package exceptions;

public class ClientNotFoundException extends RuntimeException{

    public ClientNotFoundException(){
        super("There is no such client!");
    }
}
