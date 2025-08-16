package IO.buffer;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

//缓冲输入流测试
public class in {
    public static void main(String[] args) throws IOException {
        //缓冲系列的构造函数中需要传入一个普通的输入输出流
        BufferedInputStream bis=new BufferedInputStream(new FileInputStream("F:\\tmp\\FileReader&Writer\\reader.txt"));
        int len;
        byte[]arr=new byte[114514];
        while((len=bis.read(arr))!=-1){
            System.out.print(new String(arr,0,len));
        }
        bis.close();
        //只需调用bis的close方法，无需调用fis的，因为bis的底层有关掉fis的代码
    }
}
