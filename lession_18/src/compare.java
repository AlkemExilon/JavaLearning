import java.util.Arrays;
import java.util.Comparator;

//有关Arrays类，包含的方法大多为静态方法所以允许直接调用
public class compare {
    public static void main(String[] args) {
        Integer[]arr={1,5,8,3,2,4,7,6,9};

        //sort默认是升序埃列
        Arrays.sort(arr);
        System.out.println("升序排列："+Arrays.toString(arr) );

        //想实现逆序排列，第二个参数中接口重写即可
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            //重写接口方法，o1是无序序列中遍历得到的元素，o2是有序序列中遍历得到的元素
            //o1-o2是升序，反之逆序
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        System.out.println("逆序排列："+Arrays.toString(arr));
    }
}
