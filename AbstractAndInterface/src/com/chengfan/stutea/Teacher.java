package com.chengfan.stutea;

/**
 * @author chengfan
 * @create 2017-02-10 下午5:52
 */
public class Teacher extends Person implements Teach {

    @Override
    public void teach(String className) {
        System.out.println("teach " + className);
    }

    @Override
    void eat() {
        System.out.println("teacher eat");
    }

    @Override
    void run() {
        System.out.println("teacher run");
    }
}
