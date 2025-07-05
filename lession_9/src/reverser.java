public class reverser {
    public static void main(String[] args) {
        String s="Alkem";
        String result=reverse(s);
        System.out.println(result);
    }
    public static String reverse(String str){
        String s="";
        for (int i = str.length()-1; i >= 0 ; i--) {
            char c=str.charAt(i);
            s+=c;
        }
        return s;
    }
}
