import java.util.Scanner;

public class NarcissisticNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(judge(num))
            System.out.println(num+"是三位数，接下来判断是否是水仙花数：");
        else
        {
            System.out.println(num+"不是三位数，over。");
            return;
        }

        int ge=num%10;
        int shi=num/10%10;
        int bai=num/100%10;
        if(num==Math.pow(ge,3)+Math.pow(shi,3)+Math.pow(bai,3))
            System.out.println(num+"是水仙花数！");
        else
            System.out.println(num+"不是水仙花数！");
    }

    public static boolean judge(int num){
        if (num>=100&&num<=999)
            return true;
        return false;
    }
}
