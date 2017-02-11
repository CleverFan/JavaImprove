package com.chengfan.demo;

/**
 * @author chengfan
 * @create 2017-02-11 下午2:08
 */
public class Outer {
    private String a = "a";
    public int i = 1;

    class Inner{
        private String b = "b";
        public String c = "c";

        public int getInt(){
            return i; // 内部类可以访问外部类变量
        }

        private String getString(){
            return a + b + c; // 内部类可以访问外部类的private变量
        }

        public Outer getOuter(){
            return Outer.this; // .this指的是外部类的对象
        }
    }

    public String getParam(){
        Inner inner = new Inner();
        inner.b = "bb"; // 外部类可以访问内部类的private变量
        inner.c = "cc";
        return inner.getInt() + inner.getString();
    }
}

class Test {
    public static void main(String[] args) {
        Outer outer = new Outer();
        System.out.println(outer.getParam()); // 输出：1abbcc

        Outer.Inner oi = outer.new Inner();
        oi.c = "ccc";
        //oi.b = "bbb";  编译失败
        System.out.println(oi.getInt()); // 输出：1
        //System.out.println(oi.getString()); 编译失败
    }
}


