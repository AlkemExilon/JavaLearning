package file;

import java.io.File;

public class test3 {
    public static void main(String[] args) {
        File f1=new File("f:\\tmp");

        //listFiles方法可将一个文件夹内的内容转为File型数组，用于遍历
        File[] files=f1.listFiles();
        for (File file : files)
            System.out.println(file.getName());

        System.out.println("------------------");

        //如果只想遍历txt文件，可以用endswith方法筛选
        for(File file : files){
            if(file.getName().endsWith(".txt"))
                System.out.println(file.getName());
        }
    }
}
