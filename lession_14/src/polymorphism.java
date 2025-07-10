public class polymorphism {
    public static void main(String[] args) {
        person p=new teacher();
        System.out.println(p.name);//输出为alkem，父类属性不会被覆盖
        p.print();

        person p1=new student();
        System.out.println(p1.name);//输出为alkem，父类属性不会被覆盖
        p1.print();

        //无法调用执行teacher的idk方法，因为person里没有idk方法
        //可见父类引用只能执行子类中来自自己的方法
        //p.idk();

        //但将p强制转换为teacher类型后，可以调用idk方法
        teacher t1=(teacher)p;
        t1.idk();
    }
}

class person{
    public String name="alkem";
    public void print(){
        System.out.println("person");
    }
}

class teacher extends person{
    public String name="cernel";
    public void print(){
        System.out.println("teacher");
    }
    public void idk(){
        System.out.println("wat de hell?");
    }
}

class student extends person{
    public String name="edgar";
    public void print(){
        System.out.println("student");
    }
}