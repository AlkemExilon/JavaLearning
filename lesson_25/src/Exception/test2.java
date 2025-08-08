package Exception;
//抛出异常测试
public class test2 {
    public static void main(String[] args) {
        int[]arr=null;

        try{
            System.out.println(getMax(arr));
        }
        //尝试捕获方法中抛出的空指针异常
        catch(NullPointerException e){
            e.printStackTrace();
        }
        //尝试捕获方法中抛出的数组越界异常
        catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
        System.out.println("OVER");
    }

    public static int getMax(int[] arr){
        //若传入的是一个指向null的引用，则抛出 空指针异常
        if(arr==null)
            throw new NullPointerException();
        //若传入一个长度为零的数组，抛出 数组索引越界异常
        if(arr.length==0)
            throw new ArrayIndexOutOfBoundsException();

        int max=0;
        for (int i=0;i<arr.length;i++){
            if(max<i)
                max=i;
        }
        return max;
    }
}
