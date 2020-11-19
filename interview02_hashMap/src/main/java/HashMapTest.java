import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

    public static void main(String[] args) {
        //数组是连续的，链表不连续
        //查询快，删除和插入慢；查询O(1),删除O(n)
        //HashMap：默认的数组大小是16,传10也会改变成16(1<<4)
        //2的幂次方，二进制只有一个位上为1
        //    public static int highestOneBit(int i) {
        //        // HD, Figure 3-1
        //        i |= (i >>  1);
        //        i |= (i >>  2);
        //        i |= (i >>  4);
        //        i |= (i >>  8);
        //        i |= (i >> 16);
        //        return i - (i >>> 1);
        //    }
        //Integer.highestOneBit()小于等于2的幂次方，把最高位【0010 ****】以后的值都设置为1【0011 1111】
        // 然后再清零变成【0010 0000】，其实就是找到它的int类型的最高位，int（4个字节，32位）

        System.out.println(Integer.highestOneBit(0));//0
        System.out.println(Integer.highestOneBit(1));//1
        System.out.println(Integer.highestOneBit(10));//8
        System.out.println(Integer.highestOneBit(16));//16
        System.out.println(Integer.highestOneBit(17));//16
//        HashMap<String, String> map = new HashMap<String, String>(10,0.75f);
        //链表使用的头插法，遍历的时候可以不用全部遍历完就可以找到Entry对象
        HashMap<String, String> map = new HashMap<String, String>();
        String result1 = map.put("a", "c");
        //put方法的返回值是覆盖上一个key的value值
        String result2 = map.put("a", "d");
        System.out.println(map.get("a"));//d
        System.out.println(result1);//null
        System.out.println(result2);//c
        //Entry(key,value,hash,next)




    }

}
