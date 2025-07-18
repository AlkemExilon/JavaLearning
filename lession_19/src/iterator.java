import java.util.ArrayList;
import java.util.Iterator;

// collection接口旗下子类的专用迭代方式
// 本质是一个内部类，不依赖索引访问集合中的元素
public class iterator {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(1);
        list.add("String");

        //使用迭代器进行遍历
        //注意，迭代器指针不会自动复位！
        //这意味着遍历结束后必须重新创建一个迭代器进行新一轮遍历！
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+", ");
            //这里不能用collection的方法删除元素，会引发并发修改异常
            //list.remove(iterator.next());
            //应当用迭代器自带的remove方法进行删除！
            iterator.remove();
        }
        System.out.println();
        System.out.println("结果："+list);//结果为空，删除成功
    }
}
