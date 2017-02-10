package com.chengfan.demo;

/**
 * @author chengfan
 * @create 2017-01-31 下午10:14
 */
public class StaticPartAttr {

    public void test(){
        final int a ;
        final int b = 2;

        a = 3;
        //a = 4;  报错
        //b = 5;  报错
    }
}
