import java.util.StringJoiner;

public class stringJoiner {
    public static void main(String[] args) {
        String[]arr={"1","2","3","4","5"};
        StringJoiner sj=new StringJoiner(",","[","]");
        for (String i :arr) {
            sj.add(i);
        }
        System.out.println(sj);
    }
}
