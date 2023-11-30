package Week13;

public class CoffeeMachine {
    private int been;
    public CoffeeMachine(int been) {
        this.been = been;
    }

    public int getAmountOfBeens() {return been;}

    public void brew() throws NoCoffeeException {
        if (getAmountOfBeens() < 10) {
            throw new NoCoffeeException("No Coffee Exception...");
        }
        System.out.println("Brewing...");
        been -=10;
    }
}
