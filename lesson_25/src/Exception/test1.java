package Exception;
//异常处理测试
public class test1 {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5};

        try{
            System.out.println(arr[10]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            String str1=e.getMessage();
            String str2=e.toString();
            System.out.println();
            System.out.println("str1:"+str1);// str1:Index 10 out of bounds for length 5
            System.out.println();
            System.out.println("str2:"+str2);// str2:java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 5
            System.out.println();
            System.out.println("str3:");
            e.printStackTrace();
        }

        System.out.println("监视哨？");
        //可见，printStackTrace方法比较特殊，会显示得比较不一样
        //getMessage则仅获取错误信息，toString会把整个错误包括异常类也获取
    }
}
