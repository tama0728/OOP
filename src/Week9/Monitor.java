package Week9;

class Monitor {
    private String monitorSize;
    private String Color;
    private String power;

    public Monitor(String monitorSize, String Color, String power) {
        this.monitorSize = monitorSize;
        this.Color = Color;
        this.power = power;
    }

    public void turnOn() {
        System.out.println("Turning on monitor.");
    }

    public void printInfo() {
        System.out.println("The spec of the monitor");
        System.out.println(" Week9.Monitor Size: " + monitorSize);
        System.out.println(" Color: " + Color);
        System.out.println(" Power: " + power);
    }
}
