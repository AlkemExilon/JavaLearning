package IO.input;

import java.io.FileInputStream;
import java.io.IOException;

//字节输入流测试，实现从外界文件读入内容到程序内
public class test1 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("F:\\tmp\\wdnmd.txt");

        //read方法演示，返回一个int型数字，实际上一次仅读一个字节，因此需要用循环来实现全部读取
        int i;
        while((i=fis.read())!=-1){
            //read方法默认返回一个字母ASCII码中对应的整数，因此可以用char来转换类型
            System.out.print((char)i);

            //第二行显示乱码因为是汉字，编码有问题
        }
        fis.close();
    }
}
