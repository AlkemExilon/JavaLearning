package 抽象类;

public class student implements person {
    private String name;
    private String sno;
    public student() {}

    public void print() {
        System.out.println("student构造完毕！");
    }

    //从Object父类继承过来的toString方法，可实现重写
    @Override
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", sno='" + sno + '\'' +
                '}';
    }
}
