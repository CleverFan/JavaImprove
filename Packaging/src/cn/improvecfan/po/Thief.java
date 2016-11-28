package cn.improvecfan.po;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chengfan on 2016/11/28.
 */
public class Thief {
    private double stealMoney = 0;
    private List<Woman> womens = new ArrayList<>();

    //偷钱
    public void stealMoney(Man man){
        stealMoney += man.money;
        man.money = 0;
        System.out.println("哈哈，偷到钱了");
    }
    //偷老婆，最可气的是，偷了你的老婆还把凤姐丢给了你
    public void stealWife(Man man){
        womens.add(man.wife);
        Woman woman = new Woman();
        woman.name = "凤姐";
        man.wife = woman;
        System.out.println("哈哈哈，又偷了一个妹纸");
    }
}
