public class groupCatcher {
    public static void main(String[] args) {
        String s="我我我我我要要要要玩玩玩原原原原原原神神神神神!!!";
        String pattern="(.)\\1+";

        //第一个参数是正则表达式，第二个参数可以引用第一个参数的内容，用$可以引用正则表达式的分组
        String str=s.replaceAll(pattern,"$1");
        System.out.println(str);
    }
}
