import java.util.Arrays;
//匿名函数的使用案例
//本质上是为了弥补java不能向形参传函数的缺陷，可用于简化匿名类的书写
//但是lambda无法简化全部匿名类，只能实现简化函数式接口，即仅存在一个抽象方法的interface！
public class lambda {
    public static void main(String[] args) {
        Integer[]arr={1,2,3,4,5,6,7,8,9,10};

        //使用lambda表达式简化匿名类
        Arrays.sort(arr,(Integer o1,Integer o2)->{ return o2-o1; });
        System.out.println(Arrays.toString(arr));
    }
}
