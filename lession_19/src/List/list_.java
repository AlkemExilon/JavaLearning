package List;
//列表api测试，利用列表迭代器实现遍历时添加元素
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class list_ {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");
        list.add("g");

        //接下来使用 列表迭代器/listIterator 进行遍历
        ListIterator<String> iterator=list.listIterator();
        while (iterator.hasNext()){
            String str=iterator.next();

            //利用列表迭代器在遍历时添加元素
            if(str.equals("e"))
                iterator.add("u added an \"e\"");
        }
        System.out.println(list);
    }
}
