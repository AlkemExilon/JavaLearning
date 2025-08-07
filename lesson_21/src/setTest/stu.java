package setTest;

import java.util.Objects;

public class stu implements Comparable<stu>{
    private String name;
    private String sno;

    public stu() {}

    public stu(String name, String sno) {
        this.name = name;
        this.sno = sno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        stu stu = (stu) o;
        return Objects.equals(name, stu.name) && Objects.equals(sno, stu.sno);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sno);
    }

    @Override
    public String toString() {
        return "stu{" +
                "name='" + name + '\'' +
                ", sno='" + sno + '\'' +
                '}';
    }

    //实现Comparable接口进行指定比较规则
    @Override
    public int compareTo(stu s) {
        return name.compareTo(s.name);
    }

}
