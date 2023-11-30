package Week13;

public class CoffeeMachineException{
    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine(15);

        try {
            coffeeMachine.brew();
            coffeeMachine.brew();
        } catch (NoCoffeeException e) {
            System.out.println(e.getMessage());
        }
    }

}
