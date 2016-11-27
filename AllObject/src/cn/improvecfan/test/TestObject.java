package cn.improvecfan.test;

import org.junit.Test;

/**
 * Created by chengfan on 2016/11/27.
 */
public class TestObject {
    @Test
    public void testString(){
        String s1 = "abc";
        String s2 = s1;
        String s3 = "abcd";
        System.out.println("s1 == s2: " + (s1 == s2));
        System.out.println("s1 == s3: " + (s1 == s3));
        System.out.println("s2 == s3: " + (s2 == s3));
        s1 = "abcd";

        System.out.println("s1 == s2: " + (s1 == s2));
        System.out.println("s1 == s3: " + (s1 == s3));
        System.out.println("s2 == s3: " + (s2 == s3));

    }

    @Test
    public void testString2(){
        String s1 = new String("abc");
        String s2 = s1;
        String s3 = new String("abc");


        System.out.println("s1 == s2: " + (s1 == s2));
        System.out.println("s1 == s3: " + (s1 == s3));
        System.out.println("s2 == s3: " + (s2 == s3));
        s1 = "abc";

        System.out.println("s1 == s2: " + (s1 == s2));
        System.out.println("s1 == s3: " + (s1 == s3));
        System.out.println("s2 == s3: " + (s2 == s3));
    }

    @Test
    public void testSwap(){
        int a = 2;
        int b = 3;
        swap(a,b);

        System.out.println("a=" + a + ";b=" + b);
    }

    private void swap(int a , int b){
        int temp = a ;
        a = b;
        b = temp;
    }

    @Test
    public void test(){
        Integer i = 10;
        Integer j = 10;

        System.out.println(i == j);

        Integer a = 500;
        Integer b = 500;

        System.out.println(a == b);
    }
}
