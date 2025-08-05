//可变参数测试
public class arg {
    public static void main(String[] args) {
        System.out.println(getSum(1,2,3,4,5,6));
    }

    //可变参数的底层实现原理是数组，且一个函数仅可传入一组可变参数，和其他单个形参一起传入时可变参数得写在最后
    public static int getSum(int ...args){
        int sum=0;
        for(int i:args)
            sum+=i;
        return sum;
    }
}
