package com.chengfan.reflect;

/**
 * @author chengfan
 * @create 2017-02-11 下午10:01
 */
public class Outer{
    //外部类私有数据域
    private int data=0;
    //内部类
    class Inner{
        void print(){
            //内部类访问外部私有数据域
            System.out.println(data);
        }
    }
}
