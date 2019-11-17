package com.day03;


public class DemoString {
    public static  void demo(){
        String str =  new String();
        char[] str1 = {'h',1};
        String str2 = new String(str1);
        byte[] str3 = {89};
        String str4 = new String(str3);
        String str5 = "h1";
        //字符串常量池  直接双引号写的就在常量池 相同==比较值则是true new string则重新new一个地址，相同==比较值为false
        //如果非要比较内容可用equals 区分大小写
        //equalsIgnoreCase 不区分大小写

        System.out.println(str5.equals(str2));
        System.out.println("H1".equals(str5));//区分大小写
        System.out.println("H1".equalsIgnoreCase(str5));//不区分大小写
    }
    public static void main(String[] args) {
       demo();
       String str="rei,dkfs,doer,owupur34";
       str.charAt(0);
        System.out.println(str.indexOf("e"));//查找
        System.out.println(str.substring(4,6));
        char[] chars = "ffgfg".toCharArray();//转字符数组
        System.out.println(chars[0]);
        byte[] bytes = "errerre".getBytes();//转字节
        System.out.println(bytes[0]);
        System.out.println(str.replace('e','*'));//替换
        String[] strings = str.split("\\,");//切割
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }
    }
}
