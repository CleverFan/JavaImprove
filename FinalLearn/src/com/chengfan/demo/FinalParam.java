package com.chengfan.demo;

/**
 * @author chengfan
 * @create 2017-01-31 下午9:29
 */
public class FinalParam {
    public void test(final int a ){
        //a = 10; 值不可以被修改
    }
    public void test(final Person p){
        //p = new Person("zhangbingxiao"); 引用本身不可以被修改
        p.setName("zhangbingxiao");  //引用所指向的对象可以被修改
        double a = Math.PI;
    }
}
