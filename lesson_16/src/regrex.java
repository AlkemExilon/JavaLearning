import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regrex {
    public static void main(String[] args) {

        //网课讲述的方法，可能更常用，直接用matches方法判断
        String p="\\d{12}";
        String num="123456789012";
        if(num.matches(p))
            System.out.println(num+"是12位数字");
        else
            System.out.println(num+"不是12位数字");

        //java的自带api，因为需要用到两个对象互相操作会比较麻烦，常用于java爬虫
        Pattern pat = Pattern.compile("1[1-9]\\d{9}");
        Matcher mat = pat.matcher("19305819385");
        System.out.println(mat.matches());
    }
}
