public class max {

    public static void main(String[] args) {
        int[]arr={114,514,1919,810};
        int max=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("数组中最大数为"+max);
    }
}
