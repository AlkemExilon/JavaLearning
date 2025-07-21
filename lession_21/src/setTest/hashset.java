package setTest;

import java.util.HashSet;
import java.util.Set;

//set测试
public class hashset {
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add("a");

        //打印结果为false说明添加失败，集合不允许存在重复元素！
        boolean b=set.add("a");
        System.out.println("整形的第二次添加结果为"+b+"，因为集合中元素重复了");

        //接下来演示重写equals和hashCode方法，实现比较对象属性值而非地址值，实现集合去重
        HashSet<stu> s=new HashSet<>();
        s.add(new stu());

        //打印结果显示添加失败，但如果将重写的方法注释则显示成功
        boolean n=s.add(new stu());
        System.out.println("自定义对象的第二次添加结果为"+n);
        //但如果加入的是包装类，无需手动重写，jdk会自己重写！
    }
}
