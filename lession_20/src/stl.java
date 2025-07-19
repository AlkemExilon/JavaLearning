import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//泛型类、泛型方法测试
public class stl {
    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        addAll(list,"114514","1919810");
        System.out.println(list);
    }

    //编写addAll泛型方法实现一次添加多个元素
    public static <E> void addAll(MyArrayList<E> list, E...e) {
        for(E data:e)
            list.add(data);
    }
}

//定义自己编写的ArrayList泛型类，实现可以存放多种引用类型
class MyArrayList<E> {
    Object[] elementData=new Object[10];
    int size=0;

    public boolean add(E e) {
        elementData[size++]=e;
        return true;
    }

    public E get(int index) {
        return (E)elementData[index];
    }

    @Override
    public String toString() {
        return Arrays.toString(elementData);
    }
}