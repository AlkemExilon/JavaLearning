package 双列集合.TreeMapTest;

public class stu implements Comparable<stu>{
    private String name;
    private int age;

    public stu(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(stu o) {
        int res=this.age-o.age;
        res=res==0?this.name.compareTo(o.name):res;
        return res;
    }

    @Override
    public String toString() {
        return "name=" + name + ", age=" + age;
    }
}
