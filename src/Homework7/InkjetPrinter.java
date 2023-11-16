package Homework7;

public class InkjetPrinter extends Printer{
    public InkjetPrinter(String model, int availableCount) {
        super(model, availableCount);
    }

    @Override
    public boolean print() {
        if (getAvailableCount() > 0) {
            addPrintCount();
            return true;
        } else {
            System.out.printf("%s: %d매째 인쇄 실패 - 잉크 부족.\n", getModel(), getPrintedCount()+1);
            return false;
        }
    }
}
