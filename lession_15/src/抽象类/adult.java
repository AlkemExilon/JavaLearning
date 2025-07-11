package 抽象类;

public interface adult {
    void says();

    //default修饰的方法可以不重写，并且可以有方法体
    default void print_default() {
        System.out.println("adult的default方法！默认可不重写");
    }

    //静态方法也可以有方法体，且无需重写
    static void print_class() {
        System.out.println("teacher类的静态方法！只能由接口调用");
    }
}
