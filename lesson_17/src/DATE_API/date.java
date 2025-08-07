package DATE_API;

import java.util.Date;

public class date {
    public static void main(String[] args) {

        //不传参直接创建对象会获得当前时间
        // 虽然底层其实就是获取当前时间再传给有参构造而已
        Date d = new Date();
        System.out.println("当前时间："+d);

        //传参后会输出传入时间，以1970年1月1日0点0分为起始计算指定时间
        Date certainTime=new Date(0);
        System.out.println("计算机时间原点："+certainTime);
        //getTime方法用于获取从时间原点开始的毫秒数
        System.out.println(certainTime.getTime());
    }
}
