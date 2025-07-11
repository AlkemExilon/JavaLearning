package 抽象类;

//一个类可实现多个接口，弥补了单继承的弊端，也延续了C++的多继承并加以改进
public class teacher implements person,adult {
    public teacher() {}
    public void print() {
        System.out.println("teacher构造完毕！");
    }
    public void says() {
        System.out.println("imma adult!");
    }

    //重写default方法时必须去掉default，否则报错
//    @Override
//    public default void print_default() {
//        adult.super.print_default();
//    }
}
