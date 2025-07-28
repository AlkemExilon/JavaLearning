package 双列集合;

import java.util.Comparator;
import java.util.TreeMap;
import java.util.Map;

//TreeMap测试，和TreeSet一样可以传入Comparator，然后根据键进行自定义升降序
public class treeMap {
    public static void main(String[] args) {
        Map<Integer,String> map=new TreeMap((Comparator<Integer>) (o1, o2) -> o1-o2);
        map.put(3,"Alkem");
        map.put(2,"DeadMachine");
        map.put(5,"Cernel");
        System.out.println(map);//  输出的键值对会根据键的值自动排序，排序规则根据传入的比较器决定
    }
}
