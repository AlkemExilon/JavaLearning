package IO.output;

import java.io.FileOutputStream;
import java.io.IOException;

//字节输出流测试，File用于文件存取，IO流用于改写文件
public class test1 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("F:\\tmp\\just test.txt");
        fos.write(114514);//    write方法实现写入，如果程序运行完毕把写入内容改了再运行，会把之前写入的内容覆盖
        fos.close();//  解除文件资源占用
    }
}
