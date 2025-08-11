package file;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

//File类测试
public class test1 {
    public static void main(String[] args) {
        File f1=new File("F:\\tmp\\just test.txt");
        System.out.println("f1是文件夹吗："+f1.isDirectory());
        System.out.println("f1是文件吗："+f1.isFile());
        System.out.println("f1存在吗："+f1.exists());
        System.out.println("f1文件大小："+f1.length()+" Byte");//    length方法无法获取文件夹的大小！
        System.out.println("f1文件绝对路径："+f1.getAbsolutePath());
        System.out.println("f1文件名（带后缀）："+f1.getName());//   文件和文件夹的名字均可以获取

        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String str=sdf.format(f1.lastModified());
        System.out.println("f1文件最后修改时间："+str);//  lastModified返回的原本是从1970年开始的毫秒数
    }
}
