package IO.output;

import java.io.FileOutputStream;
import java.io.IOException;

//字节输出流测试，有关写出字符和续写、换行
public class test2 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("F:\\tmp\\just test.txt");

        //利用getBytes方法实现
        byte[] bytes="我喜欢你".getBytes();
        fos.write(bytes);

        byte[] bytes1="\r\n".getBytes();//  实现换行
        fos.write(bytes1);
        fos.close();

        //若要实现续写而不是覆盖，就要给第二个参数传参
        FileOutputStream fos2 = new FileOutputStream("F:\\tmp\\just test.txt",true);
        byte[] bytes2="666这个入是桂".getBytes();
        fos2.write(bytes2);
        fos2.close();
    }
}
