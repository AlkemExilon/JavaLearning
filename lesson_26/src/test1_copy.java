import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//输入输出流综合测试，尝试拷贝文件
public class test1_copy {
    public static void main(String[] args) throws IOException {

        //参数是要拷贝读入的文件
        FileInputStream fis = new FileInputStream("D:\\Program Files (x86)\\Steam\\userdata\\1563101368\\760\\remote\\1850570\\screenshots\\20250716205723_1.jpg");

        //参数是要拷贝输出的地点，亲测如果output到一个txt文件里会出来一大串乱码
        FileOutputStream fos = new FileOutputStream("F:\\tmp\\copyTest\\sammyBoi.jpg");

        //进行循环读入和输出
        int num;
        while((num=fis.read())!=-1)
        {
            fos.write(num);
        }

        //释放资源
        fis.close();
        fos.close();
    }
}
