package cn.improvecfan.po;

/**
 * Created by chengfan on 2016/11/29.
 */
public class Man extends Person {
    private Woman wife;
    private double money;

    @Override
    public void marry(Person p) {
        this.wife = (Woman)p;
        p.marry(this);
    }

    public void setMoney(Person p,double money) {
        if (p == this || p == this.wife)
            this.money = money;
        else
            System.out.println(p.getName()+"抢钱！");
    }

    public double getMoney() {
        return money;
    }
}
