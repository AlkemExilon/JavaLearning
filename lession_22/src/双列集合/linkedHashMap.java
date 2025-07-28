package 双列集合;

import java.util.LinkedHashMap;
import java.util.Map;

//LinkedHashMap测试
//和LinkedList一样，可以实现存取顺序一致，底层原理是应用了双向链表
public class linkedHashMap {
    public static void main(String[] args) {
        Map<Integer,String> map=new LinkedHashMap<>();
        map.put(3,"<>");
        map.put(0,"?");
        map.put(1,"!");
        map.put(2,"...");
        System.out.println(map);
    }
}
