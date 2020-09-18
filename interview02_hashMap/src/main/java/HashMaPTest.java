import java.util.HashMap;
import java.util.Map;

public class HashMaPTest {

    public static void main(String[] args) {
        //数组是连续的，链表不连续
        //查询快，删除和插入慢；查询O(1),删除O(n)
        Map<String,String> map = new HashMap<String, String>();
        map.put("a","c");
        map.get("a");
        System.out.println(map.get("a"));
        //Entry(key,value,hash,next)
    }

}
