package Week12;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Map;

public class CountChars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] ch = str.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (char c : ch) {
            if (map.containsKey(c))
                map.put(c, map.get(c) + 1);
            else
                map.put(c, 1);
        }
        Iterator<Character> keys = map.keySet().iterator();
        while (keys.hasNext()) {
            Character key = keys.next();
            System.out.printf("%c : %d\n", key, map.get(key));
        }
    }
}
