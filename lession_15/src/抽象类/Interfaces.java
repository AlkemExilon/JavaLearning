package 抽象类;

public class Interfaces {
    public static void main(String[] args) {
        student s=new student();
        teacher t=new teacher();

        t.print();

        //adult的says方法，由teacher继承并重写
        t.says();

        s.print();

        //adult的default方法，无需重写可直接调用
        t.print_default();

        //adult的静态方法可用接口名直接调用，但不能由实现类名、对象名调用
        adult.print_class();
        //t.print_class();  *报错信息为静态方法只能由包含其的接口调用！
    }
}
