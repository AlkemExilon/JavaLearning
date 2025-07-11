package interClass;
//匿名内部类测试
public class anonymousInterClass {
    public static void main(String[] args) {

        //定义匿名类，实现完善Animal抽象类，直接调用重写的eat方法
        new Animal(){
            public void eat(){
                System.out.println("韭菜盒子");
            }
        }.eat();

        //创建匿名类，实现完善behavior接口，直接调用完善的swim方法
        new behavior(){
            public void swim(){
                System.out.println("蛙泳");
            }
        }.swim();

        //匿名类可用以减少创建类的开销，现场创建匿名类来实现多态
        print(new Animal(){
            public void eat(){
                System.out.println("狗吃骨头");
            }
        });//输出“狗吃骨头”
    }

    public static void print(Animal a){
        a.eat();
    }
}

abstract class Animal {
    public abstract void eat();
}

interface behavior {
    void swim();
}