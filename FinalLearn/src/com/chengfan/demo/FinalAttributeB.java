package com.chengfan.demo;

import java.util.Random;

/**
 * @author chengfan
 * @create 2017-01-31 下午8:25
 */
public class FinalAttributeB {
    private final String attribute_b;

    private final int attribute_c = new Random().nextInt();

    {
        attribute_b = "zhangbingxiao";
    }

    static {
        //attribute_b = "zhangbingxiao";
    }

//    public FinalAttributeB(String attribute_b){
//        this.attribute_b = attribute_b;
//    }

}
