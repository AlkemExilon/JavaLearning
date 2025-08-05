package collections;

import java.util.ArrayList;
import java.util.Collections;

//Collections测试
//本身是一个构造方法私有化的工具类，不可直接创建对象，但可以调用其中方法
public class test {
    public static void main(String[] args) {
        ArrayList list=new ArrayList();

        //调用Collections的addAll方法，可见addAll使用了可变参数来添加元素
        Collections.addAll(list,1,2,3,4,5,6);
        System.out.println(list);
    }
}
