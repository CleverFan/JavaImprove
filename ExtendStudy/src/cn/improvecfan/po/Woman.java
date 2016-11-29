package cn.improvecfan.po;

/**
 * Created by chengfan on 2016/11/29.
 */
public class Woman extends Person{
    private boolean hasLongHair;
    private Man husband;

    @Override
    public void marry(Person p) {
        this.husband = (Man)p;
    }

}
