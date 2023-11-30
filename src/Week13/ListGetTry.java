package Week13;

import java.io.IOException;
import java.util.ArrayList;

public class ListGetTry {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        for (int i = -1; i < 4; i++) {
            try {
                System.out.println(list.get(i));
            } catch (IndexOutOfBoundsException e) {
                System.out.printf("인덱스 %d가 범위를 벗어났습니다.\n", i);
            }
        }
    }
}
