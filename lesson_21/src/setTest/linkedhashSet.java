package setTest;

import java.util.LinkedHashSet;
//哈希链表集合测试
public class linkedhashSet {
    public static void main(String[] args) {
        LinkedHashSet<stu> linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new stu("林神吹","1145141919810"));
        linkedHashSet.add(new stu("Alkem","114514"));
        linkedHashSet.add(new stu("Vedgar","1919810"));

        //打印结果显示，各对象属性值会随添加顺序的变化而改变显示，说明链式存储会保留添加顺序
        System.out.println(linkedHashSet);
    }
}
