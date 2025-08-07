package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

//stream.stream 初次测试
public class stream {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Alkem");
        list.add("Ak");
        list.add("Alpha");
        list.add("Cernel");
        list.add("Delta");

        list.stream().filter(name->name.startsWith("A")).forEach(System.out::println);
        //stream方法会返回一个Stream对象，可以理解为创建了一条流水线，并将数据放在其上用于进行操作
        //本例的操作就是过滤首字母不为A的元素，然后打印剩下元素

        System.out.println("------------------------------------");

        //接下来演示如何对数组进行stream操作
        String[] s={"a","b","c"};
        Arrays.stream(s).forEach(System.out::println);
        //这部分说明数组要进行stream操作需要调用Arrays类的Stream方法

        System.out.println("------------------------------------");

        //接下来演示对零散数据进行stream操作
        Stream.of(1,2,3,4,5).forEach(System.out::println);
        //这里需要使用Stream的of方法，stream可以处理任何类型的数据，但所有数据必须是同种类型

        System.out.println("------------------------------------");

        //小例外，如果借用of方法向stream传入一个基本类型数组
        int[]arr={1,2,3,4,5};
        Stream.of(arr).forEach(System.out::println);
        //结果显示是一个地址，of底层方法是使用数组实现的，但会把传入的基本类型数组当作一个元素来处理
        //如果传入的是数组s则不会发生这种情况，因为s是一个引用类型数组
        //综上，给stream传数组别用of方法！用Arrays的stream就够了
    }
}
