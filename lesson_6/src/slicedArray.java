import java.util.Scanner;

public class slicedArray {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6,7,8,9,10};
        int from=sc.nextInt();
        int to=sc.nextInt();
        int[]b=copyOfRange(arr,from,to);
        for(int i:b)
            System.out.println(i+" ");
    }
    public static int[] copyOfRange(int[]arr,int low,int high)
    {
        int []array=new int[high-low];
        int index=0;
        for(int i=low;i<high;i++) {
            array[index++]=arr[i];
        }
        return array;
    }
}
