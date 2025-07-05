import java.util.Scanner;

public class arrayContains {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6,7,8,9};
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(!arrayContains(arr,num))
            System.out.println("不包含"+num);
        else
            System.out.println("包含"+num);
    }
    public static boolean arrayContains(int[] arr, int target) {
        for (int n:arr) {
            if(n==target)
                return true;
        }
        return false;
    }
}