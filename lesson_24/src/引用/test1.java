package 引用;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

//引用构造方法测试
public class test1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"Alkem-114","Cernel-514","DeadMachine-1919","Edgar-810");

        //在map方法中会自动调用stu构造方法，将String类型数据转为stu类型对象
        List<stu> list1=list.stream().
                map(stu::new).
                collect(Collectors.toList());
        System.out.println(list1);
    }
}
