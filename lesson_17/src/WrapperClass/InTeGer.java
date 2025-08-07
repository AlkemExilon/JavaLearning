package WrapperClass;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Integer.valueOf;

public class InTeGer {
    public static void main(String[] args) {

        //用静态方法获取数值
        Integer num=valueOf(114514);
        System.out.println(num);

        //接下来演示拆装箱
        // 将114514作为基本类型数据传给num2时，会自动装箱为Integer对象
        Integer num2=114514;
        System.out.println(num2);
        //num和num2作为Integer对象参与运算时会自动拆箱，结果为int基本类型
        Integer num3=num+num2;
        System.out.println(num3);

        //Integer类型可以和Double、String等相互转换
        //不同包装类之间支持大部分的相互转换，除了Character类型
        int num4=Integer.parseInt("224524");
        boolean b=Boolean.parseBoolean("TRue");
        System.out.println("num4:"+num4+",   b:"+b);
        //小细节：经测试，在转换时“true”任意字母大小写不影响结果

        //因为互相转换的特性，加上nextint等输入方法有读取空格的弊端
        //可利用通过nextLine方法输入字符串，再转为Integer类型进行输出
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int num5=Integer.parseInt(str);
        System.out.println("Integer类型的num5:"+(++num5)+",   String类型的str:"+str);

        //以及，ArrayList仅支持装入引用类型数据，但如果有基本类型加入，会隐含地装箱！
        ArrayList<Integer> list=new ArrayList<>();
        //下面两条代码是理论等效的，一般更多使用前者因为实现了自动装箱
        list.add(19880102);
        list.add(Integer.valueOf(19880102));
    }
}
