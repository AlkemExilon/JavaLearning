package IO.fileReader_Writer;

import java.io.FileReader;
import java.io.IOException;

//字符流测试，测试读入流
public class reader {
    public static void main(String[] args) throws IOException {
        FileReader fr1=new FileReader("F:\\tmp\\FileReader&Writer\\reader.txt");
        int len1;
        while((len1=fr1.read())!=-1){
            System.out.print((char)len1);
        }
        fr1.close();

        System.out.println();
        System.out.println("-----------------------");

        //如果嫌强转类型（也就是把int显式转为char）麻烦，可以用带参read方法进行转换，给read方法传入一个char数组
        //当然在操作之前，需要新建一个FileReader，因为原来的读取指针fr1已经抵达了文件末尾，无法继续读取
        FileReader fr2=new FileReader("F:\\tmp\\FileReader&Writer\\reader.txt");
        char[]arr=new char[114514];
        int len2;
        while((len2=fr2.read(arr))!=-1){
            System.out.println(new String(arr,0,len2));
        }
        fr2.close();
    }
}
