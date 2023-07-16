package com.bjsxt.string;

public class test1 {
    public  static  void  main (String[] args )
    {
        System.out.println("字符串测试");
        String s1= new String("abcdef");
        String s2= "abcdef";
        String s3= "abcdef";

        System.out.println(s1 == s2);
       System.out.println(s2 == s3);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
    }

}

