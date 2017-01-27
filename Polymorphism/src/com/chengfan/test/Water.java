package com.chengfan.test;

/**
 * @author chengfan
 * @create 2017-01-26 下午6:00
 */
public class Water {
    public void showTem(){
        System.out.println("我的温度是: 0度");
    }
}

class IceWater extends Water {
    public void showTem(){
        System.out.println("我的温度是: 0度");
    }
}

class WarmWater extends Water {
    public void showTem(){
        System.out.println("我的温度是: 40度");
    }
}

class HotWater extends Water {
    public void showTem(){
        System.out.println("我的温度是: 100度");
    }
}

class TestWater{
    public static void main(String[] args) {
        Water w = new WarmWater();
        w.showTem();

        w = new IceWater();
        w.showTem();

        w = new HotWater();
        w.showTem();

    }
}


