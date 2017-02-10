package com.chengfan.demo;

/**
 * @author chengfan
 * @create 2017-01-31 下午9:41
 */
public class FinalStatic {
    private final static double PI = 3.14;
    private final static double E;
    //private final static double C ; //这里会报错

    static {
        E = 2.71;
    }

//    public FinalStatic(double c){
//        C = c;
//        //PI = C;   这里会报错
//    }
}
