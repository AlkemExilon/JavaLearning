package DATE_API;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class sdf {
    //日期格式化类
    public static void main(String[] args) throws ParseException {

        //先创建sdf类，输入格式字符串
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();

        //用字符串接收由sdf格式化后返回的日期字符串
        // format方法会返回一个字符串
        String dateString = sdf.format(date);
        System.out.println("当前时间："+dateString);

        //接下来输入日期字符串转为Date类型
        String idkWatDate="2004年1月24日 00:00:00";
        SimpleDateFormat sdfNew = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date dateNew=sdfNew.parse(idkWatDate);
        System.out.println("生日（字符串转为Date类型）："+dateNew);
    }
}
