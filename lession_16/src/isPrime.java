import java.util.Scanner;

public class isPrime {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        int count=0;
        for (int i = 2; i < 1000000; i++)
            if(isP2(i))
                count++;
        long during = System.currentTimeMillis() - start;
        //如果用老方法会要接近20秒，用改进方法仅需100毫秒以内！
        System.out.println("2-1000000间一共有"+count+"个Prime，计算耗时"+during+"毫秒。");
    }

    //老方法，如果判断的数过大会导致运行时间长
    public static boolean isP(int num){
        for (int i = 2; i <= num/2.0; i++)
            if(num%i==0)
                return false;
        return true;
    }

    //新方法，通过开根号节省运行时间
    public static boolean isP2(int num){
        for (int i = 2; i <= Math.sqrt(num); i++)
            if(num%i==0)
                return false;
        return true;
    }
}
