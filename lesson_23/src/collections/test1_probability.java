package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
//利用Collections工具类实现两组数组内容分别以30%和70%的概率可抽取到
public class test1_probability {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList();
        Collections.addAll(list, 1,1,1,1,1,1,1,0,0,0);//    30%+70%=100%
        Collections.shuffle(list);//    打乱顺序

        Random r=new Random();
        int num=list.get(r.nextInt(list.size()));

        ArrayList<String> boi=new ArrayList();
        ArrayList<String> man=new ArrayList();
        Collections.addAll(boi,"Edgar","Cernel");
        Collections.addAll(man,"DeadMachine","Alkem");

        if(num==1){
            int random=r.nextInt(boi.size());
            System.out.println(boi.get(random));
        }
        else {
            int random=r.nextInt(man.size());
            System.out.println(man.get(random));
        }
        //测试结果DeadMachine和Alkem很难抽出来，因为只有30%的概率
    }
}
