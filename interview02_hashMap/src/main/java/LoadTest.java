/**
 * @Author jqc
 * @Date 2020/11/19 18:20
 * @Version 1.0
 */
public class LoadTest {

    public static void main(String[] args) {
        for (int i = 0; i < 10000; i++) {
            new Thread(() ->{
                HashMapStaticTest.map.get("A");
            },String.valueOf(i)).start();
        }
    }
}
