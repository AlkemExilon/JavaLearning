package IO.input;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

//字节输入流测试，实现从外界文件读入内容到程序内
public class test1 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("F:\\tmp\\wdnmd.txt");

        //read方法演示，返回一个int型数字，实际上一次仅读一个字节，因此需要用循环来实现全部读取
        int i;
        while((i=fis.read())!=-1){
            //read方法默认返回一个ASCII码中字符对应的整数，因此可以用char来转换类型
            System.out.print((char)i);
            //第二行显示乱码因为是汉字，字节流的读取方式不适合用于读入汉字，因为相当于只读了一半就进行解析
        }
        fis.close();
        System.out.println();

        System.out.println("-----------------------");

        //解决读入乱码的解决方案如下，引入字符流来应对汉字即可
        FileReader fr=new FileReader("F:\\tmp\\wdnmd.txt");
        int len;
        while((len=fr.read())!=-1){
            System.out.print((char)len);
            //这一次输出的不是乱码而是汉字，说明FileReader可以实现读入和正常解析汉字
        }
    }
}
