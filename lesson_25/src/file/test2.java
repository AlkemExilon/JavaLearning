package file;

import java.io.File;
import java.io.IOException;
//File类测试2，测试如何利用File类创建文件和文件夹
public class test2 {
    public static void main(String[] args) throws IOException {
        File f1=new File("F:\\tmp\\wdnmd.txt");
        f1.createNewFile();

        File f2=new File("F:\\tmp\\dir");
        f2.createNewFile();//   createNewFile也可以创建只带文件夹的路径，只不过会创建一个不带后缀的空文件
        System.out.println(f2.mkdir());//   正常情况会输出False，因为要创建的文件夹和已有文件重名了

        //mkdir不常用因为仅限于创建一个单级文件夹，mkdirs可以创建单级和多级，虽然底层用的还是mkdir
        File f3=new File("F:\\tmp\\NewDir\\aaa\\bbb\\ccc");
        System.out.println(f3.mkdirs());//  注意，文件路径里不区分大小写！

        f1.delete();//  删除，文件会直接删除不走回收站，文件夹则会先判断是否为空
    }
}
