package com.chengfan.demo;

/**
 * @author chengfan
 * @create 2017-01-31 下午9:19
 */
public class FinalMethod {
    public final void test(){

    }

    public void test(int i){

    }
}

class Test extends FinalMethod{

    //public void test(){}

    @Override
    public void test(int i) {
        super.test(i);
    }
    public void test(int i,int j) {

    }
}
