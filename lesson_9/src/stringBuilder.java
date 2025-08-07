import java.util.Scanner;
import java.lang.StringBuilder;

public class stringBuilder {
    //StringBuilder类，允许改动字符串内容，减少内存开销和提升运行效率用
    //以下是一个判断是否为对称数字的案例
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        StringBuilder s=new StringBuilder();
        String result=s.append(str).reverse().toString();
        if(result.equals(str))
            System.out.println("是对称数");
        else
            System.out.println("不是对称数");
    }
}
