package 双列集合;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

//双列集合测试
public class Map {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        //HashMap的顶层接口是Map，其中方法可为所有子类使用
        //典型方法如下
        map.put(1,"Alkem");//   put() 如果是覆盖会返回原先的元素，否则返回null
        map.put(2,"Exilon");
        map.put(3,"Kim");
        map.put(4,"Jack");
        System.out.println(map);

        System.out.println(map.remove(1));//    remove() 根据键返回被删除的值
        //懒得写了自己查api去

        System.out.println("--------------------------");

        System.out.println("第一次遍历，使用keySet");
        Set<Integer> set = map.keySet();//  先将map中的键全部放在一个集合中
        Iterator<Integer> it = set.iterator();//    创建迭代器指向集合，进行遍历
        while (it.hasNext()) {
            int key = it.next();
            System.out.println("KEY:"+key+" VALUE:"+map.get(key));
        }
        //本质是将双列集合转为只有键的单列集合，再利用遍历单列集合获取键再获取map中对应的值
        //map不自带迭代器也无序，但可以利用单独抽取键的特性实现“遍历”

        System.out.println("--------------------------");

        System.out.println("第二次遍历，使用entrySet");
        Set<java.util.Map.Entry<Integer, String>> entrySet = map.entrySet();
        Iterator<java.util.Map.Entry<Integer, String>> it2 = entrySet.iterator();
        while (it2.hasNext()) {
            java.util.Map.Entry<Integer, String> entry = it2.next();//    将迭代器遍历到的键值对存入容器中
            System.out.println("KEY:"+entry.getKey()+" VALUE:"+entry.getValue());
        }
        //同上，只是把装入集合的对象换成了整个键值对

        System.out.println("--------------------------");

        System.out.println("第三次遍历，使用forEach方法和lambda表达式");
        map.forEach((k,v)-> System.out.println("KEY:"+k+" VALUE:"+v));
        //js箭头函数凑数来的
    }
}
