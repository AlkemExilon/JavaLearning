package 双列集合.TreeMapTest;

import java.util.Comparator;
import java.util.HashMap;
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

        System.out.println("-------------------------------");

        //接下来演示如何实现根据自定义类进行排序
        System.out.println("以下内容根据年龄排序：");
        Map<stu,String>map2=new TreeMap<>();
        map2.put(new stu("AlkemExilon",21),"浙江");
        map2.put(new stu("Cernel",22),"LA");
        map2.put(new stu("DeadMachine",114514),"???");
        map2.put(new stu("???",1919),"unknown");
        for (Map.Entry<stu,String>entry:map2.entrySet()) {
            System.out.println("Info:"+entry.getKey()+"; region:"+entry.getValue());
        }
    }


}
