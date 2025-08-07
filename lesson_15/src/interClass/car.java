package interClass;
//内部类
//举例：迭代器就是arrayList的内部类，单独存在无意义，但arrayList存在后可用迭代器进行遍历元素
//实现遍历靠的是内部类可访问外部类全部内容
public class car {
    private String name;
    private String color;
    private int price;
    private String brand;

    class engine{
        private String e_name;
        private String brand;
    }

    public car() {}

    public car(String name, String color, int price, String brand) {
        this.name = name;
        this.color = color;
        this.price = price;
        this.brand = brand;
    }

    public void print() {
        System.out.println(name);

        //必须先创建一个内部类对象，才可以访问其内部成员变量
        engine e=new engine();
        System.out.println(e.e_name);
    }
}
