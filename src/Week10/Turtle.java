package Week10;

public class Turtle {
    private int limbs = 4;
    protected String food;
    public void setFood(String food) {
        this.food = food;
    }
    public void eat() {
        System.out.printf("Turtle eate %s\n", food);
    }

    public int getLimbs() {
        return this.limbs;
    }
}

class SeaTurtle extends Turtle {
    public void swim() {
        System.out.println("A sea turtle swims...");
    }
}

class LandTurtle extends Turtle {
    public void walk() {
        System.out.println("A land turtle walks...");
    }
}