package Homework7;

abstract class Printer {
    private String model;
    private int printedCount, availableCount;

    public String getModel() {
        return model;
    }
    public int getAvailableCount() {
        return availableCount;
    }

    public int getPrintedCount() {
        return printedCount;
    }

    public void addPrintCount() {
        printedCount++;
        availableCount--;
    }

    public Printer(String model, int availableCount){
        this.model = model;
        this.availableCount = availableCount;
        printedCount = 0;
    }

    public abstract boolean print();
}
