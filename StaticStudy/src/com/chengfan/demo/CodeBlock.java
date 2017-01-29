package com.chengfan.demo;

/**
 * @author chengfan
 * @create 2017-01-28 下午6:36
 */
public class CodeBlock {
    private int a = 1;
    private int b ;
    private int c ;

    static {
        System.out.println("我是静态代码块1");

    }

    {
        int a = 0;
        b = 2;
        System.out.println("普通代码块1");
    }

    public CodeBlock(){
        this.c = 3;
        System.out.println("构造函数");
    }

    public int add(){

        System.out.println("count a + b + c");
        return a + b + c;
    }

    static {
        System.out.println("我是静态代码块2，我什么也不做");
    }

    {
        System.out.println("普通代码块2");
    }
    public static void main(String[] args) {
        CodeBlock c = new CodeBlock();
        System.out.println(c.add());

        System.out.println();
        System.out.println("*******再来一次*********");
        System.out.println();

        CodeBlock c1 = new CodeBlock();
        System.out.println(c1.add());
    }

}
