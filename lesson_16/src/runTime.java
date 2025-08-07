import java.io.IOException;

public class runTime {
    public static void main(String[] args) {

        //Runtime类在源码中的构造方法是私有的，因此无法通过new Runtime()来获取对应对象
        //但是Runtime类中有一个getRuntime()的静态方法，可以实现返回一个Runtime对象
        //因此可以通过类名调用静态方法来实现获取Runtime对象
        Runtime r=Runtime.getRuntime();

        //输出cpu线程数
        System.out.println(r.availableProcessors());
        //输出jvm可获取的最大内存空间
        System.out.println(r.maxMemory()/1024/1024/1024.0);
        //输出jvm目前获取的内存大小
        System.out.println(r.totalMemory()/1024/1024/1024.0);
        //输出jvm尾调用的内存大小
        System.out.println(r.freeMemory()/1024/1024/1024.0);

        //exec方法，执行cmd命令打开记事本
        try {
            r.exec("notepad");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
