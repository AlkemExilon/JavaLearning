package 双列集合.HashMapTest;

import java.util.HashMap;
import java.util.Set;

//HashMap测试
public class hashMapTest1 {
    public static void main(String[] args) {
        HashMap<stu, String> map = new HashMap<>();
        map.put(new stu("AlkemExilon",21),"我也不知道这啥");
        map.put(new stu("Edgar",22),"就当是凑数的吧");
        map.put(new stu("Cernel",19),"韭菜盒子贼击败好吃");
        map.put(new stu("DeadMachine",114514),"队友呢队友呢救一下啊");

        Set<stu> set = map.keySet();
        for(stu s:set)
            System.out.println("stuInfo:"+s+"  ; stuDep:"+map.get(s));

    }
}
