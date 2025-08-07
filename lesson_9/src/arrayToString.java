public class arrayToString {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        String s = arrayToString(arr);
        System.out.println(s);
    }
    public static String arrayToString(int[] arr) {
        String s="[";
        for (int i = 0; i < arr.length; i++) {
            if(i!=arr.length-1)
                s+=arr[i]+",";
            else
                s+=arr[i];
        }
        return s+"]";
    }
}
