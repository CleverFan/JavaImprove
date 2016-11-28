package cn.improvecfan.po;

/**
 * Created by chengfan on 2016/11/28.
 */
public class Woman {
    public String name;
    public Man husband;

    public void marry(Man man){
        this.husband = man;
    }
}
