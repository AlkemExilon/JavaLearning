import java.util.ArrayList;

public class stl_cannotBeExtended {
    public static void main(String[] args) {
        ArrayList<grandpa> list1 = new ArrayList();
        ArrayList<father> list2 = new ArrayList();
        ArrayList<son> list3 = new ArrayList();
        ArrayList<Object> list4 = new ArrayList();

        //接下来演示泛型的继承
        method1(list1);

        //下面这两段会报错，因为泛型tm就没继承！泛型中的类型只是输入规范，有继承关系的是类及其中数据
        //method1(list2);
        //method1(list3);

        //这是一个对通配符super的测试，证明了super仅实现向上兼容（匹配grandpa的父类）不向下兼容（不匹配子类）
        //method3(list3);   list3泛型为son，并非grandpa的子类
        method3(list4);   //list4泛型为object，是grandpa的父类

        //类的数据间存在继承关系，可以实现往父类泛型集合添加子类数据
        list1.add(new grandpa());
        list1.add(new father());
        list1.add(new son());
    }

    //限定了传入参数类型的方法。注意区分，这不是泛型方法
    public static void method1(ArrayList<grandpa> list){}

    //这是真正的泛型方法，返回类型前和形参内参数类型未定，但有一个缺陷就是任何引用数据类型都可以传入
    public static <E> void method2(ArrayList<E> list){}

    //若要实现限定传入类型，应当使用泛型通配符“？“
    //”？“表示不确定的类，后面可加上extends或super进行类的限定，前者是限定为子类，后者限定为父类
    public static void method3(ArrayList<? super grandpa> list){}
}

class grandpa{}
class father extends grandpa{}
class son extends father{}