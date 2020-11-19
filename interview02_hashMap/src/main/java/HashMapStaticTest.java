import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Condition;

/**
 * @Author jqc
 * @Date 2020/11/19 17:29
 * @Version 1.0
 */
public class HashMapStaticTest {

    public static final Map map;
    static{
        HashMap<String,String> hashMap = new HashMap<String, String>();
        hashMap.put("A","1");
        hashMap.put("B","2");
        hashMap.put("C","3");
        hashMap.put("D","4");
        hashMap.put("E","5");
        map = Collections.unmodifiableMap(hashMap);
        System.out.println(map);
    }

    public static void main(String[] args) {

        //put
//        for (int i = 0; i < 10; i++) {
//            new Thread(() ->{
//                map.put("A","10");//map = hashMap;
//            },String.valueOf(i)).start();
//         }
        //get
        for (int i = 0; i < 10; i++) {
            new Thread(() ->{
                map.get("A");
            },String.valueOf(i)).start();
        }
//        while (true){
//            new Thread(() ->{
//                map.get("A");
//            },"线程while").start();
//        }
        System.out.println(map.get("A"));
        String a="";
    }
}
