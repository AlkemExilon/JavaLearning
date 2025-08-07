package 抽象类;
//接口测试
public interface person {

    //接口不允许出现private和protected修饰符，成员变量全部默认为常量（默认public static final修饰）
    //private int num;
    //protected int n;

    //接口的属性必须全部有初值！
    //public int num;
    String name="alkem";

    //接口类默认没有构造方法！
    //public person(){}

    //接口类中一般仅有抽象方法，默认用public abstract修饰
    void print();
}
