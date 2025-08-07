import java.util.Arrays;
//简化格式真的巨你妈像javascript的箭头函数，或者说应该反过来讲？
public class lambdaTest {
    public static void main(String[] args) {
        String[]arr={"a","aa","aaa","aaaa"};

        //接下来使用lambda表达式进行逆序排列
        Arrays.sort(arr,(o1,o2)->o2.length()-o1.length());
        System.out.println(Arrays.toString(arr));
    }
}
