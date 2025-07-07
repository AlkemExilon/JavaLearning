import java.util.ArrayList;

public class arrayListContains {
    public static void main(String[] args) {
        ArrayList<user> list=new ArrayList<>();
        list.add(new user("AlkemExilon","114"));
        list.add(new user("Edgar","514"));
        System.out.println(contains(list,"AlkemExilon"));
        list.get(1);
    }
    public static int contains(ArrayList<user> list,String name) {
        int index=0;
        for(user u:list){
            if(u.getName().equals(name))
                return index;
            index++;
        }
        return -1;
    }
}

class user{
    private String name;
    private String id;

    public user(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}