import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap();
        map.put(1, "Lawrence");
        map.put(2, "John");

        String firstName = map.get(1);
        System.out.println(map.toString());
        System.out.println(firstName);
    }


}
