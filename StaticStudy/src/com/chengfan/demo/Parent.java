package com.chengfan.demo;

/**
 * @author chengfan
 * @create 2017-01-28 下午8:46
 */
public class Parent {
    static {
        System.out.println("父类静态代码块");
    }

    {
        System.out.println("父类构造代码块");
    }

    public Parent(){
        System.out.println("父类构造函数");
    }
}

class Children extends Parent {
    static {
        System.out.println("子类静态代码块");
    }
    {
        System.out.println("子类构造代码块");
    }
    public Children(){
        System.out.println("子类构造函数");
    }

    public static void main(String[] args) {
        new Children();
    }
}





