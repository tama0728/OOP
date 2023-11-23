package Week12;

import java.util.ArrayList;

class Numbers {
    private ArrayList<Integer> mylist = new ArrayList<Integer>();
    private int max;
    private int min;
    public Numbers(int min, int max) {
        this.max = max;
        this.min = min;
    }

    public void setNumbers() {
        for (int i = min; i < max+1; i++)
            if (i % 4 == 0 && i % 5 != 0) mylist.add(i);
    }

    public int sumNumbers() {
        int sum = 0;
        for (int i : mylist) {
            System.out.printf("%d ", i);
            sum+=i;
        }
        System.out.printf("= ");
        return sum;
    }
}

public class TestNumber {
    public static void main(String[] args) {
        Numbers n = new Numbers(1, 100);
        n.setNumbers();
        System.out.println(n.sumNumbers());
    }
}
