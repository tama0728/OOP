package Week9;

class PersonalComputer {
    private Computer computer;
    private Monitor monitor;

    public PersonalComputer() {
        computer = new Computer("Core i7", "16GB", "2TB", "White", "500W");
        monitor = new Monitor("24 inch", "Black", "45W");
    }

    public void turnOn() {
        computer.turnOn();
        monitor.turnOn();
    }

    public void printInfo() {
        computer.printInfo();
        monitor.printInfo();
    }
}
