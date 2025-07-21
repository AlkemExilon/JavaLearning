package setTest;

import java.util.Comparator;
import java.util.TreeSet;
//TreeSet测试
public class treeSet {
    public static void main(String[] args) {
        TreeSet<Integer> ts1 = new TreeSet();

        //TreeSet在加入包装类时会根据已有方法自动进行排序
        ts1.add(1);
        ts1.add(4);
        ts1.add(3);
        ts1.add(2);
        System.out.println("第一次（整型）测试："+ts1);    //输出结果为“1，2，3，4”，实现了自动排序

        //但如果要比较自定义类，就需要在类的定义中实现Comparable接口来指定比较规则
        TreeSet<stu> ts2 = new TreeSet();
        ts2.add(new stu("林神吹","1145141919810"));
        ts2.add(new stu("Alkem","114514"));
        ts2.add(new stu("Vedgar","1919810"));
        System.out.println("第二次（自定义类）测试："+ts2);

        //若上述方法不能满足比较条件，则需要向TreeSet传入一个Comparator比较器
        TreeSet<stu> ts3 = new TreeSet(new Comparator<stu>() {
            @Override
            public int compare(stu o1, stu o2) {
                //先按长度排序
                int res=o1.getName().length()-o2.getName().length();
                //若长度相同则用compareTo进行首字母比较，不同则利用差值的正负进行排序
                return res==0?o1.getName().compareTo(o2.getName()):res;
            }
        });
    }
}
