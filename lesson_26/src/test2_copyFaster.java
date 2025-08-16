import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//IO流测试，基于read和write一次读写一个字节的速度太慢，接下来使用重载方法进行加速
public class test2_copyFaster {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\Program Files (x86)\\Steam\\userdata\\1563101368\\760\\remote\\1850570\\screenshots\\20250716205723_1.jpg");
        FileOutputStream fos=new  FileOutputStream("F:\\tmp\\copyTest\\sammyBoi_2.jpg");

        int len;
        byte[]arr=new byte[1024];
        while((len=fis.read(arr))!=-1){
            fos.write(arr,0,len);
        }

        fis.close();
        fos.close();
        //执行完毕会发现比上一次快太多了
        //因为这次给read方法传入的是一个byte数组，让read可以一次读写数组大小的内容而不是一个一个字节读写
        //同样的在write时也要传入数组，并指定读取大小，确保输出内容和读入内容一致
    }
}
