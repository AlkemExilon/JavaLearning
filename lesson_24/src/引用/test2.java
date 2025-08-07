package 引用;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//简单测试：引用数组的构造方法
public class test2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "a-0", "b-1", "c-2");

        Integer[] list1=list.stream().
                map(s->Integer.parseInt(s.split("-")[1])).
                toArray(Integer[]::new);
        System.out.println(Arrays.toString(list1));
        //不要忘了，Arrays.toString()方法的用处是实现打印数组内容，如果不调用则会显示地址值！
    }
}
