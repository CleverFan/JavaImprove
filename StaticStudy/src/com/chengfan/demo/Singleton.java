package com.chengfan.demo;

/**
 * @author chengfan
 * @create 2017-01-28 下午6:22
 */
public class Singleton {
    private static Singleton singleton;

    public static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

    private Singleton() {
        
    }
}
