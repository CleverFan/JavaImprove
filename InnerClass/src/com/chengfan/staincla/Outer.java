package com.chengfan.staincla;

/**
 * @author chengfan
 * @create 2017-02-11 下午7:58
 */

interface inter{
    void inter();
}

public class Outer {
    private int i = 1;
    public static String str = "str";

    static class StaClass implements inter{
        private String s = "s";
        static int j = 2;

        static int getInt(){
            //return i + j;
            return j;
        }

        private String getString(){
            return str + s;
        }

        @Override
        public void inter() {
            System.out.println("inter");
        }

        static class InStaClass{
            int x = 4;
            static int y = 5;
             static int getInt(){
                //return x; // x是非静态变量 不可以在静态方法中使用
                return y;
            }
        }
    }

    public inter getInter(){
        return new StaClass();
    }
}

class Test{
    public static void main(String[] args) {
        int a = Outer.StaClass.getInt();

        //Outer.StaClass.getString(); // getString()为非静态方法，不能这样调用

        int b = Outer.StaClass.InStaClass.getInt();

        System.out.println(a + "----" + b); // 输出 2----5

        //new Outer().new StaClass(); 编译失败 StaClass是静态的

        new Outer().getInter().inter(); // 输出 inter


    }
}
