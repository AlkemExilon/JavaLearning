package stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;
//stream中间方法测试
public class streamTest1 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        Collections.addAll(list,"AlkemExilon-114514","Cernel-1919810");

        //有关map方法的类型转换例子，简化写法
        list.stream().
                map(s->Integer.parseInt(s.split("-")[1])).
                forEach(System.out::println);

        System.out.println("-------------------------------------");

        //详细写法，显示结果和上面一样
        list.stream().
                map(new Function<String, Integer>() {
                    @Override
                    public Integer apply(String s) {
                        String[] split = s.split("-");
                        int res=Integer.parseInt(split[1]);
                        return res;
                    }
                    }
                )
                .forEach(System.out::println);
    }
}
