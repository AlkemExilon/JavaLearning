import java.util.ArrayList;

//stream 初次测试
public class stream {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Alkem");
        list.add("Ak");
        list.add("Alpha");
        list.add("Cernel");
        list.add("Delta");

        list.stream().filter(name->name.startsWith("A")).forEach(System.out::println);
    }
}
