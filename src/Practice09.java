public class Practice09 {
    public static void main(String[] args) {
        String[] city = {"New York", "Beijing", "Seoul"};

        boolean f = false;
        for (int i = 0; i < city.length; i++) {
            if (city[i].equals("Seoul")) {
                System.out.printf("%d %s\n", i, city[i]);
                f = true;
                break;
            }
        }
        if (!f)
            System.out.print("None");
    }
}
