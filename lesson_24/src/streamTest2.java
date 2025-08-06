import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Function;
import java.util.function.IntFunction;

//stream终结方法测试
public class streamTest2 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList();
        Collections.addAll(list,1,2,3,4,5);

        //toArray方法，用于实现将stream中数据塞进一个数组里
        Integer[]arr=list.stream().
                toArray(new IntFunction<Integer[]>() {
                    @Override
                    public Integer[] apply(int x) {
                        return new Integer[x];
                    }
                });
        System.out.println(Arrays.toString(arr));

        System.out.println("----------------------------------------");

        //简化表达
        Integer[]arr1=list.stream().
                toArray(x->new Integer[x]);
        System.out.println(Arrays.toString(arr1));
    }
}
