import java.util.Scanner;
//二分查找案例
public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int n = sc.nextInt();
        int index = binarySearch(arr,n);
        if(index==-1)
            System.out.println("数组arr中不存在"+n);
        else
            System.out.println("数组arr中存在"+n+"！其元素索引为"+index);
    }

    public static int binarySearch(int[]arr,int num){
        int min=0,max=arr.length-1;
        int index;
        while(min<=max){
            int mid=(min+max)/2;
            if(arr[mid]>num)
                max=mid-1;
            else if(arr[mid]<num)
                min=mid+1;
            else
                return mid;
        }
        return -1;
    }
}
