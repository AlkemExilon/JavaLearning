import java.util.Scanner;
public class cashTransfer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();

        String result="";
        while(money>0){
            int ge=money%10;
            result=transfer(ge)+result;
            money/=10;
        }

        int count=7-result.length();
        for(int i=0;i<count;i++)
            result="零"+result;

        String[]arr={"佰","拾","万","仟","佰","拾","元"};
        for(int i=0;i<result.length();i++)
        {
            System.out.print(result.charAt(i)+arr[i]);
        }
    }

    public static String transfer(int num) {
        String[]s={"零","壹","贰","叁","肆","伍","陆","柒","捌","玖"};
        return s[num];
    }
}
