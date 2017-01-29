package com.chengfan.demo;

/**
 * @author chengfan
 * @create 2017-01-28 下午1:56
 */
public class StaticAttribute {
    public static int staticInt = 10;
    public static int staticIntNo ;
    public int nonStatic = 5;

    public static void main(String[] args) {
        StaticAttribute s = new StaticAttribute();

        System.out.println("s.staticInt= " + s.staticInt);
        System.out.println("StaticAttribute.staticInt= " + StaticAttribute.staticInt);

        System.out.println("s.staticIntNo= " + s.staticIntNo);
        System.out.println("StaticAttribute.staticIntNo= " + StaticAttribute.staticIntNo);

        System.out.println("s.nonStatic= " + s.nonStatic);

        System.out.println("使用s,让三个变量都+1");

        s.staticInt ++;
        s.staticIntNo ++;
        s.nonStatic ++;

        StaticAttribute s2 = new StaticAttribute();

        System.out.println("s2.staticInt= " + s2.staticInt);
        System.out.println("StaticAttribute.staticInt= " + StaticAttribute.staticInt);

        System.out.println("s2.staticIntNo= " + s2.staticIntNo);
        System.out.println("StaticAttribute.staticIntNo= " + StaticAttribute.staticIntNo);

        System.out.println("s2.nonStatic= " + s2.nonStatic);


    }
}
