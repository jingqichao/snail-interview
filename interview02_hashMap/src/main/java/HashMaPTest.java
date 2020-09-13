import java.util.HashMap;
import java.util.Map;

public class HashMaPTest {

    public static void main(String[] args) {
        Map<String,String> map = new HashMap<String, String>();
        map.put("a","c");
        map.get("a");
        System.out.println(map.get("a"));
    }

}
