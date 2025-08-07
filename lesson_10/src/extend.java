public class extend {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
    }
}
class A{
    public A(){
        System.out.println("A");
    }
}
class B extends A{
    public B(){
        //super可有可无，会自动调用来继承B的无参构造方法
        super();
        System.out.println("B");
    }
}
