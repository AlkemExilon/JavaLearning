package 引用;

public class stu {
    private String name;
    private int age;

    public stu(){}

    //新写的构造方法，本身没有返回值，实现了将stream流中各个字符串分割为不同数据然后赋值给属性，再将完整对象传给map方法，实现从string到stu对象的转换
    public stu(String str)
    {
        this.name=str.split("-")[0];
        this.age=Integer.parseInt(str.split("-")[1]);
    }

    public stu(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "stu{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
