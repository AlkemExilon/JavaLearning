package 双列集合.HashMapTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class hashMapTest2 {
    public static void main(String[] args) {
        Random r=new Random();
        HashMap<String, Integer> map = new HashMap<>();

        String[]dest={"甲","乙","丙","丁"};
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0; i < 114; i++) {
            int index=r.nextInt(dest.length);
            list.add(dest[index]);
        }

        for(String s:list){
            if(map.containsKey(s)){
                int count=map.get(s)+1;
                map.put(s,count);
            }
            else{
                map.put(s,1);
            }
        }
        System.out.println(map);

        //接下来实现寻找票数最多的地点
        int max=0;
        for(String s:map.keySet()){
            if(map.get(s)>max)
                max=map.get(s);
        }
        System.out.print("票数最多的景点有"+max+"票，");

        //接下来实现打印票数最多的景点名
        for(Map.Entry<String,Integer> m:map.entrySet()){
            int vote=m.getValue();
            if(max==vote) {
                System.out.println("该地点是" + m.getKey());
                return;
            }
        }
    }
}
