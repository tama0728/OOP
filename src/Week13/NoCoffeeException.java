package Week13;

public class NoCoffeeException extends Exception{
    public NoCoffeeException(String e) {
        super(e);
    }

    public String getMessage() {
        System.out.println("Get more coffee!");
        return super.getMessage();
    }
}
