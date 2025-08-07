import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class javaCrawler {
    public static void main(String[] args) {
        //待爬取的字符串
        String str="java自95年问世以来经历众多版本，目前企业中流行版本为java8和java11，" +
                "两者都是长期支持版本，而下一个长期支持版本将是java17。";

        //待匹配用的正则表达式
        Pattern p=Pattern.compile("java\\d{0,2}");

        //匹配器，用于匹配 正则表达式 和 待匹配的字符串
        Matcher m=p.matcher(str);

        //循环输出匹配到的短语
        while(m.find()){
            System.out.println(m.group());
        }
    }
}
