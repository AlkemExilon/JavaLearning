import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.stream.*;

//stream的collect方法实现将数据加入到map中
public class streamTest3 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList();
        Collections.addAll(list,"a-114","b-514","c-1919","d-810","e-114514");

        //Map方法将stream中元素分割放入hashMap的过程
        //toList和toSet太简单了不写了
        Map<String,Integer> list1=
                list.stream().collect(Collectors.
                toMap(s->s.split("-")[0],s->Integer.parseInt(s.split("-")[1])));

        System.out.println(list1);
    }
}
