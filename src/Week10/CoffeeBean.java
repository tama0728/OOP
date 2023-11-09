package Week10;

public class CoffeeBean {
    private String species = "Coffee";
    void print() {
        System.out.println(species);
    }
    protected void setSpecies(String s) {
        this.species = s;
    }
    public String getSpecies() {
        return species;
    }
}

class Robusta extends CoffeeBean {
    @Override
    void print() {
        System.out.println("Robusta coffee...");
    }
    void print(String s) {
        System.out.printf("%s: %s\n", getSpecies(), s);
    }
}