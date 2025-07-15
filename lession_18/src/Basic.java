import java.util.ArrayList;
import java.util.Scanner;
//基本查找案例
public class Basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]arr={1,2,3,114,514,114514,1919810,1919810,114514};
        ArrayList<Integer> list=getList(arr,n);
        System.out.println("数组arr中为"+n+"的元素索引为："+list);
    }

    public static ArrayList<Integer> getList(int[]arr,int n){
        ArrayList<Integer> result=new ArrayList<>();
        int index=0;
        for(int num:arr){
            if(num==n)
                result.add(index);
            index++;
        }
        return result;
    }
}
