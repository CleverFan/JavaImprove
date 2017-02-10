package com.chengfan.stutea;

/**
 * @author chengfan
 * @create 2017-02-10 下午5:52
 */
public class Student extends Person implements TakeClass {

    @Override
    public void takeClass(String className) {
        System.out.println("take class: " + className);
    }

    @Override
    void eat() {
        System.out.println("student eat");
    }

    @Override
    void run() {
        System.out.println("student run");
    }
}
