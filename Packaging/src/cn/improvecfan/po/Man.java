package cn.improvecfan.po;

/**
 * Created by chengfan on 2016/11/28.
 */
public class Man {
    public String name;
    public Woman wife;
    public double money;

    public void marry(Woman woman){
        this.wife = woman;
        woman.marry(this);
    }
}
