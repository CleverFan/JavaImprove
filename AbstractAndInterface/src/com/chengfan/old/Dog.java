package com.chengfan.old;

/**
 * @author chengfan
 * @create 2017-02-10 下午3:06
 */
public class Dog extends Animal {
    @Override
    public void move() {
        System.out.println("i can run");
    }
}

interface java8{
    default void test(){
        System.out.println("java 新特性");
    }
}


