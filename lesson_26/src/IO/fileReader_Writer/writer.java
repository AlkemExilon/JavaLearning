package IO.fileReader_Writer;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//字符流测试，测试写出流
public class writer {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("F:\\tmp\\FileReader&Writer\\writer.txt");
        FileReader fr = new FileReader("F:\\tmp\\FileReader&Writer\\reader.txt");

        int len;
        char[]arr=new char[100];
        while((len=fr.read(arr))!=-1){
            fw.write(arr,0,len);
        }
        //利用char数组直接写出，省的类型转换
        fw.close();
        fr.close();
    }
}
