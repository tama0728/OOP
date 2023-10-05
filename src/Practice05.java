import java.lang.*;

public class Practice05 {
    public static void main (String[] args){
        String str = "a d, m,   i. n";
        String delimiters = "\\s+|,\\s*|\\.\\s*";

        String[] tokenVal = str.split(delimiters);

        for (String token : tokenVal)
            System.out.println(token);
    }
}
