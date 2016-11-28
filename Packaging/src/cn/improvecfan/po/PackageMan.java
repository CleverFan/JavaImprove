package cn.improvecfan.po;

/**
 * Created by chengfan on 2016/11/28.
 */
public class PackageMan {
    private String name; //私有化名字
    private PackageWoman wife;//必须私有！！必须！
    private double money; //私有，统统私有！
    //我们先写个构造函数，为了方便
    public PackageMan(String name, double money) {
        this.name = name;
        this.money = money;
    }
    //结婚
    public void marry(PackageWoman woman){
        this.wife = woman;
        woman.marry(this);
    }

    //各种getter和setter
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public PackageWoman getWife() {
        return wife;
    }

    public double getMoney() {
        return money;
    }

//    public void setMoney(PackageMan man,double money) {
//        if (man == this) {
//            this.money = money;
//        } else {
//            System.out.println("喂，110吗？"+man.getName()+"抢钱！");
//        }
//    }

    public void setMoney(Object o,double money) {
        if (o == this || o == this.wife) {
            this.money = money;
        } else {
            System.out.println("喂，110吗？有人抢钱！");
        }
    }
}
